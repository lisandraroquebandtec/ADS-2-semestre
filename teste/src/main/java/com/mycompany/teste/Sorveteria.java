/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste;

import java.util.Scanner;

/**
 *
 * @author lisandra.roque
 */
public class Sorveteria {
    public static void main(String[] args) {
        String produto;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual produto você deseja?");
        System.out.println(
                 " casquinha \n"
                + " sundae \n"
                + " milkshake \n");
        
        produto = leitor.nextLine();
        
     switch (produto){
         case "casquinha" : System.out.println("casquinha custa R$ 2,00");
         break;
         case "sundae" : System.out.println("sundae custa R$ 5,00");
         break; 
         case "milkshake" : System.out.println("milkshake custa R$ 7,00.");
         break;
     }
   
        
        
        
        
        
    }
}
