package nju.architecture.server_demo.api_gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestFilter extends GenericFilterBean implements Filter {

    private SecurityChecker securityChecker = new SecurityChecker();

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

        securityChecker.flowControl(null);
        securityChecker.isValidPath(request.getLocalAddr());

        chain.doFilter(request, response);
    }
}
