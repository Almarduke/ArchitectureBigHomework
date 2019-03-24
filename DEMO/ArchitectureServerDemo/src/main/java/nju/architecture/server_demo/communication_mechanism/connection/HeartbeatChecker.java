package nju.architecture.server_demo.communication_mechanism.connection;

public class HeartbeatChecker implements ConnectionChecker {
    @Override
    public boolean checkConnection(String senderPath, String receiverPath) {
        System.out.println("do heartbeat check");
        return true;
    }
}
