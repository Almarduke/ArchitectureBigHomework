package nju.architecture.server_demo.database_cluster.dao.impl;

import nju.architecture.server_demo.database_cluster.dao.OrderDao;
import nju.architecture.server_demo.database_cluster.entity.Order;
import nju.architecture.server_demo.database_cluster.entity.User;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
    @Override
    public List<String> getOrdersByUserId(long userId) {
        return null;
    }

    @Override
    public boolean createOrder(Order order) {
        return false;
    }

    @Override
    public boolean deleteOrder(Order order) {
        return false;
    }

    @Override
    public boolean payForOrder(User user, Order order) {
        return false;
    }
}
