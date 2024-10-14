/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop_ex01;

import static java.lang.Double.sum;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */

public class OOP_EX05 {
    public static int [][]createMatrix(int row, int column){
        int[][] matrix = new int[row][column];
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = (int)(Math.random()*100);
            } 
        }
        return matrix;
    }
    
    public static void proccessMatrix(int[][]matrix, int row, int column){
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.printf("%d \t",matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void sumRow(int[][]matrix, int row){
 
        for(int i =0;i<row;i++){
            int sum = IntStream.of(matrix[i]).sum();
            System.out.println("TONG DONG "+i+": "+sum);
        }
    }
    
    public static void maxRow(int[][]matrix, int row){
        
        for(int i =0;i<row;i++){
            var max = IntStream.of(matrix[i]).max();
            System.out.println("GIA TRI LON NHAT DONG "+i+": "+max);
            
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP SO DONG: ");
        int row = sc.nextInt();
        System.out.print("NHAP SO COT: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        matrix = createMatrix(row, column);
        proccessMatrix(matrix, row, column);
        sumRow(matrix, row);
        maxRow(matrix, row);
    }
}
