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
public class idade {
    public static void main(String[] args) {
        String nome;
        Integer anoDeNascimento;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:");
        nome = leitor.nextLine();
        
        System.out.println("Olá " +nome+ "! Qual o ano de seu nascimento?");
        anoDeNascimento = leitor.nextInt();
        
        System.out.println("Em 2030 você terá " +(2030 - anoDeNascimento));
    }
}
