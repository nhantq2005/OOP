/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI03;

/**
 *
 * @author trung
 */
public class Sach extends SanPham {
    private int soTrang;

    public Sach(String tenSP, String moTa, String nhaSanXuat, double giaBan, int soTrang) {
        super(tenSP, moTa, nhaSanXuat, giaBan);
        this.soTrang = soTrang;
    }
    
    @Override
    public String toString(){
        return String.format("""
                             SACH=======================
                             %s
                             So trang: %d trang
                             """, super.toString(),this.soTrang);
    }

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    


}
