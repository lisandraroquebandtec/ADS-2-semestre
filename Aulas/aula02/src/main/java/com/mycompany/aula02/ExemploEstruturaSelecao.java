/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExemploEstruturaSelecao {
    
    public static void main(String[] args) {
        
        Integer idade, numero, valorDado, chute, diaSemana, lugar;
        
        String nomeFacul;
        
        Scanner leitor = new Scanner(System.in);
        
        // toda vez que formos usar next line e ele não parar pra digitar, cria um novo scanner
        Scanner leitorS = new Scanner(System.in);
        
        Random aleatorio = new Random();
        
        
        
        System.out.println("Digite a sua idade");
        idade = leitor.nextInt();
        
        // Exemplo de if sem else
        if(idade >= 18){
            System.out.println("Você já pode tirar a carteira de habilitação!"); 
        }
        
        System.out.println("Digite um número inteiro");
        numero = leitor.nextInt();
        
        // formula para saber se o numero é par ou impar, se for par o resultado será 0.
        if(numero % 2 == 0){
            System.out.println(numero + " é par");
        }
        else{
            System.out.println(numero + " é impar");
        }
        
        System.out.println("Digite o nome da sua faculdade");
        nomeFacul = leitorS.nextLine();
        
        if(nomeFacul.equals("Bandtec Digital School")){
            System.out.println("Parabéns!!!Ótima escolha!!!");
    }
        //vamos simular que estamos jogando com um dado       
        valorDado = aleatorio.nextInt(6)+1;
        // equals compara se um valor de um objeto é igual a um certo valor, comparação
        System.out.println("Tente advinhar o valor do dado");
        chute = leitor.nextInt();
        // se colocar ! na frente, ele verifica se o valor é diferente do valor dado.
        if(chute.equals(valorDado)){
            System.out.println("Parabéns!Você acertou!");
        }
        else{
            System.out.println("Não foi dessa vez!");
        }
        System.out.println("O valor do dado é " +valorDado);
        
        
        System.out.println("\nDigite um número de 1 a 7");
        diaSemana = leitor.nextInt();
        
        // a mesma coisa do switch só que com if
        /*if(diaSemana.equals(1)){
            System.out.println("Domingo");
        }
        else if(diaSemana.equals(2)){
            System.out.println("Segunda-feira");
        }*/
            
        switch (diaSemana){
            case 1: System.out.println("Domingo");
            break;
            case 2: System.out.println("Segunda-feira");
            break;
            case 3: System.out.println("Terça-feira");
            break;
            case 4: System.out.println("Quarta-feira");
            break;
            case 5: System.out.println("Quinta-feira");
            break;
            case 6: System.out.println("Sexta-feira");
            break;
            case 7: System.out.println("Sabádo");
            break;
            default:System.out.println("Número inválido");
            break;
        }
        
        System.out.println("Digite a sua colocação:" + 
                "\n1° lugar - ganha Iphone, Ipad, Ipod" 
                + "\n° lugar - ganha Ipad e Ipod"
                + "\n3° lugar - ganha Ipod");
        
        lugar = leitor.nextInt();
        
        System.out.println("Você ganhou");
        switch (lugar){
            case 1: System.out.println(" um Iphone,");
            case 2: System.out.println(" um Ipad e ");
            case 3: System.out.println(" um Ipod");
            break;
            default:System.out.println(" nada");
                  break;
        }
}
}
