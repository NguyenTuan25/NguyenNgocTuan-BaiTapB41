package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository;

import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
