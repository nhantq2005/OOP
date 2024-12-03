package com.hcmou.oop_ex02.BAI_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src\\main\\resources\\database.txt");
        DSHocVien danhSach = new DSHocVien();
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                String hoTen = sc.nextLine();
//                System.out.println(hoTen);
                String queQuan = sc.nextLine();
//                System.out.println(queQuan);
                String ngaySinh = sc.nextLine();
//                System.out.println(ngaySinh);
//                SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
//                Date d = format.parse(ngaySinh);
                HocVien hv = new HocVien(hoTen, ngaySinh, queQuan);
                danhSach.them(hv);
            }
        }
        danhSach.nhapDiem();
//        danhSach.hienThiDiem();
        danhSach.sapXep();
        danhSach.hienThiDiem();
                
    }
}
