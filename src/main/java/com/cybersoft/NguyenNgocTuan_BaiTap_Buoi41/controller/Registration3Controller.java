package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.controller;

import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Course3;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Student3;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.service.Registration3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api3")
public class Registration3Controller {
    @Autowired
    private Registration3Service registration3Service;

    @PostMapping("/students3/{studentId}/courses3")
    public ResponseEntity<String> addCoursesToStudent(
            @PathVariable Long studentId,
            @RequestBody List<Long> courseIds) {
        registration3Service.AddCoursesToStudent(studentId, courseIds);
        return ResponseEntity.status(HttpStatus.CREATED).body("Courses added successfully");
    }

    @GetMapping("/students3/{studentId}/courses3")
    public ResponseEntity<List<Course3>> getCoursesForStudent(@PathVariable Long studentId) {
        List<Course3> courses = registration3Service.getCoursesForStudent(studentId);
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/courses3/{courseId}/students3")
    public ResponseEntity<List<Student3>> getStudentsForCourse(@PathVariable Long courseId) {
        List<Student3> students = registration3Service.getStudentsForCourse(courseId);
        return ResponseEntity.ok(students);
    }
}
