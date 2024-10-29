/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmou.oop_ex02.BAI_01;

/**
 *
 * @author admin
 */
public class Diem {
    private double hoanhDo;
    private double tungDo;
    
    public Diem(double hoanhDo, double tungDo){
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }
    
    public double getHoanhDo(){
        return hoanhDo;
    }
    
    public double getTungDo(){
        return tungDo;
    }
    
    public void hienThi(){
        System.out.printf("(%.1f,%.1f)\n",this.hoanhDo,this.tungDo);
    }
    
    public double tinhKhoangCach(Diem p){
        return Math.sqrt(Math.pow(this.hoanhDo-p.hoanhDo,2)+Math.pow(this.tungDo - p.tungDo,2));
    }
}
