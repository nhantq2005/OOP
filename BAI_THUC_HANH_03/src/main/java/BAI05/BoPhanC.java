/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI05;

/**
 *
 * @author trung
 */
public class BoPhanC extends NhanVien {

    public BoPhanC() {
        super();
    }

    public BoPhanC(String CMND, String hoTen, String queQuan,
            String gioiTinh, String soDienThoai) {
        super(CMND, hoTen, queQuan, gioiTinh, soDienThoai);
    }

    @Override
    public double tinhLuong() {
        return super.tinhLuong()*2.5; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
        @Override
    public String toString() {
        return String.format("""
                             %s
                             Bo phan C
                             """, super.toString());  
    }

}
