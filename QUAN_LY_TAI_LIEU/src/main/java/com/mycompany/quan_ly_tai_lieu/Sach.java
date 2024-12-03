/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_lieu;

/**
 *
 * @author trung
 */
public class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;

    public Sach(String nhaXuatBan, int soBan, String tacGia, int soTrang) {
        super(nhaXuatBan, soBan);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return String.format(
        """
        === SACH ===
        %s
        Tac gia: %s
        So trang: %d
        """
        ,super.toString(), this.tacGia, this.soTrang);
    }
    
    

    /**
     * @return the tacGia
     */
    public String getTacGia() {
        return tacGia;
    }

    /**
     * @param tacGia the tacGia to set
     */
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
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
