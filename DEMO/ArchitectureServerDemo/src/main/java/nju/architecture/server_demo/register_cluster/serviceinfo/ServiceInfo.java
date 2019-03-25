package nju.architecture.server_demo.register_cluster.serviceinfo;

import lombok.Data;

@Data
public class ServiceInfo {

    private long id;

    private String name;

    private String path;

    private Double serviceBalance;
}
