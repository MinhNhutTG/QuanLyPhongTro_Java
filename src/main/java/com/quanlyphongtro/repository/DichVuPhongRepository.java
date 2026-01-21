package com.quanlyphongtro.repository;

import com.quanlyphongtro.models.DichVuPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DichVuPhongRepository extends JpaRepository<DichVuPhong, Long> {
}
