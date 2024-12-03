/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlynhanvien;

/**
 *
 * @author trung
 */
public class KySu extends CanBo{
    private String nganhDaoTao;
    
    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    /**
     * @return the nganhDaoTao
     */
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    /**
     * @param nganhDaoTao the nganhDaoTao to set
     */
    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    @Override
    public String toString(){
        return String.format(
                "Ho ten: %s\n"
                        + "Tuoi: %d\n"
                        + "Gioi tinh: %s\n"
                        + "Dia chi: %s\n"
                        + "Nganh dao tao: %s\n",
                this.getHoTen(),this.getTuoi(),this.getGioiTinh(),
                this.getDiaChi(),this.nganhDaoTao
        );
    }
}
