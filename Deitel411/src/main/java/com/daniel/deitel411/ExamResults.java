/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel.deitel411;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ExamResults {
    public static void main(String[] args){
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        
        Scanner input = new Scanner(System.in);
        
        while (count++ < 10){
            System.out.printf("Inserir resultado (1 = Aprovado/2 = Reprovado): ");
            int resultado = input.nextInt();
            while (resultado != 1 && resultado !=2){
                System.out.printf("Insira um resultado válido (1/2): ");
                resultado = input.nextInt();
            }
            if (resultado == 1){
                count1++;                
            } else {
                count2++;
            }
        }
        
        System.out.println("=============================");
        System.out.printf("Alunos aprovados: %d\n", count1);
        System.out.printf("Alunos reprovados: %d\n", count2);
        System.out.println("=============================");
        
        if (count1 > 8 ){
            System.out.println("Bonus to instructor!");
        }       
    }
}
