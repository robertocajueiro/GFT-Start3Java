package me.dio.exercicio.agd20avanade;

import java.util.Scanner;

//Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo 
//resto da divis�o dele por 5 for igual a 2 ou igual a 3.
//
//Entrada
//O arquivo de entrada cont�m 2 valores positivos inteiros quaisquer, n�o necessariamente em 
//ordem crescente.
//
//Sa�da
//Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
//
// entrada 10 18
//
	// saida
//12
//13
//17

public class DIO {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();
        int cont = 0;

      //Escreva o seu c�digo aqui
        
        if(x > y) {
        	for(cont=y+1; cont < x; cont++) {
        		if (cont % 5 == 2 || cont % 5 == 3) {
        			System.out.println(cont);}
        		}
        	} else if (x < y) {
        		for(cont = x+1; cont < y; cont++) {
        			if(cont % 5 == 2 || cont % 5 == 3) {
            			System.out.println(cont);
        			}
        		}
        	} 
        		inp.close();
        } 
}

