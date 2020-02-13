/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Elevador {
    public static void main(String[] args) {
        
        Double pesoLimite,total;
        Integer limitePessoas;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o peso limite do elevador?");
        pesoLimite = leitor.nextDouble();
        
        System.out.println("Qual o limite de pessoas no elevador?");
        limitePessoas = leitor.nextInt();
        
        System.out.println("Qual o peso da 1° pessoa que entrou no elevador?");
        total = leitor.nextDouble();
        
        System.out.println("Qual o peso da 2° pessoa que entrou no elevador?");
        total += leitor.nextDouble();
        
        System.out.println("Qual o peso da 3° pessoa que entrou no elevador?");
        total += leitor.nextDouble();
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " +limitePessoas+ "pessoas.");
        
        System.out.println("O peso total no elevador é de " +total+ " sendo que ele suporta " +pesoLimite);
    }
}
