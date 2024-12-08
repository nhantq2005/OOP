/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI05;

/**
 *
 * @author trung
 */
public class BoPhanB extends NhanVien {

    public BoPhanB() {
        super();
    }

    public BoPhanB(String CMND, String hoTen, String queQuan,
            String gioiTinh, String soDienThoai) {
        super(CMND, hoTen, queQuan, gioiTinh, soDienThoai);
    }
   

    @Override
    public double tinhLuong() {
        return super.tinhLuong()* 1.5;
    }
    
        @Override
    public String toString() {
        return String.format("""
                             %s
                             Bo phan B
                             """, super.toString());  
    }

}
