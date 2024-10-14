/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.oop_ex01;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class OOP_EX01 {

    public static void main(String[] args) {
        int randomValue = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);
        int guessValue;
        do {
            System.out.println("NHAP SO BAN DOAN: ");
            guessValue = sc.nextByte();
            
            if(guessValue>randomValue){
                System.out.println("LON HON");
            }else if(guessValue<randomValue){
                System.out.println("NHO HON");
            }else{
                System.out.println("CHINH XAC!");
            }
        } while (guessValue!=randomValue);

    }
}
