package nju.architecture.server_demo.register_cluster;

import nju.architecture.server_demo.register_cluster.serviceinfo.ServiceInfo;

public interface ServiceListener {

    void register(ServiceInfo service);

    void listen(ServiceInfo service);
}
