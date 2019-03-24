package nju.architecture.server_demo.api_gateway;

import nju.architecture.server_demo.register_cluster.serviceinfo.ServiceInfo;

import java.util.ArrayList;
import java.util.List;

public class ServiceCache {

    private List<ServiceInfo> serviceCacheList = new ArrayList<>();

    public ServiceInfo getPath(String serviceName) {
        return new ServiceInfo();
    }

    public boolean addToServiceCache(ServiceInfo service) {
        serviceCacheList.add(service);
        return true;
    }
}
