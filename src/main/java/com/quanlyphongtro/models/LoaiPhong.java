package com.quanlyphongtro.models;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "loai_phong")
public class LoaiPhong {

    @Id
    @Column(name = "ma_loai", length = 10)
    private String maLoai;

    @Column(name = "ten_loai", length = 100)
    private String tenLoai;

    @Column(name = "gia")
    private BigDecimal gia;
}

