package nju.architecture.server_demo.database_cluster.entity;

import lombok.Data;

@Data
public class Post {

    private long id;

    private long movieId;

    private long userId;

    private long goodNum;

    private long badNum;

    private String content;

}
