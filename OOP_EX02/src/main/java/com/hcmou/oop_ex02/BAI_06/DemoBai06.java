package com.hcmou.oop_ex02.BAI_06;

import com.hcmou.oop_ex02.BAI_05.PhanSo;

public class DemoBai06 {
    public static void main(String[] args) {
        DSPhanSo danhSachPS = new DSPhanSo();

        PhanSo ps1 = new PhanSo(-2, 4);
        PhanSo ps2 = new PhanSo(1, 3);
        PhanSo ps3 = new PhanSo(7, 5);

        danhSachPS.them(ps1);
        danhSachPS.them(ps2);
        danhSachPS.them(ps3);

        //Xoa
//        danhSachPS.xoa(new PhanSo(-2,4));
//        danhSachPS.hienThi();
//        System.out.println();

        //Tinh tong
        System.out.print("TONG DANH SACH: ");
        danhSachPS.tongDS().hienThi();
        System.out.println();

//      Tim GTLN & GTNN
        danhSachPS.timGTLN().hienThi();
        System.out.println();
        danhSachPS.timGTNN().hienThi();
        System.out.println();

        //Sap xep
        danhSachPS.sapXep();
    }
}
