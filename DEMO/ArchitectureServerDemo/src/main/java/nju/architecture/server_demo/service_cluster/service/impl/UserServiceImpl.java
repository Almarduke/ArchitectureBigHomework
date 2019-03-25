package nju.architecture.server_demo.service_cluster.service.impl;

import nju.architecture.server_demo.database_cluster.entity.User;
import nju.architecture.server_demo.service_cluster.ConcreteServiceImpl;
import nju.architecture.server_demo.service_cluster.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ConcreteServiceImpl implements UserService {
    @Override
    public User getUserInfoById(long id) {
        return null;
    }

    @Override
    public boolean login(String id, String password) {
        return false;
    }

    @Override
    public long signUp(User user) {
        return 0;
    }

    @Override
    public boolean editUserInfo(User user) {
        return false;
    }
}
