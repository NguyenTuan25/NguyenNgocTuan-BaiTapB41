package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository;

import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Student;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.StudentCau2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepositoryCau2 extends JpaRepository<StudentCau2, Long> {
    @Query("SELECT s FROM StudentCau2 s WHERE s.name LIKE %:keyword%")
    List<StudentCau2> findByNameContaining(@Param("keyword") String keyword);
}
