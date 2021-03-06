package com.guotianchain.zubaobei.eurekaserviceprovider.entity;

import java.io.Serializable;

public class Person implements Serializable {

    private String id;

    private String name;

    private int sex;

    public Person(String id, String name, int sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
