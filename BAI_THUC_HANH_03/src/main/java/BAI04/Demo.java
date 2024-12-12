/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI04;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

/**
 *
 * @author trung
 */
public class Demo {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan("NVA", "798", "edu.com", new BigDecimal(1000000), "MO");
        TaiKhoan tk2 = new TaiKhoanCoKyHan("NVA", "798", "edu.com", new BigDecimal(1000000), "MO", KyHan.MOT_TUAN);
        TaiKhoan tk3 = new TaiKhoanCoKyHan("NVA", "798", "edu.com", new BigDecimal(1000000), "MO", KyHan.MOT_THANG);
        TaiKhoan tk4 = new TaiKhoanCoKyHan("NVA", "798", "edu.com", new BigDecimal(1000000), "MO", KyHan.MOT_NAM);
        
        QuanLy ql = new QuanLy();
        ql.them(tk1,tk2,tk3,tk4);
        
        ql.hienThi();
        
        System.out.println(tk1.tinhLai());
        System.out.println(tk2.tinhLai());
        System.out.println(tk3.tinhLai());
        System.out.println(tk4.tinhLai());
        
    }
}
