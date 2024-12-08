/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI05;

import java.util.Scanner;

/**
 *
 * @author trung
 */
public abstract class NhanVien {
    private static int cnt=1;
    protected static double luong = 100;
    Scanner sc = new Scanner(System.in);
    private String maSo;
    private String CMND;
    private String hoTen;
    private String queQuan;
    private String gioiTinh;
    private String soDienThoai;
    
    protected double tienLuong;
    private int soNgayCong;
    
    public NhanVien(){
        this.maSo = String.format("NV%02d", cnt++);
    }
    
    public NhanVien(String CMND, String hoTen, String queQuan,
            String gioiTinh, String soDienThoai){
        this.maSo = String.format("NV%02d", cnt++);
        this.CMND=CMND;
        this.hoTen=hoTen;
        this.queQuan=queQuan;
        this.gioiTinh=gioiTinh;
        this.soDienThoai=soDienThoai;
    }
    
    public void nhap(){
        System.out.println("=====NHAP THONG TIN=====");
        System.out.print("NHAP HO TEN: ");
        this.hoTen = sc.nextLine();
        System.out.print("NHAP SO CMND: ");
        this.CMND = sc.nextLine();
        System.out.print("NHAP GIOI TINH: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("NHAP QUE QUAN: ");
        this.queQuan = sc.nextLine();
        System.out.print("NHAP SO DIEN THOAI: ");
        this.soDienThoai = sc.nextLine();
        
    }

    @Override
    public String toString() {
        return String.format("""
                             ======THONG TIN NHAN VIEN======
                             Ho ten: %s
                             CMND: %s
                             Gioi tinh: %s
                             Que quan: %s
                             So dien thoai: %s""",
                this.hoTen,this.CMND, this.gioiTinh, 
                this.queQuan, this.soDienThoai);
    }
    
    public String hienThiLuong(){
        return String.format("""
                             =====LUONG NHAN VIEN=====
                             Ma so: %s
                             Ho ten: %s
                             So ngay cong: %d
                             Tien luong: %.3f VND""",
                this.maSo, this.hoTen,this.soNgayCong, this.tinhLuong());
    }
    
    
    
    
    
    public double tinhLuong(){
        return luong*this.soNgayCong;
    }

    /**
     * @return the maSo
     */
    public String getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    /**
     * @return the CMND
     */
    public String getCMND() {
        return CMND;
    }

    /**
     * @param CMND the CMND to set
     */
    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the soDienThoai
     */
    public String getSoDienThoai() {
        return soDienThoai;
    }

    /**
     * @param soDienThoai the soDienThoai to set
     */
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    /**
     * @return the tienLuong
     */
    public double getTienLuong() {
        return tienLuong;
    }

    /**
     * @param tienLuong the tienLuong to set
     */
    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    /**
     * @return the soNgayCong
     */
    public int getSoNgayCong() {
        return soNgayCong;
    }

    /**
     * @param soNgayCong the soNgayCong to set
     */
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
}
