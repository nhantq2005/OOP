/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_ex01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class OOP_EX04 {
    public static boolean isPrime(int n){
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
//            System.out.printf("NHAP PHAN TU THU %d: ",i);
//            arr[i]=sc.nextInt();
              arr[i] = (int)(Math.random()*10);
        }
        return arr;
    }
    
    public static void outputArray(int []arr){
        for(var x:arr){
            System.out.printf("%d \t",x);
            
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP DO KICH THUOC MANG: ");
        int n = sc.nextInt();
        int []arr= new int[n];
        arr = inputArray(n);
        outputArray(arr);
//        Cau a
        System.out.printf("TONG CAC SO NGUYEN TO: %d\n",IntStream.of(arr).filter(x->isPrime(x)).sum());
//        Cau b
        System.out.printf("GIA TRI LON NHAT TRONG MANG LA: %d\n",IntStream.of(arr).filter(x->x>0).max().orElse(0));
        System.out.printf("GIA TRI NHO NHAT TRONG MANG LA: %d\n",IntStream.of(arr).filter(x->x>0).min().orElse(0));
//        Cau c
        System.out.printf("SO NGUYEN TO NHO NHAT TRONG MANG: %d\n",IntStream.of(arr).filter(x->isPrime(x)).min().getAsInt());
//        Cau d
        IntStream.of(arr).filter(x->isPrime(x)).sorted().forEach(System.out::print);
        IntStream.of(arr).filter(x->isPrime(x)==false).forEach(System.out::print);
//Cau e
        System.out.println("NHAP SO CAN TIM: ");
        int findValue = sc.nextInt();
        System.out.printf("VI TRI CUA %d LA: %d\n",findValue,Arrays.binarySearch(arr,findValue));

    }
}
