package com.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "BANGLUONG")
public class BangLuong {

    @Id
    @Column(name = "MaBangLuong")
    private String maBangLuong;

    @Column(name = "TongThuNhap")
    private int tongThuNhap;

    @Column(name = "LuongThucNhan")
    private int luongThucNhan;

    @Column(name = "GhiChu")
    private String ghiChu;


    @OneToOne
    @JoinColumn(name = "MaBangChamCong", referencedColumnName = "MaBangChamCong")
    private BangChamCong bangChamCong;

    // Getters and setters for all properties
    public String getMaChucVuaBangLuong() {
        return maChucVuaBangLuong;
    }

    public void setMaChucVuaBangLuong(String maChucVuaBangLuong) {
        this.maChucVuaBangLuong = maChucVuaBangLuong;
    }

    public int getTongThuNhap() {
        return tongThuNhap;
    }

    public void setTongThuNhap(int tongThuNhap) {
        this.tongThuNhap = tongThuNhap;
    }

    public int getLuongThucNhan() {
        return luongThucNhan;
    }

    public void setLuongThucNhan(int luongThucNhan) {
        this.luongThucNhan = luongThucNhan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public BangChamCong getBangChamCong() {
        return bangChamCong;
    }

    public void setBangChamCong(BangChamCong bangChamCong) {
        this.bangChamCong = bangChamCong;
    }


}
