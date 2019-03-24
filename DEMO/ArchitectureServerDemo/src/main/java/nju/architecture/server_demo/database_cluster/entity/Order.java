package nju.architecture.server_demo.database_cluster.entity;

import lombok.Data;
import nju.architecture.server_demo.database_cluster.enums.OrderStatus;

import java.util.Date;
import java.util.List;

@Data
public class Order {

    private long id;

    private long movieId;

    private long userId;

    private long cinemaId;

    private List<String> seatList;

    private String description;

    private Date time;

    private Double money;

    private int status = OrderStatus.TOPAY.getCode();
}
