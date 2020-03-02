/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista_03;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lisandra.roque
 */


//Exercício 02 - Acerte o número
/*Crie uma classe chamada “Loteria” que:
Solicite um número entre 0 e 10 para o usuário. Tente advinhar o número digitado através de números randômicos(Random). 
A cada iteração exiba o número sorteado. Quando acontecer o “acerto” se a quantidade de vezes necessárias for:
1. Até 3: exiba "Você é MUITO sortudo" 2. Entre 4 e 10: exiba "Você é sortudo" 3. Mais de 10: exiba 
"É melhor você ser trabalhador"*/

public class Loteria {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer numero;
        Random aleatorio = new Random();
        
        
        System.out.println("Digite um número entre 0 e 10");
        numero = leitor.nextInt();
        
        
        
        
        
        
        
    }
}
