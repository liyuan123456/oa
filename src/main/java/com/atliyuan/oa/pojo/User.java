package com.atliyuan.oa.pojo;

import lombok.Data;

import java.sql.Date;

/**
 * @author 黎源
 * @date 2020/1/7 15:48
 */
@Data
public class User {
    private int id;
    private String accountId;
    private String username;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
}
