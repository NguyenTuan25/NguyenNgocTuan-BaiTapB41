package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.controller;

import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.CourceCau2;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.StudentCau2;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository.CourseRepositoryCau2;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository.StudentRepositoryCau2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class StudentControllerCau2 {
    private final CourseRepositoryCau2 courseRepositoryCau2;
    private final StudentRepositoryCau2 studentRepositoryCau2;

    public StudentControllerCau2(CourseRepositoryCau2 courseRepositoryCau2, StudentRepositoryCau2 studentRepositoryCau2){
        this.courseRepositoryCau2 = courseRepositoryCau2;
        this.studentRepositoryCau2 = studentRepositoryCau2;
    }

    @GetMapping("/courses")
    public List<CourceCau2> getCoursesByDuration(@RequestParam("durationGreaterThan") int hours) {
        return courseRepositoryCau2.findByDurationGreaterThan(hours);
    }

    @GetMapping("/students2/search")
    public List<StudentCau2> searchStudentsByName(@RequestParam("name") String keyword) {
        return studentRepositoryCau2.findByNameContaining(keyword);
    }

    @GetMapping("/courses/count")
    public long countCourses() {
        return courseRepositoryCau2.countCourses();
    }
}
