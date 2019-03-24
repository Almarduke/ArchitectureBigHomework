package nju.architecture.server_demo.api_gateway.controllers;

import nju.architecture.server_demo.api_gateway.RPCProxy;
import nju.architecture.server_demo.database_cluster.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private RPCProxy proxy;

    @GetMapping(value = "/getUserInfoById")
    public User getUserInfoById(@RequestParam long id) {
        return new User();
    }

    @PostMapping(value = "/login")
    public boolean login(@RequestParam String id, @RequestParam String password) {
        return true;
    }

    @PostMapping(value = "/signUp")
    public long signUp(@RequestParam User user) {
        return 1232432532534L;
    }

    @PutMapping(value = "/editUserInfo")
    public boolean editUserInfo(@RequestParam User user) {
        return true;
    }
}
