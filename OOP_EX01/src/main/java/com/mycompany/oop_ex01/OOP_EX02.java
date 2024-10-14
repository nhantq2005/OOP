/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_ex01;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class OOP_EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("NHAP BAC CUA HAM F(x): ");
        int bac = sc.nextByte();
        
        System.out.print("NHAP GIA TRI CUA x: ");
        double x = sc.nextDouble();
        
        double heSo;
        double ketQua = 0;
        for(int i =0;i<=bac;i++){
            System.out.printf("NHAP GIA TRI CUA BAC %d: ",i);
            heSo=sc.nextDouble();
            ketQua+= heSo*Math.pow(x, i);
        }
        System.out.printf("KET QUA LA: %.1f: ",ketQua);
        
       
    }
}
