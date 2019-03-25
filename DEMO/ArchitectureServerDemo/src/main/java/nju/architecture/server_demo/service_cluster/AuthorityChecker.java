package nju.architecture.server_demo.service_cluster;

public class AuthorityChecker {

    public boolean checkUserAuthority(long userId) {
        return true;
    }

    public boolean hasUserLogin(String token) {
        return true;
    }
}
