package nju.architecture.server_demo.communication_mechanism.validator;

public class ParityValidator implements Validator {
    @Override
    public boolean validateData(Object data) {
        System.out.println("Parity Validator Success");
        return true;
    }
}
