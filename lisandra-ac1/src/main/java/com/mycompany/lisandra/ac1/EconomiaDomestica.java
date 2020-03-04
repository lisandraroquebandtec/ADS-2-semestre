/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lisandra.ac1;


import java.util.Scanner;

/**
 *
 * @author Aluno
 */

public class EconomiaDomestica {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String nome;
        Integer dia = 1;
        Double valor = 0.00;
        Double  deposito;
       
        
        System.out.println("Qual o seu primeiro nome?");
        nome = leitor.next();
        
        
       while(dia <=7){
           System.out.println("Valor depositado no " +dia+ "° dia:");
           deposito = leitor.nextDouble();
           
           if(deposito == 0.01 || deposito == 0.05 || deposito == 0.10|| deposito == 0.25 || deposito == 0.50 || deposito == 1.00){
           valor += deposito;
           dia ++;
           }
           else {
               System.out.println("Insira um valor válido");
           }
    }
        System.out.println(String.format("Ao final de 7 dias,%s guardou R$%.2f", nome, valor));
}
}