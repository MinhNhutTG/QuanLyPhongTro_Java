package com.quanlyphongtro.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "dich_vu")
public class DichVu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ten_dich_vu", nullable = false)
    private String tenDichVu;

    private BigDecimal gia;
}

