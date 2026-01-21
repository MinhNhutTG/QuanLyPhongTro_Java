package com.quanlyphongtro.dto;

import java.math.BigDecimal;

public class PhongDto {

    private String soPhong;
    private String tenLoai;
    private BigDecimal giaPhong;
    private String trangThai;

    public PhongDto(String soPhong, String tenLoai, BigDecimal giaPhong, String trangThai) {
        this.soPhong = soPhong;
        this.tenLoai = tenLoai;
        this.giaPhong = giaPhong;
        this.trangThai = trangThai;
    }

	public String getSoPhong() {
		return soPhong;
	}

	public void setSoPhong(String soPhong) {
		this.soPhong = soPhong;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public BigDecimal getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(BigDecimal giaPhong) {
		this.giaPhong = giaPhong;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

    
}
