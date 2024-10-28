/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmou.oop_ex02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Demo {
    public static void main(String[] args) {
        List<PhanSo> danhSach = new ArrayList<>();
        
        PhanSo ps1 = new PhanSo(2, 4);
        PhanSo ps2 = new PhanSo(1, 3);
        PhanSo ps3 = new PhanSo(7, 5);
        
        danhSach.add(ps1);
        danhSach.add(ps2);
        danhSach.add(ps3);
        
        danhSach.stream().forEach(ps -> ps.hienThi());
        PhanSo ketQua = new PhanSo();
        for(var x:danhSach){
            ketQua = ketQua.tong(x);
        }
        ketQua.hienThi();
        
        
        
    }
}
