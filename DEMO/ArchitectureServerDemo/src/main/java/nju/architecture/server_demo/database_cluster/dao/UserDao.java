package nju.architecture.server_demo.database_cluster.dao;

import nju.architecture.server_demo.database_cluster.entity.User;

public interface UserDao {

    User getUserById(long id);

    boolean createUser(User user);

    boolean updateUser(User user);
}
