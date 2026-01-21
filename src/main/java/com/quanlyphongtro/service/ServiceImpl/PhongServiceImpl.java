package com.quanlyphongtro.service.ServiceImpl;

import com.quanlyphongtro.dto.PhongDto;
import com.quanlyphongtro.models.LoaiPhong;
import com.quanlyphongtro.models.Phong;
import com.quanlyphongtro.repository.LoaiPhongRepository;
import com.quanlyphongtro.repository.PhongRepository;
import com.quanlyphongtro.service.PhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhongServiceImpl implements PhongService {
    @Autowired
    private  PhongRepository phongRepository;
    @Autowired
    private LoaiPhongRepository loaiPhongRepository;

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

    @Override
    public List<PhongDto> searchPhong(String maLoai, String trangThai) {
        List<Phong> list = phongRepository.findAll();

        return list.stream()
                .filter(p -> maLoai.equals("Tất cả") || p.getLoaiPhong().getMaLoai().equals(maLoai))
                .filter(p -> trangThai.equals("Tất cả") || p.getTrangThai().equals(trangThai))
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public PhongDto getPhongBySoPhong(String soPhong) {
        return null;
    }

    @Override
    public void savePhong(PhongDto dto) {
        Phong phong = new Phong();
        phong.setSoPhong(dto.getSoPhong()); // PK
        phong.setTrangThai(dto.getTrangThai());
        phong.setGhiChu(dto.getGhiChu());

        // Tìm loại phòng từ DB để set quan hệ
        LoaiPhong loai = loaiPhongRepository.findById(dto.getMaLoai())
                .orElseThrow(() -> new RuntimeException("Loại phòng không tồn tại"));
        phong.setLoaiPhong(loai);

        phongRepository.save(phong);
    }

    @Override
    public void deletePhong(String soPhong) {
        // Kiểm tra ràng buộc trước khi xóa (ví dụ đang có khách)
        Phong p = phongRepository.findById(soPhong).orElse(null);
        if(p != null && "Đang thuê".equals(p.getTrangThai())) {
            throw new RuntimeException("Không thể xóa phòng đang có người ở!");
        }
        phongRepository.deleteById(soPhong);
    }
    private PhongDto convertToDto(Phong entity) {
        // Mapping đơn giản
        PhongDto dto = new PhongDto();
        dto.setSoPhong(entity.getSoPhong());
        dto.setTrangThai(entity.getTrangThai());
        dto.setGhiChu(entity.getGhiChu());
        if(entity.getLoaiPhong() != null) {
            dto.setTenLoai(entity.getLoaiPhong().getTenLoai());
            dto.setMaLoai(entity.getLoaiPhong().getMaLoai());
            dto.setGiaPhong(entity.getLoaiPhong().getGia());
        }
        return dto;
    }
}
