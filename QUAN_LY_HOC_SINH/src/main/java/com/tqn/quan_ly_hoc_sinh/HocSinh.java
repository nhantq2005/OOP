/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqn.quan_ly_hoc_sinh;

import java.util.Scanner;

/**
 *
 * @author trung
 */
public class HocSinh {
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private String lop;
    
    Scanner sc = new Scanner(System.in);
    
    public HocSinh(String hoTen,int tuoi, String queQuan, String lop){
        this.hoTen=hoTen;
        this.tuoi=tuoi;
        this.queQuan=queQuan;
        this.lop=lop;
    }
    
    public HocSinh(){
        
    }

    @Override
    public String toString() {
        return String.format("""
                             =====THONG TIN HOC SINH=====
                             Ho ten: %s
                             Tuoi: %d
                             Que quan: %s
                             Lop: %s""", this.hoTen,this.tuoi,this.queQuan, this.lop);
    }
    
    public void nhap(){
        System.out.println("=====NHAP THONG TIN=====");
        System.out.print("Nhap ho ten: ");
        this.hoTen=sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.tuoi=sc.nextInt();
        String bienGia=sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.queQuan=sc.nextLine();
        System.out.print("Nhap ho ten: ");
        this.lop=sc.nextLine();
        
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the lop
     */
    public String getLop() {
        return lop;
    }

    /**
     * @param lop the lop to set
     */
    public void setLop(String lop) {
        this.lop = lop;
    }

    /**
     * @return the tuoi
     */
    public int getTuoi() {
        return tuoi;
    }

    /**
     * @param tuoi the tuoi to set
     */
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
