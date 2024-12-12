/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqn.quan_ly_hoc_sinh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author trung
 */
public class QuanLy {
    private List<HocSinh> ds = new ArrayList<>();
    
    public void nhap(HocSinh...hs){
        this.getDs().addAll(Arrays.asList(hs));
    }
    
    public void nhap(){
        HocSinh hs = new HocSinh();
        hs.nhap();
        this.ds.add(hs);
    }
    
    public void hienThi(){
        this.ds.stream().forEach(hs->System.out.println(hs));
    }

    /**
     * @return the ds
     */
    public List<HocSinh> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocSinh> ds) {
        this.ds = ds;
    }
}
