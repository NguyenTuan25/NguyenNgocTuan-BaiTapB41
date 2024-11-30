package com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.repository;

import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Course3;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Registration3;
import com.cybersoft.NguyenNgocTuan_BaiTap_Buoi41.entity.Student3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Registration3Repository extends JpaRepository<Registration3, Long> {
    List<Registration3> findByStudent3(Student3 student3);
    List<Registration3> findByCourse3(Course3 course3);
}
