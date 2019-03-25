package nju.architecture.server_demo.service_cluster.service;

import nju.architecture.server_demo.database_cluster.entity.Order;

import java.util.List;

public interface OrderService {

    long addOrder(Order order);

    boolean payForOrder(Order order);

    boolean cancelOrder();

    List<Order> getOrderList(long userId);
}
