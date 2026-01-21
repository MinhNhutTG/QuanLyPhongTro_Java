package com.quanlyphongtro.dto;

import java.math.BigDecimal;

public class PhongDto {

    private String soPhong;
    private String tenLoai;
    private BigDecimal giaPhong;
    private String trangThai;
	private String ghiChu;
	private String maLoai;
    public PhongDto(String soPhong, String tenLoai, BigDecimal giaPhong, String trangThai) {
        this.soPhong = soPhong;
        this.tenLoai = tenLoai;
        this.giaPhong = giaPhong;
        this.trangThai = trangThai;

    }
	public PhongDto() {

	}

	public String getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
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
