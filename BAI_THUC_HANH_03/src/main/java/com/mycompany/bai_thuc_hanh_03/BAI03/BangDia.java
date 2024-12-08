/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI03;

/**
 *
 * @author trung
 */
public class BangDia extends SanPham {
    private double doDai;
    
    public BangDia(String tenSP, String moTa, String nhaSanXuat, double giaBan, double doDai) {
        super(tenSP, moTa, nhaSanXuat, giaBan);
        this.doDai = doDai;
    }
    
    public BangDia(){
        super();
    }

    @Override
    public void nhap() {
        super.nhap(); 
        System.out.print("Nhap ten SP: ");
        this.doDai=sc.nextDouble();
    }
    
    

    /**
     * @return the doDai
     */
    public double getDoDai() {
        return doDai;
    }

    /**
     * @param doDai the doDai to set
     */
    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }

    @Override
    public String toString() {
        return String.format("""
               BANG DIA=============
               %s
               Do dai: %.1f gio
               """,super.toString(),this.doDai);
    }
    
    
    
}
