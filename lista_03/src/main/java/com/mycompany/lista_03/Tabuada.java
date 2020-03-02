/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista_03;

import java.util.Scanner;

/**
 *
 * @author lisandra.roque
 */
public class Tabuada {
    
    public static void main(String[] args) {
        
    Integer numero,multiplicacao;
    Scanner leitor = new Scanner(System.in);
    
        System.out.println("Digite um número");
        numero = leitor.nextInt();
    
        Integer cont = 1;
        
        while(cont <=10){
            multiplicacao = numero * cont;
            System.out.println(+numero+"x" +cont+ "="+multiplicacao);
            cont ++;
        }
        
    }
 
}
