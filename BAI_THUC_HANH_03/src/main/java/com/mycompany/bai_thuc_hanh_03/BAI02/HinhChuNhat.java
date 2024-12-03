/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI02;

/**
 *
 * @author trung
 */
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    
    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    public double tinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }
    
    public double tinhChuVi(){
        return 2*(this.chieuDai+this.chieuRong);
    }
    
    @Override
    public String toString(){
        return String.format("""
                             Hinh Chu Nhat
                             Dien tich: %.1f
                             Chu vi: %.1f
                             """, this.tinhDienTich(),this.tinhChuVi());
    }

    /**
     * @return the chieuDai
     */
    public double getChieuDai() {
        return chieuDai;
    }

    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @return the chieuRong
     */
    public double getChieuRong() {
        return chieuRong;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
}
