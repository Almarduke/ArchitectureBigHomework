package nju.architecture.server_demo.api_gateway;

import nju.architecture.server_demo.database_cluster.entity.User;
import nju.architecture.server_demo.register_cluster.serviceinfo.ServiceInfo;

public class RPCProxy {

    private ServiceCache serviceCache;

    public Object callService(String path) {
        loadBalance();
        System.out.println("do some call");
        return new User();
    }

    public ServiceInfo getServicePath(String serviceName) {
        ServiceInfo serviceInfo = serviceCache.getPath(serviceName);
        if (serviceInfo == null) {
            System.out.println("get Service Info from register cluster");
            serviceCache.addToServiceCache(new ServiceInfo());
            serviceInfo = serviceCache.getPath(serviceName);
        }
        return serviceInfo;
    }

    private void loadBalance() {
        System.out.println("do load balance");
    }
}
