package nju.architecture.server_demo.register_cluster;

import nju.architecture.server_demo.register_cluster.serviceinfo.ServiceInfo;

public interface ServiceDispatcher {

    ServiceInfo dispatchService(String name);
}
