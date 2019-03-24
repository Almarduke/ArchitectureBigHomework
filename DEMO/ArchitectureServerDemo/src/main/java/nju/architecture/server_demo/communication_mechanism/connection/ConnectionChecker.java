package nju.architecture.server_demo.communication_mechanism.connection;

public interface ConnectionChecker {

    boolean checkConnection(String senderPath, String receiverPath);
}
