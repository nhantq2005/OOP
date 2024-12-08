/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI03;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class DemoSanPham {
    public static void main(String[] args) {
        try {
            SanPham s1 = new Sach("OOP", "LAP TRINH OOP", "OU", 55, 100);
            SanPham s2 = new BangDia("BACKEND", "TUTORIAL", "UIT",75, 1.6);
            SanPham s3 = new BangDia("FRONTEND", "REACTJS", "UFM",200, 3.5);
            SanPham s4 = new Sach("JAVA", "LAP TRINH JAVA", "SPKT", 120, 250);
            SanPham s5 = new BangDia("DATA ENGINEER", "TUTORIAL", "PTIT",145, 20);
            SanPham s6 = new Sach("PYTHON", "SYNTAX PYTHON", "HCMUS", 60, 75);
            
            QLSP ds = new QLSP();
            ds.themSP(s1,s6);
            ds.themSP(s2);
            ds.themSP(s3);
            ds.themSP(s4);
            ds.themSP(s5);
            ds.themSP("com.mycompany.bai_thuc_hanh_03.BAI03.Sach");
            
            
            ds.xoaSP("SP00001");
            
            ds.hienThi();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(DemoSanPham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
