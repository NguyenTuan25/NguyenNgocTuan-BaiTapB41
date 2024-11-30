package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "students2")
public class StudentCau2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
