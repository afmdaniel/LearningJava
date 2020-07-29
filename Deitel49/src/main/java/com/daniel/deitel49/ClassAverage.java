/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.deitel49;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ClassAverage {
    public static void main(String[] args){
        double total = 0;
        int cont = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.printf("Insira a nota ou finalize o processo (-1): ");
        double nota = input.nextDouble();
        
        
        while (nota != -1){
            total += nota;
            cont++;
            System.out.printf("Insira a próxima nota ou finalize o processo(-1): ");
            nota = input.nextDouble();
        }
        
        if (cont != 0){
            double media = total/cont;
            System.out.printf("Class Average: %.2f%n", media);
        } else {
            System.out.println("Nenhum nota foi inserida!");
        }
    }
    
}
