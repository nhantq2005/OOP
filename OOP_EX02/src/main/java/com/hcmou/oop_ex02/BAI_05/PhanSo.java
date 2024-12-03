/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmou.oop_ex02.BAI_05;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PhanSo {

    private static final Scanner sc = new Scanner(System.in);
    private int tuSo;
    private int mauSo;

//    Phương thức khởi tạo hai tham số tương ứng khởi gán giá trị tử số và mẫu số cho phân số.
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

//    Phương thức khởi tạo không tham số khởi gán tử số là 0, mẫu là số 1.
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    public PhanSo nhapPS(){
        System.out.print("Tu so: ");
        this.tuSo = sc.nextInt();
        System.out.print("Mau so: ");
        this.mauSo = sc.nextInt();
        return this;
    } 

//    Tìm ước số chung lớn nhất hai số nguyên.
    public static int UCLN(int a, int b) {
        if(b==0) return a;
        else return UCLN(b,a%b);
    }

//    Rút gọn phân số.
    public PhanSo rutGon(){
        int uoc = UCLN(this.tuSo,this.mauSo);
        return new PhanSo(this.tuSo/uoc,this.mauSo/uoc);
    }
    
    public void hienThi(){
        System.out.printf("%d/%d \t",this.tuSo,this.mauSo);
    }

    //    Các phép tính cộng, trừ, nhân, chia hai phân số. Kết quả trả về của các phép tính này
//    là các phân số đã được rút gọn.
    public PhanSo cong(PhanSo ps){
        int tuSo = this.tuSo*ps.mauSo + this.mauSo*ps.tuSo;
        int mauSo = this.mauSo*ps.mauSo;
        return new PhanSo(tuSo, mauSo).rutGon();
    }

    public PhanSo tru(PhanSo ps){
        int tuSo = this.tuSo*ps.mauSo - this.mauSo*ps.tuSo;
        int mauSo = this.mauSo*ps.mauSo;
        return new PhanSo(tuSo, mauSo).rutGon();
    }

    public PhanSo nhan(PhanSo ps){
        int tuSo = this.tuSo*ps.tuSo;
        int mauSo = this.mauSo* ps.mauSo;
        return new PhanSo(tuSo,mauSo).rutGon();
    }

    public PhanSo chia(PhanSo ps){
        int tuSo = this.tuSo*ps.mauSo;
        int mauSo = this.mauSo* ps.tuSo;
        return new PhanSo(tuSo,mauSo).rutGon();
    }

    public boolean isBangNhau(PhanSo ps1){
        if(this.tuSo*ps1.mauSo == this.mauSo*ps1.tuSo) 
            return true;
        return false;
    }

//    So sánh bằng, lớn hơn, bé hơn hai phân số.
    public double layGiaTri(){
        return this.tuSo*1.0/this.mauSo;
    }
    public int soSanh(PhanSo ps){
        if(this.layGiaTri()<ps.layGiaTri()){
            return -1;
        } else if (this.layGiaTri()> ps.layGiaTri()) {
            return 1;
        }
        return 0;
    }


//    Các phương thức getter, setter của tử số, mẫu số và các phương thức khác thực hiện các chức năng sau:
    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

}
