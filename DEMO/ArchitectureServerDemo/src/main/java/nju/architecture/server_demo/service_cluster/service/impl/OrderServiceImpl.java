package nju.architecture.server_demo.service_cluster.service.impl;

import nju.architecture.server_demo.database_cluster.entity.Order;
import nju.architecture.server_demo.external_interface.ExternalInterface;
import nju.architecture.server_demo.service_cluster.ConcreteServiceImpl;
import nju.architecture.server_demo.service_cluster.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl extends ConcreteServiceImpl implements OrderService {

    @Autowired
    private ExternalInterface thirdPartyPayment;

    @Override
    public long addOrder(Order order) {
        return 0;
    }

    @Override
    public boolean payForOrder(Order order) {
        return false;
    }

    @Override
    public boolean cancelOrder() {
        return false;
    }

    @Override
    public List<Order> getOrderList(long userId) {
        return null;
    }
}
