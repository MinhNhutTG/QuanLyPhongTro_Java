package com.quanlyphongtro.models;

import jakarta.persistence.*;

@Entity
@Table(name = "config")
public class Config {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_nha_tro", length = 200, nullable = false)
    private String tenNhaTro;

    @Column(name = "so_tai_khoan", length = 20, nullable = false)
    private String soTaiKhoan;

    @Column(name = "ten_tai_khoan", length = 200, nullable = false)
    private String tenTaiKhoan;

    @Column(name = "ten_ngan_hang", length = 200, nullable = false)
    private String tenNganHang;

    @Column(name = "email_system", columnDefinition = "TEXT")
    private String emailSystem;

    @Column(name = "app_password", columnDefinition = "TEXT")
    private String appPassword;
}

