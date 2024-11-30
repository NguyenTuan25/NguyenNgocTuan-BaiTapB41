package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.service;

import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Course3;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Registration3;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Student3;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository.Course3Repository;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository.Registration3Repository;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository.Student3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Registration3Service {
    @Autowired
    private Student3Repository student3Repository;

    @Autowired
    private Course3Repository course3Repository;

    @Autowired
    private Registration3Repository registration3Repository;

    public void AddCoursesToStudent(Long studentId, List<Long> courseIds){
        Student3 student3 = student3Repository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        for (Long courseId : courseIds){
            Course3 course3 = course3Repository.findById(courseId)
                    .orElseThrow(() -> new RuntimeException("Course not found"));

            Registration3 registration3 = new Registration3();

            registration3.setStudent(student3);
            registration3.setCourse(course3);
            registration3.setRegistrationDate(LocalDateTime.now());
            registration3Repository.save(registration3);
        }
    }

    public List<Course3> getCoursesForStudent(Long studentId){
        Student3 student3 =student3Repository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        List<Registration3> registration3s = registration3Repository.findByStudent3(student3);

        return registration3s.stream()
                .map(Registration3::getCourse)
                .collect(Collectors.toList());
    }

    public List<Student3> getStudentsForCourse(Long courseId) {
        Course3 course3 = course3Repository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        List<Registration3> registrations = registration3Repository.findByCourse3(course3);

        return registrations.stream()
                .map(Registration3::getStudent)
                .collect(Collectors.toList());

    }
}
