package nju.architecture.server_demo.api_gateway;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestFilter extends GenericFilterBean implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setHeader("Access-Control-Allow-Methods", "*");
        httpResponse.setHeader("Access-Control-Allow-Headers", "*");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "false");
        httpResponse.setHeader("Access-Control-Max-Age", "3600");

        System.out.println("********** CORS Configuration Completed **********");

        if (isValidPath(request)) {
            System.out.println("Valid Access permitted");
        } else {
            System.out.println("Invalid Access denied");
        }

        System.out.println("Access Control success");
        chain.doFilter(request, response);
    }

    private boolean isValidPath(ServletRequest request) {
        return true;
    }
}
