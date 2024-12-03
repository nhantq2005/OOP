/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI01;

/**
 *
 * @author trung
 */
public class Ellipse {
    private double bkTrucLon;
    private double bkTrucNho;
    
    
    public Ellipse(double bkTrucLon, double bkTrucNho){
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }
    
    public double tinhChuVi(){
        return Math.PI*this.bkTrucLon*this.bkTrucNho;
    }
    
    public double tinhDienTich(){
        return 2*Math.PI*Math.sqrt((Math.pow(this.bkTrucLon,2)+Math.pow(this.bkTrucNho,2))/2);
    }
    
    public String toString(){
        return String.format("""
                             Hinh Ellipse
                             Dien tich: %.1f
                             Chu vi: %.1f
                             """, this.tinhDienTich(),this.tinhChuVi());
    }

    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucNho
     */
    public double getBkTrucNho() {
        return bkTrucNho;
    }

    /**
     * @param bkTrucNho the bkTrucNho to set
     */
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }
}
