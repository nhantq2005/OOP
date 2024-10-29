package com.hcmou.oop_ex02;

public class DiemSo {
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

    public double diemTrungBinh(){
        return (diemMon1+diemMon2+diemMon3)/3.0;
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
