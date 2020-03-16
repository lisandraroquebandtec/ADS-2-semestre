/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula02;

/**
 *
 * @author Aluno
 */
public class Interpolacao {
    
    public static void main(String[] args) {
        
        String nome = "Lisandra Lopes";
        String facul = "Bandtec";
        String texto = String.format("Meu nome é %s e trabalho na %s", nome, facul);
        String comando = "println";
        // integersão números inteiros 
        Integer numeroInteiro = 44;
        // double são números decimais
        Double outroNumero = 44.87654323456;
        
        
        System.out.println(texto);
        
        System.out.println(String.format("testando via %s", comando));
        // para printar um numero inteiro na interpolação usasse %d
        
        System.out.println(String.format("Um número inteiro %d",numeroInteiro));
        
        // printando numeros decimais usasse %.numerodecasasquevocequerf
        //se usar somente o %f o maximo de casas que vai aparecer é 6
        System.out.println(String.format("Com casas decimais %.2f", outroNumero));
    }
}
