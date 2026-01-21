package com.quanlyphongtro.service;

import com.quanlyphongtro.dto.PhongDto;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface PhongService {
    List<PhongDto> getAllPhong();
    List<PhongDto> searchPhong(String maLoai, String trangThai);
    PhongDto getPhongBySoPhong(String soPhong);
    void savePhong(PhongDto dto);
    void deletePhong(String soPhong);
}
