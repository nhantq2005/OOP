/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_tai_lieu;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trung
 */
public class QuanLy {
    private List<TaiLieu> ds = new ArrayList<>();
    
    public void hienThi(){
        this.ds.stream().forEach(tl->System.out.println(tl));
    }
    
    public void themTL(String loaiTL) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Class c = Class.forName(loaiTL);
        TaiLieu tl1= (TaiLieu) c.getDeclaredConstructor().newInstance();
        tl1.nhap();
        this.ds.add(tl1);
    }

    /**
     * @return the ds
     */
    public List<TaiLieu> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiLieu> ds) {
        this.ds = ds;
    }
}
