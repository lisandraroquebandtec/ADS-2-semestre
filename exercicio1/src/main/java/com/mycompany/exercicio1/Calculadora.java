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
public class Calculadora {
    // declara a executavel main
    public static void main(String[] args) {
        //declara as variaveis de numeros decimais
        Double numero1, numero2;
        // Para o programa ler o que o usuário esta digitando
        Scanner leitor = new Scanner(System.in);
        // Indicando o que o leitor deve escrever
        System.out.println("Digite um número:");
        // atribuindo o que o usuário escreveu a variavel
        numero1 = leitor.nextDouble();
        
        System.out.println("Digite um outro número:");
        numero2 = leitor.nextDouble();
        
        System.out.println("O resultado da soma é" +(numero1 + numero2));
        System.out.println("O resultado da subtração é" +(numero1 - numero2));
        System.out.println("O resultado da multiplicação é" +(numero1 * numero2));
        System.out.println("O resultado da divisão é" +(numero1 / numero2));
    }
}
