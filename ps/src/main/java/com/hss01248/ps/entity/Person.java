package com.hss01248.ps.entity;

/**
 * Created by Administrator on 2017/7/13.
 */
public class Person {

    /**
     * 唯一标识
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 描述
     */
    private String description; //省略Getter和Setter
     @Override
     public String toString() {
         return "Person{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", description='" + description + '\'' + '}';
     }


}
