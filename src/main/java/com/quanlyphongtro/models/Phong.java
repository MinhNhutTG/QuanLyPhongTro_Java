package com.quanlyphongtro.models;

import jakarta.persistence.*;

@Entity
@Table(name = "phong")
public class Phong {

    @Id
    @Column(name = "so_phong", length = 20)
    private String soPhong;

    @Column(name = "trang_thai", length = 100, nullable = false)
    private String trangThai;

    @ManyToOne
    @JoinColumn(name = "ma_loai", nullable = false)
    private LoaiPhong loaiPhong;

    @Column(name = "ghi_chu", length = 2000)
    private String ghiChu;
}

