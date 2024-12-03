package com.hcmou.oop_ex02.BAI_07;

import java.util.ArrayList;

public class DSHocVien {

    private ArrayList<HocVien> danhSachHV = new ArrayList<>();

    public void nhapDiem() {
//        for(var hv:danhSachHV){
//            hv.hienThi();
//            hv.nhapDiem();
//        }
        this.danhSachHV.forEach(hv
                -> {
            hv.hienThi();
            hv.nhapDiem();
        }
        );
    }

    public void them(HocVien hv) {
        danhSachHV.add(hv);
    }

    public void hienThi() {
        this.danhSachHV.stream().forEach(hv -> hv.hienThi());
    }

    public void hienThiDiem() {
        this.danhSachHV.stream().forEach(hv -> hv.hienThiThongTin());
    }

    public void timKiem(int maSo) {
        this.danhSachHV.stream().filter(hv -> maSo == hv.getMaSo()).findFirst().get().hienThi();
    }

    public void timKiem(String hoTen) {
        this.danhSachHV.stream().filter(hv -> hoTen.equals(hv.getHoTen())).findFirst().get().hienThi();
    }

    public void sapXep() {
        this.danhSachHV.stream().sorted((h1, h2)
                -> {
            if (h1.getDiemSo().diemTrungBinh() > h2.getDiemSo().diemTrungBinh()) {
                return 1;
            } else if (h1.getDiemSo().diemTrungBinh() < h2.getDiemSo().diemTrungBinh()) {
                return -1;
            } else
            return 0;
        });
    }

}
