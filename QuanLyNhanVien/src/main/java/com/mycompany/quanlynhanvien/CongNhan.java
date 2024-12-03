/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlynhanvien;

/**
 *
 * @author trung
 */
public class CongNhan extends CanBo{
    private int bac;
    
    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        if(bac>10 && bac<1){
            this.bac = 1;
        }else{
            this.bac = bac;
        }
    }

    /**
     * @return the bac
     */
    public int getBac() {
        return bac;
    }

    /**
     * @param bac the bac to set
     */
    public void setBac(int bac) {
        this.bac = bac;
    }
    
    @Override
    public String toString(){
        return String.format(
                "Ho ten: %s\n"
                        + "Tuoi: %d\n"
                        + "Gioi tinh: %s\n"
                        + "Dia chi: %s\n"
                        + "Bac: %d\n",
                this.getHoTen(),this.getTuoi(),this.getGioiTinh(),
                this.getDiaChi(),this.bac
        );
    }
}
