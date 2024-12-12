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
public class TaiKhoanCoKyHan extends TaiKhoan {
    private KyHan kyHan;
    private Calendar ngayDaoHan;

    public TaiKhoanCoKyHan(String tenTK, String soDT, String email, 
            BigDecimal soTien,  String trangThai,
            KyHan kyHan) {
        super(tenTK, soDT, email, soTien,  trangThai);
        this.kyHan=kyHan;
        this.ngayDaoHan=kyHan.tinhDaoHan( new GregorianCalendar());
    }

    @Override
    public String toString() {
        return String.format("""
                             %s
                             Ky han: %s
                             Ngay dao han: %s""", super.toString(),
                             this.kyHan,CauHinh.FORMATTER.format(this.ngayDaoHan.getTime()));
    }

    @Override
    public boolean isDaoHan() {
        Calendar d = new GregorianCalendar();
        String s1 = CauHinh.FORMATTER.format(this.ngayDaoHan.getTime());
        String s2 = CauHinh.FORMATTER.format(d.getTime());
        return s1.equals(s2);
    }
    
    public void capNhatDaoHan(){
        this.ngayDaoHan = this.kyHan.tinhDaoHan(this.ngayDaoHan);
    }

    @Override
    public BigDecimal tinhLai() {
        return kyHan.tinhLai(this.soTien);
    }
    
    
    
     public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    public Calendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(Calendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
}
