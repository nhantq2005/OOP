/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quan_ly_tai_lieu;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trung
 */
public class QUAN_LY_TAI_LIEU {

    public static void main(String[] args) {
        try {
            QuanLy ql = new QuanLy();
            ql.themTL("com.mycompany.quan_ly_tai_lieu.TapChi");
            ql.hienThi();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(QUAN_LY_TAI_LIEU.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
