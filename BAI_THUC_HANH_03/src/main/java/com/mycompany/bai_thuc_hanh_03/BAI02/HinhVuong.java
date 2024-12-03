/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI02;

/**
 *
 * @author trung
 */
public class HinhVuong extends HinhChuNhat{
    public HinhVuong(double canh){
        super(canh,canh);
    }
    
    @Override
    public String toString(){
        return String.format(
        """
        Hinh vuong
        Dien tich: %.1f
        Chu vi: %.1f
        """
        ,this.tinhDienTich(),this.tinhChuVi());
    }
    
}
