/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class OOP_EX03 {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        
//        System.out.print("NHAP EMAIL: ");
//        String email = sc.nextLine();
//        System.out.println("DIA CHI LA: "+email.substring(0, email.indexOf("@")));

//        System.out.print("NHAP CHUOI: ");
//        String inputString = sc.nextLine();
//        int countUpper = 0;
//        for(int i = 0;i<inputString.length();i++){
//            if(Character.isUpperCase(inputString.charAt(i))){
//                countUpper++;
//            }
//        }
//        System.out.printf("SO KY TU IN HOA: %d",countUpper);
        File f = new File("src\\main\\resource\\data.txt");
        try(Scanner sc = new Scanner(f)){
            String dataString = sc.nextLine();
            System.out.println(dataString);
        }
    }
}
