package nju.architecture.server_demo.api_gateway;

import nju.architecture.server_demo.register_cluster.ServiceNode;

public class ServiceChecker {

    public boolean receiveHeartbeat() {
        ServiceNode.leader.sendHeartbeat();
        System.out.println("receive heartbeat from register cluster");
        return true;
    }
}
