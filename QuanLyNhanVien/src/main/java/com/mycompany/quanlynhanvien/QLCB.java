/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlynhanvien;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trung
 */
public class QLCB {
    private List<CanBo> dsCanBo = new ArrayList<>();
    
    public void themCanBo(CanBo canBo){
        dsCanBo.add(canBo);
    }
    
    public void hienThi(){
//        this.dsCanBo.stream().forEach(cb -> cb.toString());
        this.dsCanBo.forEach(cb -> System.out.println(cb));
    }
    
    public void timKiem(String ten){
        for(var x : dsCanBo){
            if(x.getHoTen().equals(ten)){
                System.out.println(x);
            }
        }
    }

    /**
     * @return the dsCanBo
     */
    public List<CanBo> getDsCanBo() {
        return dsCanBo;
    }

    /**
     * @param dsCanBo the dsCanBo to set
     */
    public void setDsCanBo(List<CanBo> dsCanBo) {
        this.dsCanBo = dsCanBo;
    }
}
