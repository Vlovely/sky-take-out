package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

    private String password;

    private String createTime;

    private String updateTime;

    private String createUser;

    private String updateUser;

    private String status;

}
