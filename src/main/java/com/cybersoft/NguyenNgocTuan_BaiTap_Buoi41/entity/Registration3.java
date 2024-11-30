package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "registration3")
public class Registration3 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration_id")
    private Long registrationId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student3 student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course3 course;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public Student3 getStudent() {
        return student;
    }

    public void setStudent(Student3 student) {
        this.student = student;
    }

    public Course3 getCourse() {
        return course;
    }

    public void setCourse(Course3 course) {
        this.course = course;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
}
