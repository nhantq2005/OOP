/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI03;

import java.util.Scanner;

/**
 *
 * @author trung
 */
public abstract class SanPham implements Comparable<SanPham>{
    private static int cnt=0;
    
    private String maSP;
    private String tenSP;
    private String moTa;
    private String nhaSanXuat;
    private double giaBan;
    
    Scanner sc = new Scanner(System.in);
    
    public SanPham(){
        cnt++;
        this.maSP = String.format("SP%05d", cnt);
    }
    
    public SanPham(String tenSP, String moTa, String nhaSanXuat, double giaBan){
        cnt++;
        this.maSP = String.format("SP%05d", cnt);
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }
    
    public void nhap(){
        System.out.println("=====NHAP THONG TIN=====");
        System.out.print("Nhap ten SP: ");
        this.tenSP=sc.nextLine();
        System.out.print("Nhap mo ta: ");
        this.moTa=sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        this.nhaSanXuat=sc.nextLine();
        System.out.print("Nhap gia ban: ");
        this.giaBan=sc.nextInt();
    }
    
    public int sapXep(SanPham sp){
        if(this.giaBan > sp.giaBan)
            return -1;
        else if(this.giaBan < sp.giaBan)
            return 1;
        else return 0;
    }
    
    @Override
    public String toString(){
        return String.format("""
                             Ma SP: %s
                             Ten SP:%s
                             moTa: %s
                             Nha SX: %s
                             Gia ban: %.3f VND
                             """, this.maSP, this.tenSP, this.moTa, this.nhaSanXuat,
                             this.giaBan);
    }
    
    

    /**
     * @return the maSP
     */
    public String getMaSP() {
        return maSP;
    }

    /**
     * @param maSP the maSP to set
     */
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    /**
     * @return the nhaSanXuat
     */
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    /**
     * @param nhaSanXuat the nhaSanXuat to set
     */
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public int compareTo(SanPham sp) {
        return -Double.compare(this.giaBan, sp.giaBan);
    }

//    @Override
//    public boolean equals(Object obj) {
//        SanPham sp = (SanPham) obj;
//        return this.tenSP.equals(sp.tenSP); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
    
    
}
