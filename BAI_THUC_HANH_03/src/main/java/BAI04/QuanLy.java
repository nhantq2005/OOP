/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author trung
 */
public class QuanLy {
    private ArrayList<TaiKhoan> ds = new ArrayList<>();
    
    public void them(TaiKhoan...tk){
        this.ds.addAll(Arrays.asList(tk));
    }
    
    public void xoa(TaiKhoan tk){
        this.ds.remove(tk);
    }
    
    public void hienThi(){
        this.ds.stream().forEach(tk -> System.out.println(tk));
    }
}
