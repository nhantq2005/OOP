package com.hcmou.oop_ex02.BAI_07;

import java.util.Scanner;

public class DiemSo {

    private Scanner sc = new Scanner(System.in);

    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

//    public DiemSo(double diemMon1, double diemMon2, double diemMon3){
//        this.diemMon1 = diemMon1;
//        this.diemMon2 = diemMon2;
//        this.diemMon3 = diemMon3;
//    }
    public DiemSo() {
        this.diemMon1 = 0.0;
        this.diemMon2 = 0.0;
        this.diemMon3 = 0.0;
    }

    public DiemSo nhapDiem() {
        System.out.print("Nhap diem mon 1: ");
        this.diemMon1 = sc.nextDouble();
        System.out.print("Nhap diem mon 2: ");
        this.diemMon2 = sc.nextDouble();
        System.out.print("Nhap diem mon 3: ");
        this.diemMon3 = sc.nextDouble();
        return this;
    }

    public double diemTrungBinh() {
        return (diemMon1 + diemMon2 + diemMon3) / 3.0;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }

    public void setDiemMon3(double diemMon3) {
        this.diemMon3 = diemMon3;
    }
}
