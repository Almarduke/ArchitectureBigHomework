package nju.architecture.server_demo.service_cluster.factory;

import nju.architecture.server_demo.database_cluster.dao.impl.UserDaoImpl;

public class DaoFactory {

    private static DaoFactory instance = new DaoFactory();

    private DaoFactory() {}

    public static DaoFactory getInstance() {
        return instance;
    }

    public Object getDao(String name) {
        return new UserDaoImpl();
    }
}
