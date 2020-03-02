/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista_03;

/**
 *
 * @author lisandra.roque
 */
//Exercício 05 - VariacaoContador
//Crie uma classe chamada “ContadorVariado” que:
//Usando for, começe exibindo o valor 0.15 e depois 0.30, depois 0.45, depois 0.60... ou
//seja, aumente de 0.15 em 0.15 a cada iteração até que o último número seja
//menor que 5. Use interpolação p/ exibir o número com 2 casas decimais.

public class ContadorVariado {
    public static void main(String[] args) {
        
       for(Double numero= 0.15; numero < 5; numero+=0.15){
            System.out.println(String.format("%.2f", numero));
        
       }
    }
}
