package nju.architecture.server_demo.database_cluster.enums;

import lombok.Getter;

@Getter
public enum OrderStatus {
    TOPAY(0, "未支付"),
    PAYED(1, "已支付"),
    CANCELLED(2, "已取消")
    ;

    private Integer code;

    private String description;

    OrderStatus(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
}
