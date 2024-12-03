package com.hcmou.oop_ex02.BAI_06;

import com.hcmou.oop_ex02.BAI_05.PhanSo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSPhanSo {
    private List<PhanSo> danhSach = new ArrayList<>();

    public void them(PhanSo ps){
        danhSach.add(ps);
    }
    
    public void them(PhanSo... ps){
        this.danhSach.addAll(Arrays.asList(ps));
    }
    
    public void them(){
        PhanSo ps = new PhanSo();
        ps.nhapPS();
        this.danhSach.add(ps);
    }

    public void hienThi(){
        danhSach.stream().forEach(ps -> ps.hienThi());
    }

//    Xoá một phân số khỏi danh sách, nạp chồng trường hợp truyền phần số và trường
//    hợp truyền tử và mẫu của phân số vào phương thức.
    public void xoa(PhanSo ps){
        danhSach.removeIf(x->x.isBangNhau(ps));
    }

    public PhanSo tongDS(){
        return danhSach.stream().reduce(new PhanSo(),(t,x)->t.cong(x));
    }

    public PhanSo timGTLN(){
        return danhSach.stream().max((p1,p2)->p1.soSanh(p2)).get();
    }

    public PhanSo timGTNN(){
        return danhSach.stream().min((p1,p2)->p1.soSanh(p2)).get();
    }

    public void sapXep(){
        danhSach.stream().sorted((p1,p2)-> p1.soSanh(p2)).forEach(x->x.hienThi());
    }
}
