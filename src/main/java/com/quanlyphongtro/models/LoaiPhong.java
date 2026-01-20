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

	public String getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public BigDecimal getGia() {
		return gia;
	}

	public void setGia(BigDecimal gia) {
		this.gia = gia;
	}
    
    
}

