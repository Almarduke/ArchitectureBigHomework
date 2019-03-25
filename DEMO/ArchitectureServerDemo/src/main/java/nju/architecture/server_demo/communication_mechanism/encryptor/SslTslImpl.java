package nju.architecture.server_demo.communication_mechanism.encryptor;

public class SslTslImpl implements Encryptor {
    @Override
    public Object encryptData(Object data) {
        System.out.println("data encrypted");
        return new Object();
    }
}
