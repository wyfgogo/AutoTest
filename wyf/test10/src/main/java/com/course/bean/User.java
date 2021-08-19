package com.course.bean;


import lombok.Data;

@Data //代替setget方法，tostring，等
public class User {
    private String userName;
    private String password;
    private String name;
    private String age;
    private String sex;
}
