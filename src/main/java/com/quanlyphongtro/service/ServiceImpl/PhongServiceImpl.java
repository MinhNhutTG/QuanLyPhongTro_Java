package com.quanlyphongtro.service.ServiceImpl;

import com.quanlyphongtro.dto.PhongDto;
import com.quanlyphongtro.repository.PhongRepository;
import com.quanlyphongtro.service.PhongService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhongServiceImpl implements PhongService {

    private final PhongRepository phongRepository;

    public PhongServiceImpl(PhongRepository phongRepository) {
        this.phongRepository = phongRepository;
    }

    @Override
    public List<PhongDto> getAllPhong() {
        return phongRepository.findAll()
                .stream()
                .map(p -> new PhongDto(
                        p.getSoPhong(),
                        p.getLoaiPhong().getTenLoai(),
                        p.getLoaiPhong().getGia(),
                        p.getTrangThai()
                ))
                .collect(Collectors.toList());
    }
}
