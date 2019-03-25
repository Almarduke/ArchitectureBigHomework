package nju.architecture.server_demo.database_cluster.entity;

import lombok.Data;

import java.util.List;

@Data
public class Cinema {

    private long id;

    private String name;

    private String address;

    private List<String> seatList;

    private List<Movie> movieList;

}
