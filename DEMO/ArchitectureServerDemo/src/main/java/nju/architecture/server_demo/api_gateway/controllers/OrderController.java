package nju.architecture.server_demo.api_gateway.controllers;

import nju.architecture.server_demo.api_gateway.RPCProxy;
import nju.architecture.server_demo.database_cluster.entity.Order;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private RPCProxy proxy;

    @PostMapping(value = "/addOrder")
    public long addOrder(@RequestParam Order order) {
        return 1232324345L;
    }

    @PutMapping(value = "/payForOrder")
    public boolean payForOrder(@RequestParam Order order) {
        return true;
    }

    @PutMapping(value = "/cancelOrder")
    public boolean cancelOrder() {
        return true;
    }

    @GetMapping(value = "/getOrderList")
    public List<Order> getOrderList(@RequestParam long userId) {
        return new ArrayList<>();
    }
}
