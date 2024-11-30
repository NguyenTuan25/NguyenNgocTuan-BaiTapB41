package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity;

import jakarta.persistence.*;
import jakarta.servlet.Registration;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students3")
public class Student3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Registration3> registrations = new ArrayList<>();

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Registration3> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration3> registrations) {
        this.registrations = registrations;
    }
}
