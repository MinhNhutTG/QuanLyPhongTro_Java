package com.quanlyphongtro.service;

import com.quanlyphongtro.dto.PhongDto;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface PhongService {
    List<PhongDto> getAllPhong();
}
