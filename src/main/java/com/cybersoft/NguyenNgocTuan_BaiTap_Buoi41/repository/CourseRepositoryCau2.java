package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository;

import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.CourceCau2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepositoryCau2 extends JpaRepository<CourceCau2, Long>{
    @Query("SELECT c FROM CourceCau2  c WHERE c.duration > :hours")
    List<CourceCau2> findByDurationGreaterThan(@Param("hours") int hours);

    @Query("SELECT COUNT(c) FROM CourceCau2  c")
    long countCourses();
}
