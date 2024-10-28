/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmou.oop_ex02;

/**
 *
 * @author admin
 */
public class PhanSo {

    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public static int UCLN(int a, int b) {
        if(b==0) return a;
        else return UCLN(b,a%b);
    }
    
    public PhanSo rutGon(){
        int uoc = UCLN(this.tuSo,this.mauSo);
        return new PhanSo(this.tuSo/uoc,this.mauSo/uoc);
    }
    
    public void hienThi(){
        System.out.printf("%d/%d \n",this.tuSo,this.mauSo);
    }
    
    public PhanSo tong(PhanSo ps){
        int tuSo = this.tuSo*ps.mauSo + this.mauSo*ps.tuSo;
        int mauSo = this.mauSo*ps.mauSo;
        return new PhanSo(tuSo, mauSo);
    }
    
    public boolean isBangNhau(PhanSo ps1){
        if(this.tuSo*ps1.mauSo == this.mauSo*ps1.tuSo) 
            return true;
        return false;
    }

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

}
