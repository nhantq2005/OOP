/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_lieu;

/**
 *
 * @author trung
 */
public abstract class TaiLieu {
    private static int maSo = 1;
    
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBan;
    
    public TaiLieu(String nhaXuatBan, int soPhatHanh){
        this.maTaiLieu = String.format("TL%02d",maSo++);
        this.nhaXuatBan = nhaXuatBan;
        this.soBan = soPhatHanh;
    }

    @Override
    public String toString() {
        return String.format("""
        Ma tai lieu: %s
        Nha xuat ban: %s
        So phat hanh: %d
        """
        ,this.maTaiLieu,this.nhaXuatBan,this.soBan);
    }
    
    

    /**
     * @return the maTaiLieu
     */
    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    /**
     * @param maTaiLieu the maTaiLieu to set
     */
    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    /**
     * @return the nhaXuatBan
     */
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    /**
     * @param nhaXuatBan the nhaXuatBan to set
     */
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    /**
     * @return the soBan
     */
    public int getSoBan() {
        return soBan;
    }

    /**
     * @param soBan the soBan to set
     */
    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }
    
}
