package nju.architecture.server_demo.api_gateway;

import org.springframework.http.HttpRequest;

public class SecurityChecker {

    public boolean flowControl(HttpRequest request) {
        System.out.println("flow Control ran");
        return true;
    }

    public boolean isValidPath(String path) {
        System.out.println("This path is valid and available: " + path);
        return true;
    }
}
