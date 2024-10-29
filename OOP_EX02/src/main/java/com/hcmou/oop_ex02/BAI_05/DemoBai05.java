/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmou.oop_ex02.BAI_05;


import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DemoBai05 {
    public static void main(String[] args) {

        PhanSo ps1 = new PhanSo(-2, 4);
        PhanSo ps2 = new PhanSo(1, 3);
        PhanSo ps3 = new PhanSo(7, 5);

        ArrayList<PhanSo> dsPS = new ArrayList<>();
        dsPS.add(ps1);
        dsPS.add(ps2);
        dsPS.add(ps3);
//      Duyet va hien thi
        dsPS.stream().forEach(x->x.hienThi());
        System.out.println();
//      Tinh tong
        dsPS.stream().reduce(new PhanSo(),(t,x)->t.cong(x)).hienThi();
        System.out.println();
//      Sap xep
        dsPS.stream().sorted((p1,p2)->p1.soSanh(p2)).forEach(x->x.hienThi());
    }
}
