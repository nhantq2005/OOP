/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI05;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author trung
 */
public class QuanLy {
    private List<NhanVien> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void them(NhanVien...nv){
        this.ds.addAll(Arrays.asList(nv));
    }
    
    public void them(String boPhan) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Class c = Class.forName(boPhan);
        NhanVien nv = (NhanVien) c.getDeclaredConstructor().newInstance();
        nv.nhap();
        this.ds.add(nv);
    }
    
    public void hienThi(){
        this.ds.stream().forEach(nv->System.out.println(nv));
    }
    
    /**
     *
     * @param hoTen
     * @return
     */
//    public List<NhanVien> traCuu(String hoTen){
//        return this.ds.stream().filter(nv -> nv.getHoTen().contains(hoTen)).collect(Collectors.toList());
//    }
    
    /**
     *
     * @param CMND
     * @return
     */
//    public NhanVien traCuu(String CMND){
//        return this.ds.stream().filter(nv -> nv.getCMND().equals(CMND)).findFirst().get();
//    }
//    
        public List<NhanVien> traCuu(String queQuan){
        return this.ds.stream().filter(nv -> nv.getQueQuan().equals(queQuan)).collect(Collectors.toList());
    }
    
    public void tinhLuongNV(){
        this.ds.stream().forEach(nv->{
            System.out.println(nv);
            System.out.print("Nhap so ngay cong: ");
            int soNgayCong = sc.nextInt();
            nv.setSoNgayCong(soNgayCong);
            nv.tinhLuong();
        });
        this.ds.stream().forEach(nv -> System.out.println(nv.hienThiLuong()));
    }

    /**
     * @return the ds
     */
    public List<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }
}
