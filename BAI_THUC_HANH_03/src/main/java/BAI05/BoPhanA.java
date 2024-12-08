/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI05;

/**
 *
 * @author trung
 */
public class BoPhanA extends NhanVien {
    
    public BoPhanA(){
        super();
    }
    
    public BoPhanA(String CMND, String hoTen, String queQuan,
            String gioiTinh, String soDienThoai){
        super(CMND, hoTen, queQuan, gioiTinh, soDienThoai);
    }

    @Override
    public String toString() {
        return String.format("""
                             %s
                             Bo phan A
                             """, super.toString());  
    }
    
    

   @Override
    public double tinhLuong() {
        return super.tinhLuong()*1.2; 
    }
    
}
