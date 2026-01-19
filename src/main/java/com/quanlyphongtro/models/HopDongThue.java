package com.quanlyphongtro.models;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "hop_dong_thue")
public class HopDongThue {

    @Id
    @Column(length = 10)
    private String id;

    private LocalDateTime ngayThue;
    private LocalDateTime hanThue;

    @ManyToOne
    @JoinColumn(name = "so_phong", nullable = false)
    private Phong phong;

    private BigDecimal giaPhong;

    @Column(length = 100, nullable = false)
    private String trangThai;

    private LocalDateTime ngayTaoHopDong;
}

