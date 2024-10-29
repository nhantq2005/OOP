/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmou.oop_ex02.BAI_03;

import com.hcmou.oop_ex02.BAI_01.Diem;

/**
 *
 * @author admin
 */
public class HinhChuNhat {

    private Diem diemTrai;
    private Diem diemPhai;

    public HinhChuNhat(Diem diemTrai, Diem diemPhai) throws java.lang.Exception {
//        if (diemPhai.getHoanhDo() <= diemTrai.getHoanhDo()
//                && diemTrai.getTungDo() <= diemPhai.getTungDo()) {
        this.diemTrai = diemTrai;
        this.diemPhai = diemPhai;
//        } else {
//            throw Exception("Invalid value");
//        }
    }

    public double tinhChuVi() {
        double chieuDai = diemPhai.getHoanhDo() - diemTrai.getHoanhDo();
        double chieuRong = diemTrai.getTungDo() - diemPhai.getTungDo();
        return (chieuDai + chieuRong) * 2;
    }
    
    public double tinhDienTich(){
                double chieuDai = diemPhai.getHoanhDo() - diemTrai.getHoanhDo();
        double chieuRong = diemTrai.getTungDo() - diemPhai.getTungDo();
        return (chieuDai * chieuRong);
    }

    /**
     * @return the diemTrai
     */
    public Diem getDiemTrai() {
        return diemTrai;
    }

    /**
     * @param diemTrai the diemTrai to set
     */
    public void setDiemTrai(Diem diemTrai) {
        this.diemTrai = diemTrai;
    }

    /**
     * @return the diemPhai
     */
    public Diem getDiemPhai() {
        return diemPhai;
    }

    /**
     * @param diemPhai the diemPhai to set
     */
    public void setDiemPhai(Diem diemPhai) {
        this.diemPhai = diemPhai;
    }

//    private Exception Exception(String invalid_value) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
