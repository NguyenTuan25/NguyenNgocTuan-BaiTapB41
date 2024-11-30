package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.service;

import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Student;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent (Student student){
        return studentRepository.save(student);
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    public Student updateStudent(long id, Student studentDetails) {
        return studentRepository.findById(id).map(student -> {
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            student.setAge(studentDetails.getAge());
            return studentRepository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }
}
