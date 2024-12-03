/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI01;

/**
 *
 * @author trung
 */
public class Circle extends Ellipse {

    public Circle(double banKinh) {
        super(banKinh, banKinh);
    }
    
    @Override
    public String toString(){
        return String.format("""
                      Hinh Circle
                      Dien Tich: %.1f
                      Chu Vi: %.1f
                      """, this.tinhDienTich(), this.tinhChuVi());
    }
    
}
