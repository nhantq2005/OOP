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
public class OOP_EX04 {
    public static boolean soNT(int n){
        if(n<2)
            return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int[] inputArray(int n){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            System.out.printf("NHAP PHAN TU THU %d: ",i);
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    
    public static void outputArray(int []arr){
        for(var x:arr){
            System.out.printf("%d \t",x);
            
        }
        System.out.println("");
    }
    
    public static int tongSNT(int []arr){
        int tong = 0;
        for(var x:arr){
            if(soNT(x)){
                tong+=x;
            }
        }
        return tong;
    }
    
    @SuppressWarnings("empty-statement")
    public static String findMaxMin(int []arr){
        int max = arr[0];
        int min = arr[0];
        
        if (arr.length == 0) {
            return "*";
        } else {
            for (var x : arr) {
                if (x < min) {
                    min = x;
                }
                if (x > max) {
                    max = x;
                }
            }
            return "MAX: "+max+" MIN: "+min;
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP DO KICH THUOC MANG: ");
        int n = sc.nextInt();
        int []arr= new int[n];
        arr = inputArray(n);
        outputArray(arr);
        int tongNT = tongSNT(arr);
        System.out.printf("TONG CAC SO NGUYEN TONG: %d",tongNT);
        String maxmin = findMaxMin(arr);
        System.out.println(maxmin);
    }
}
