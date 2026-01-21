package com.quanlyphongtro.repository;

import com.quanlyphongtro.models.HopDongThue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopDongThueRepository extends JpaRepository<HopDongThue,String> {
}
