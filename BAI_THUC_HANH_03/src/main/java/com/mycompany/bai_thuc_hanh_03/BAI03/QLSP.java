/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_thuc_hanh_03.BAI03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author trung
 */
public class QLSP {
    private List<SanPham> ds = new ArrayList();
    
    public void themSP (SanPham sp ){
        getDs().add(sp);
    }
    
    public void hienThi(){
        getDs().stream().forEach(sp -> System.out.println(sp));
    }
    
    public void xoaSP(String maSP){
        this.ds.removeIf(sp -> sp.getMaSP().toLowerCase().equals(maSP.toLowerCase()));
    }
    
    public void sapXep(){
        this.ds.stream().sorted((sp1,sp2)->sp1.compareTo(sp2)).forEach(sp->System.out.print(sp));
        
    }
    
    public void capNhat(String maSP){
        
    }
    
//    public SanPham timKiem(String maSP){
//        return this.ds.stream().filter(sp -> sp.getTenSP().toLowerCase().contains(maSP.toLowerCase())).findFirst().get();
//    }
    
    /**
     *
     * @param str
     * @return
     */
    public List<SanPham> timKiem(String str){
        try{
            Class c = Class.forName(str);
            return this.ds.stream().filter(s -> c.isInstance(s)).collect(Collectors.toList());
        }catch(ClassNotFoundException ex){
            return this.ds.stream().filter(sp -> sp.getTenSP().toLowerCase().contains(str.toLowerCase())).collect(Collectors.toList());
        }
    }
    
    public List<SanPham> timKiem(double max, double min){
        
        return null;
        
    }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }
    
    public 

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
    
    
}
