package com.quanlyphongtro.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "dich_vu_phong")
public class DichVuPhong {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "so_phong", nullable = false)
    private Phong phong;

    @Column(name = "ma_hop_dong", length = 10)
    private String maHopDong;

    private String ki;
    private Integer soDienCu;
    private Integer soDienMoi;
    private Integer soNuocCu;
    private Integer soNuocMoi;

    private BigDecimal giaDien;
    private BigDecimal giaNuoc;
    private BigDecimal tienMang;

    private LocalDateTime ngayTao;

    @Column(length = 100)
    private String trangThai;
}

