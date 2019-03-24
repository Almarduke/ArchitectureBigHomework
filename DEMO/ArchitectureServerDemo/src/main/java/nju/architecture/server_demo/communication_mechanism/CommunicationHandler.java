package nju.architecture.server_demo.communication_mechanism;

import nju.architecture.server_demo.communication_mechanism.validator.Validator;

import java.util.Queue;

public class CommunicationHandler {

    private Queue<Message> priorityQueue;

    private Validator validator;

    public boolean sendMessage(String sendPath, String receiverPath, Object data) {
        Message message = new Message();
        message.setSenderPath(sendPath);
        message.setReceiverPath(receiverPath);
        message.setData(data);
        if (isDataValid(message)) {
            priorityQueue.add(message);
            priorityQueue.element().sendData();
            return true;
        } else {
            return false;
        }
    }

    public Object receiveMessage(String sendPath, String receiverPath, Object data) {
        return priorityQueue.element().getData();
    }

    private boolean isDataValid(Message message) {
        return true;
    }
}
