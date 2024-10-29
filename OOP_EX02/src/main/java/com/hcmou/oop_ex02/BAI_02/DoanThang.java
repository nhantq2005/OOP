/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hcmou.oop_ex02.BAI_02;

import com.hcmou.oop_ex02.BAI_01.Diem;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem diemDau;
    private Diem diemCuoi;

    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }
    
    
    
    public void hienThiDT(){
        System.out.printf("[(%.1f,%.1f),(%.1f,%.1f)]\n",diemDau.getHoanhDo(),diemDau.getTungDo(),
                diemCuoi.getHoanhDo(),diemCuoi.getTungDo());
    }
    
    public double tinhDoDai(){
//        return Math.sqrt(Math.pow(diemCuoi.getHoanhDo()-diemDau.getHoanhDo(),2)+
//Math.pow(diemCuoi.getTungDo()-diemDau.getTungDo(),2));
        return diemDau.tinhKhoangCach(diemCuoi);
    }
    
    public Diem timTrungDiem(){
        double x = (diemDau.getHoanhDo() + diemCuoi.getHoanhDo())/2;
        double y = (diemDau.getTungDo() + diemCuoi.getTungDo())/2;
        return new Diem(x, y);
    }
    
    public boolean isSongSong(DoanThang d){
        double tiLe1 = (this.diemDau.getHoanhDo()-this.diemCuoi.getHoanhDo())*(d.diemDau.getTungDo()-d.diemCuoi.getTungDo());
        double tiLe2 = (this.diemDau.getTungDo()-this.diemCuoi.getTungDo())*(d.diemDau.getHoanhDo()-d.diemCuoi.getHoanhDo());
        return tiLe1 == tiLe2;
    }

    /**
     * @return the diemDau
     */
    public Diem getDiemDau() {
        return diemDau;
    }

    /**
     * @param diemDau the diemDau to set
     */
    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }

    /**
     * @return the diemCuoi
     */
    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    /**
     * @param diemCuoi the diemCuoi to set
     */
    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }
}
