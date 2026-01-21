package com.quanlyphongtro.repository;

import com.quanlyphongtro.models.ChiTietHopDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietHopDongRepository extends JpaRepository<ChiTietHopDong, Long> {
}
