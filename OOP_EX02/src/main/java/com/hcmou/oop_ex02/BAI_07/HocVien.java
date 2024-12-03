package com.hcmou.oop_ex02.BAI_07;

import com.hcmou.oop_ex02.BAI_07.DiemSo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class HocVien {

    private static int temp = 1;
    private int maSo = temp++;
    private String hoTen;
    private LocalDate ngaySinh;
    private String queQuan;

    private DiemSo diemSo;

    public void nhapDiem() {
        DiemSo diem = new DiemSo();
        this.diemSo = diem.nhapDiem();

    }

    public HocVien(String hoTen, LocalDate ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }
    
    public HocVien(String hoTen, String ngaySinh, String queQuan) {
            this(hoTen,LocalDate.parse(ngaySinh,CauHinh.FORMATTER),queQuan);
    }

//    public Date chuanHoaNgay(String ngaySinh) throws ParseException {
//        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
//        Date d = f.parse(ngaySinh);
//        return d;
//    }

    public void hienThiThongTin() {
        System.out.println(
                "Ma so: " + this.maSo
                + "\n Ho va ten: " + this.hoTen
                + "\n Ngay sinh: " + this.ngaySinh.format(CauHinh.FORMATTER)
                + "\n Que quan: " + this.queQuan
                + "\n Diem mon 1: " + this.diemSo.getDiemMon1()
                + "\n Diem mon 2: " + this.diemSo.getDiemMon2()
                + "\n Diem mon 3 " + this.diemSo.getDiemMon3() + "\n"
        );
    }

    public void hienThi() {
        System.out.println(
                "Ma so: " + this.maSo
                + "\n Ho va ten: " + this.hoTen
                + "\n Ngay sinh: " + this.ngaySinh.format(CauHinh.FORMATTER)
                + "\n Que quan: " + this.queQuan
        );
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public DiemSo getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(DiemSo diemSo) {
        this.diemSo = diemSo;
    }
}
