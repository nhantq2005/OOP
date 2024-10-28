/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmou.oop_ex02;

/**
 *
 * @author admin
 */
public class HinhTron {
    private Diem tam;
    private double banKinh;

    public HinhTron(Diem tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }
    
    public double tinhChuVi(){
        return 2*this.banKinh*Math.PI;
    }
    
    public double tinhDienTich(){
        return Math.pow(banKinh, 2)*Math.PI;
    }
    
    public int diemVaHinhTron(Diem p){
        double khoangCach = tam.tinhKhoangCach(p);
        if(khoangCach>banKinh)  return 1;
        else if(khoangCach < banKinh) return -1;
        return 0;
    }
    
    public int hinhTronVaHinhTron(HinhTron ht){
        double khoangCach = tam.tinhKhoangCach(ht.getTam());
        if(khoangCach>banKinh)  return 1;
        else if(khoangCach < banKinh) return -1;
        return 0;
    }
    
    
    public void hienThi(int pos){
        if(pos == 0) System.out.println("TRUNG");
        else if (pos > 0) System.out.println("NGOAI");
        else System.out.println("TRONG");
    }
    /**
     * @return the tam
     */
    public Diem getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(Diem tam) {
        this.tam = tam;
    }

    /**
     * @return the banKinh
     */
    public double getBanKinh() {
        return banKinh;
    }

    /**
     * @param banKinh the banKinh to set
     */
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    
}
