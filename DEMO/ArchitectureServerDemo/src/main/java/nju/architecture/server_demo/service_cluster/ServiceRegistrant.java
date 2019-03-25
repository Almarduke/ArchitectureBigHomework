package nju.architecture.server_demo.service_cluster;

import nju.architecture.server_demo.register_cluster.ServiceListener;
import nju.architecture.server_demo.register_cluster.ServiceNode;
import nju.architecture.server_demo.register_cluster.serviceinfo.ServiceInfo;

public class ServiceRegistrant {

    public boolean registerService(ServiceInfo service) {
        ServiceListener listener = ServiceNode.leader;
        listener.register(service);
        return true;
    }

    public boolean updateService(ServiceInfo service) {
        ServiceListener listener = ServiceNode.leader;
        listener.listen(service);
        return true;
    }
}
