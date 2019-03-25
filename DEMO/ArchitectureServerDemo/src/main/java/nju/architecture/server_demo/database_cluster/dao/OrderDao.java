package nju.architecture.server_demo.database_cluster.dao;

import nju.architecture.server_demo.database_cluster.entity.Order;
import nju.architecture.server_demo.database_cluster.entity.User;

import java.util.List;

public interface OrderDao {

    List<String> getOrdersByUserId(long userId);

    boolean createOrder(Order order);

    boolean deleteOrder(Order order);

    boolean payForOrder(User user, Order order);
}
