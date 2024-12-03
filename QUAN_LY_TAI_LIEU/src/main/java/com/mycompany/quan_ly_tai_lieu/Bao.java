/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_lieu;

/**
 *
 * @author trung
 */
public class Bao extends TaiLieu {
    private int ngayPhatHanh;

    public Bao(String nhaXuatBan, int soBan, int ngayPhatHanh) {
        super(nhaXuatBan, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return String.format(
        """
        === BAO ===
        %s
        Ngay phat hanh: %d
        """
        ,super.toString(), this.ngayPhatHanh
       );
    }
    
    

    /**
     * @return the ngayPhatHanh
     */
    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    /**
     * @param ngayPhatHanh the ngayPhatHanh to set
     */
    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    
}
