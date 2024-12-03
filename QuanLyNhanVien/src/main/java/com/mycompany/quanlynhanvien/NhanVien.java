/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlynhanvien;

/**
 *
 * @author trung
 */
public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    /**
     * @return the congViec
     */
    public String getCongViec() {
        return congViec;
    }

    /**
     * @param congViec the congViec to set
     */
    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    
    @Override
    public String toString(){
        return String.format(
                "Ho ten: %s\n"
                        + "Tuoi: %d\n"
                        + "Gioi tinh: %s\n"
                        + "Dia chi: %s\n"
                        + "Bac: %s\n",
                this.getHoTen(),this.getTuoi(),this.getGioiTinh(),
                this.getDiaChi(),this.congViec
        );
    }
}
