package com.quanlyphongtro.models;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "hoa_don")
public class HoaDon {

    @Id
    @Column(name = "id_hoa_don", length = 10)
    private String idHoaDon;

    @ManyToOne
    @JoinColumn(name = "id_dich_vu")
    private DichVuPhong dichVuPhong;

    private Integer soDien;
    private Integer soNuoc;

    private BigDecimal tienDien;
    private BigDecimal tienNuoc;
    private BigDecimal phiKhac;
    private BigDecimal tongTien;
    private BigDecimal giaPhong;

    private LocalDateTime ngayLapHoaDon;

    @Column(length = 100, nullable = false)
    private String trangThai;

    @Column(length = 2000)
    private String ghiChu;
}
