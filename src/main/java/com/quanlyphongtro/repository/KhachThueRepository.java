package com.quanlyphongtro.repository;

import com.quanlyphongtro.models.KhachThue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachThueRepository extends JpaRepository<KhachThue, Long> {
}
