package edu.patronesdiseno.srp.controllers.impl;

import edu.patronesdiseno.srp.config.Paths;
import edu.patronesdiseno.srp.controllers.OrderController;
import edu.patronesdiseno.srp.models.Auto;
import edu.patronesdiseno.srp.models.Delivery;
import edu.patronesdiseno.srp.models.Moto;
import edu.patronesdiseno.srp.models.Order;
import edu.patronesdiseno.srp.models.impl.OrderItemInternet;
import edu.patronesdiseno.srp.models.interfaces.IDiscount;
import edu.patronesdiseno.srp.models.interfaces.IOrderItem;
import edu.patronesdiseno.srp.models.patterns.*;
import edu.patronesdiseno.srp.repositories.OrderRepository;
import edu.patronesdiseno.srp.utils.OrderCourierDispatcher;

import io.javalin.http.Context;
import io.javalin.core.PathSegment.Normal;
import io.javalin.http.BadRequestResponse;
import io.javalin.http.NotFoundResponse;

import java.util.ArrayList;
import java.util.List;

//import org.bson.types.ObjectId;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpStatus;

public class OrderControllerImpl implements OrderController {
    
    private static final String ID = "id";
    private OrderRepository orderRepository;

    public OrderControllerImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void create(Context context) {
        Order order = context.bodyAsClass(Order.class);

        //if (order.getId() != null) {
        //    throw new BadRequestResponse(String.format("Unable to create a new order with existing id: %s", order));
        //}

        OrderCourierDispatcher orderCourierDispatcher = new OrderCourierDispatcher(order);
        String bestCourier = orderCourierDispatcher.getBestCourier();
        order.setCourier(bestCourier);

        List<IOrderItem> items = new ArrayList<>();
        OrderItemInternet oi1 = new OrderItemInternet( "P01010034", 1, 400.90);
        OrderItemInternet oi2 = new OrderItemInternet( "P01010025", 1, 600.90);
        items.add(oi1);
        items.add(oi2);
        order.setOrderItems(items);

        DiscountFactory factoryDiscount = new DiscountFactory();
        IDiscount discount = factoryDiscount.createDiscount(DiscountFactory.DISCOUNT_COUPON);
        //IDiscount discount = factoryDiscount.createDiscount(DiscountFactory.DISCOUNT_ANNIVERSARY);
        //IDiscountFactory factoryDiscount = new CouponDiscountFactory();
        //IDiscount discount = factoryDiscount.createDiscount();

        order.calculateTotalOrder(discount);

        // implementando el Patron Bridge
        Moto moto1 = new Moto();
        FastOrder fOrder = new FastOrder();
        fOrder.setTransporte(moto1);
        System.out.println(fOrder.calculaTiempoLlegada());

        System.out.println("Log Status Order");
        OrderedState ordered = new OrderedState();
        fOrder.setState(ordered);
        fOrder.printStatus();
        fOrder.nextState();
        fOrder.printStatus();
        fOrder.nextState();
        fOrder.printStatus();


        // pregunta 1
        System.out.println("----------------------------PREGUNTA 1-----------------------      ");
        Auto auto1 = new Auto();
        NormalOrder nOrder = new NormalOrder();
        nOrder.setVehiculo(auto1);
        System.out.println(nOrder.detalleVehiculo());

        System.out.println("Log Status Order - question1");
        OrderedState ordered1 = new OrderedState();
        nOrder.setState(ordered1);
        nOrder.printStatus();
        nOrder.nextState();
        nOrder.printStatus();
        nOrder.nextState();
        nOrder.printStatus();


        // pregunta 2
        System.out.println("----------------------------PREGUNTA 2-----------------------      ");
        fOrder.sethasDelivery(false);
        //Pregunta 2
        System.out.println("Log Status new Order - question2");
        OrderedState ordereds = new OrderedState();
        fOrder.setState(ordereds);
        fOrder.printStatus();
        fOrder.nextState();
        fOrder.printStatus();
        fOrder.nextState();
        fOrder.printStatus();   

        
        // fOrder.nextState();
        // fOrder.printStatus();
        // fOrder.nextState();
        // fOrder.printStatus();


        
        orderRepository.create(order);

        context.status(HttpStatus.CREATED_201)
                .header(HttpHeader.LOCATION.name(), Paths.formatPostLocation(order.getId().toString()));

        HomeDeliveryBuilder deliveryBuilder = new HomeDeliveryBuilder(order.getId());
        Delivery deliveryHome = deliveryBuilder.withAddress(order.getAddress())
            .withReceptionPersonName("Juan Perez")
            .withReceptionPersonPhone("5454666")
            .withSchedule("tarde")
            .withDate("07-07-2020")
            .build();
        System.out.println("Delivery: " + deliveryHome);
    }

    public void find(Context context) {
        String id = context.pathParam(ID);
        Order order = orderRepository.find(id);

        if (order == null) {
            throw new NotFoundResponse(String.format("A order with id '%s' is not found", id));
        }
        context.json(order);
    }

    public void findAll(Context context) {
        context.json(orderRepository.findAll());
    }
    
    @Override
    public void delete(Context context) {
        orderRepository.delete(context.pathParam(ID));
    }

    @Override
    public void update(Context context) {
        Order order = context.bodyAsClass(Order.class);
        String id = context.pathParam(ID);

        if (order.getId() != null && !order.getId().toString().equals(id)) {
            throw new BadRequestResponse("Id update is not allowed");
        }
        orderRepository.update(order, id);
    }
}