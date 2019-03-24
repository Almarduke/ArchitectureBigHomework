package nju.architecture.server_demo.communication_mechanism;

import lombok.Data;
import nju.architecture.server_demo.communication_mechanism.connection.ConnectionChecker;
import nju.architecture.server_demo.communication_mechanism.encryptor.Encryptor;

@Data
public class Message {

    private String senderPath;

    private String receiverPath;

    private Object data;

    private ConnectionChecker connectionChecker;

    private Encryptor encryptor;

    public boolean sendData() {
        System.out.println("data has been sent to receiver");
        return true;
    }

    public boolean isReceiverAvailable() {
        return true;
    }
}
