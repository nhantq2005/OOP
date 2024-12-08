/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_lieu;

/**
 *
 * @author trung
 */
public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;
    
    public TapChi(){
        super();
    }

    public TapChi(String nhaXuatBan, int soBan, int soPhatHanh, int thangPhatHanh) {
        super(nhaXuatBan, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return String.format(
        """
        === TAP CHI ===
        %s
        So phat hanh: %d
        Thang phat hanh: %d
        """
        ,super.toString(),this.soPhatHanh,this.thangPhatHanh);
    }
    
    

    /**
     * @return the soPhatHanh
     */
    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    /**
     * @param soPhatHanh the soPhatHanh to set
     */
    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    /**
     * @return the thangPhatHanh
     */
    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    /**
     * @param thangPhatHanh the thangPhatHanh to set
     */
    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so phat hanh: ");
        this.soPhatHanh=sc.nextInt();
        System.out.print("Nhap thang hanh: ");
        this.thangPhatHanh=sc.nextInt();
    }
    
}
