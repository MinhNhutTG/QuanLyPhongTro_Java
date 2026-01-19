package com.quanlyphongtro.models;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "khach_thue")
public class KhachThue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_khach")
    private Integer maKhach;

    @Column(name = "ho_ten", length = 100)
    private String hoTen;

    private LocalDateTime ngaySinh;

    @Column(length = 12, nullable = false)
    private String cccd;

    @Column(name = "so_dien_thoai", length = 11)
    private String soDienThoai;

    @Column(name = "que_quan", length = 2000)
    private String queQuan;

    @Column(name = "trang_thai", length = 100, nullable = false)
    private String trangThai;

    @Column(length = 100)
    private String email;
}

