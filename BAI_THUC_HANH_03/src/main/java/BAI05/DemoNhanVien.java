/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI05;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author trung
 */
public class DemoNhanVien {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, InstantiationException, IllegalAccessException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        QuanLy ql = new QuanLy();
        
        NhanVien nv1 = new BoPhanA("121", "Nhan", "LA", "NAM", "792");
        NhanVien nv2 = new BoPhanB("122", "Nam Nhan", "DN", "NAM", "413");
        NhanVien nv3 = new BoPhanC("123", "Phuong", "LD", "Nu", "752");
        NhanVien nv4 = new BoPhanC("124", "Tuong", "LA", "NAM", "852");
        NhanVien nv5 = new BoPhanB("125", "Ngan", "ST", "Nu", "082");
        ql.them(nv1,nv2,nv4,nv3,nv5);
//        ql.them("BAI05.BoPhanA");
//        
//        ql.hienThi();
//        ql.traCuu("Nhan").forEach(nv->System.out.println(nv));
//        System.out.println(ql.traCuu("121"));
          ql.traCuu("LA").forEach(nv->System.out.println(nv));

        
    }
}
