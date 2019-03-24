package nju.architecture.server_demo.register_cluster;

import lombok.Data;
import nju.architecture.server_demo.register_cluster.serviceinfo.ServiceInfo;

import java.util.List;

@Data
public class ServiceNode implements ServiceListener, ServiceDispatcher, NodeSynchronizer {

    public static ServiceNode leader;

    private long id;

    private List<ServiceInfo> serviceList;

    private List<ServiceNode> followerList;

    @Override
    public void register(ServiceInfo service) {
        serviceList.add(service);
    }

    @Override
    public void listen(ServiceInfo service) {
        System.out.println("do service listen");
    }

    @Override
    public ServiceInfo dispatchService(String name) {
        return new ServiceInfo();
    }

    @Override
    public boolean electLeader() {
        if (followerList == null) {
            return this.id > 50;
        }

        for (ServiceNode follower: followerList) {
            if (follower.electLeader()) {
                ServiceNode.leader = follower;
                return true;
            }
        }
        return false;
    }

    @Override
    public void syncService(List<ServiceInfo> serviceList) {
        ServiceNode.leader.setServiceList(serviceList);
    }
}
