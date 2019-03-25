package nju.architecture.server_demo.register_cluster;

import nju.architecture.server_demo.register_cluster.serviceinfo.ServiceInfo;

import java.util.List;

public interface NodeSynchronizer {

    boolean electLeader();

    void syncService(List<ServiceInfo> serviceList);
}
