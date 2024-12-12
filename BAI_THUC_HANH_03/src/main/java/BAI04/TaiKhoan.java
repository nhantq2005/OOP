/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI04;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author trung
 */
public class TaiKhoan {

    private static int cnt = 1;
    private String soTK;
    private String tenTK;
    private String soDT;
    private String email;
    protected BigDecimal soTien;
    private Calendar ngayTaoTK;
    private String trangThai;

    public TaiKhoan(String tenTK, String soDT, String email,
            BigDecimal soTien, String trangThai) {
        this.soTK = String.format("%06d", cnt++);
        this.tenTK = tenTK;
        this.soDT = soDT;
        this.email = email;
        this.soTien = soTien;
        this.ngayTaoTK = new GregorianCalendar();
        this.trangThai = trangThai;
    }

    //Nhap string chuyen sang Calenddar
//    public TaiKhoan(String tenTK, String soDT, String email,
//            double soDu, String ngayTaoTK, String trangThai) {
//        this(tenTK, soDT, email, soDu, 
//                LocalDate.parse(ngayTaoTK,CauHinh.FORMATTER), trangThai);
//    }
    @Override
    public String toString() {
        return String.format("""
                             =================
                             So TK: %s
                             Ten TK: %s
                             So dien thoai: %s
                             Email: %s
                             So tien: %.1f
                             Ngay tao TK: %s
                             Trang thai: %s
                             """, this.soTK, this.tenTK, this.soDT, this.email,
                this.soTien, CauHinh.FORMATTER.format(this.ngayTaoTK.getTime()),
                this.trangThai);
    }

    public boolean isDaoHan() {
        return true;
    }

    public BigDecimal rutTien(BigDecimal tien) {
        if (isDaoHan()) {
            if (this.soTien.compareTo(tien) >= 0) {
                this.soTien = this.soTien.subtract(tien);
            }

        }
        return this.soTien;
    }

    public BigDecimal nopTien(BigDecimal tien) {
        if (isDaoHan()) {
            this.soTien = this.soTien.add(tien);

        }
        return this.soTien;
    }
    
    public BigDecimal tinhLai(){
//        1 --> 0.0001
//        12 --> 
        return this.soTien.multiply(new BigDecimal(0.0001*12));
    }

    /**
     * @return the cnt
     */
    public static int getCnt() {
        return cnt;
    }

    /**
     * @param aCnt the cnt to set
     */
    public static void setCnt(int aCnt) {
        cnt = aCnt;
    }

    /**
     * @return the tenTK
     */
    public String getTenTK() {
        return tenTK;
    }

    /**
     * @param tenTK the tenTK to set
     */
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    /**
     * @return the soDT
     */
    public String getSoDT() {
        return soDT;
    }

    /**
     * @param soDT the soDT to set
     */
    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the soTien
     */
    public BigDecimal getSoTien() {
        return soTien;
    }

    /**
     * @param soTien
     */
    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the ngayTaoTK
     */
    public Calendar getNgayTaoTK() {
        return ngayTaoTK;
    }

    /**
     * @param ngayTaoTK the ngayTaoTK to set
     */
    public void setNgayTaoTK(Calendar ngayTaoTK) {
        this.ngayTaoTK = ngayTaoTK;
    }

    /**
     * @return the trangThai
     */
    public String getTrangThai() {
        return trangThai;
    }

    /**
     * @param trangThai the trangThai to set
     */
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
