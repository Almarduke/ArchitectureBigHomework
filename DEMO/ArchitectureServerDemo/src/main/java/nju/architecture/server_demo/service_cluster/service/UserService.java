package nju.architecture.server_demo.service_cluster.service;

import nju.architecture.server_demo.database_cluster.entity.User;

public interface UserService {

    User getUserInfoById(long id);

    boolean login(String id, String password);

    long signUp(User user);

    boolean editUserInfo(User user);
}
