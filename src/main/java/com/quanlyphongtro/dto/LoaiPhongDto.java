package com.quanlyphongtro.dto;

import java.math.BigDecimal;

public class LoaiPhongDto {
    private String maLoai;
    private String tenLoai;
    private BigDecimal gia;

    public LoaiPhongDto() {}

    public LoaiPhongDto(String maLoai, String tenLoai, BigDecimal gia) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.gia = gia;
    }

    // Getters & Setters
    public String getMaLoai() { return maLoai; }
    public void setMaLoai(String maLoai) { this.maLoai = maLoai; }
    public String getTenLoai() { return tenLoai; }
    public void setTenLoai(String tenLoai) { this.tenLoai = tenLoai; }
    public BigDecimal getGia() { return gia; }
    public void setGia(BigDecimal gia) { this.gia = gia; }

    // Override toString để hiển thị trong JComboBox
    @Override
    public String toString() {
        return tenLoai;
    }
}