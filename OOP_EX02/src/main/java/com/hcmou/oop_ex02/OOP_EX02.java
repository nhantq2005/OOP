/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.hcmou.oop_ex02;

/**
 *
 * @author admin
 */
public class OOP_EX02 {

    public static void main(String[] args) throws Exception {
        Diem p1 = new Diem(4, 7);
        Diem p2 = new Diem(-3, 5);

        p1.hienThi();
        p2.hienThi();

        double ketQua = p1.tinhKhoangCach(p2);
        System.out.printf("Ket qua la:%.1f \n", ketQua);

        DoanThang dt = new DoanThang(p1, p2);
        dt.hienThiDT();
        double doDai = dt.tinhDoDai();
        System.out.printf("Do dai la:%.1f \n", doDai);
        //Tim trung diem
        Diem trungDiem = dt.timTrungDiem();
        System.out.print("Trung diem cua doan thang");
        trungDiem.hienThi();
        //Kiem tra song song
        DoanThang dt1 = new DoanThang(new Diem(0, 1), new Diem(1, 0));
        DoanThang dt2 = new DoanThang(new Diem(0, 2), new Diem(2, 0));
        System.out.println("Kiem tra song song: " + dt1.isSongSong(dt2));

        //Hinh chu nhat
        Diem diemTrai = new Diem(-2, 2);
        Diem diemPhai = new Diem(2, -2);
        HinhChuNhat hinhChuNhat = new HinhChuNhat(diemTrai, diemPhai);
        System.out.printf("CHU VI: %.1f", hinhChuNhat.tinhChuVi());
        System.out.printf("CHU VI: %.1f", hinhChuNhat.tinhChuVi());
    }
}
