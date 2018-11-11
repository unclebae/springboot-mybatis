package com.example.mybatis.demomybatis.test;


import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("test")
public class Test {
    private Long id;
    private String name;
    private String address;
    private LocalDateTime createdAt;

    public Test() {
    }

    public Test(String name, String address, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}