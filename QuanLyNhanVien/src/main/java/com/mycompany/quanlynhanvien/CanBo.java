/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlynhanvien;

/**
 *
 * @author trung
 */
public class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    
    public CanBo(String hoTen, int tuoi, String gioiTinh, String diaChi){
        this.hoTen = hoTen;
        if(tuoi<1){
            this.tuoi = 0;
        }else{
            this.tuoi = tuoi; 
        }
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the tuoi
     */
    public int getTuoi() {
        return tuoi;
    }

    /**
     * @param tuoi the tuoi to set
     */
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
