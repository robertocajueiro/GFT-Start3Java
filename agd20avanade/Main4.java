package me.dio.exercicio.agd20avanade;

import java.io.IOException;
import java.util.Scanner;

//Desafio
//Desenvolva um programa que leia um valor inteiro N. Este N refere-se � quantidade de linhas de
//sa�da que ser�o apresentadas na execu��o do programa.
//
//Entrada
//O arquivo de entrada cont�m um n�mero inteiro positivo N.
//
//Sa�da
//Imprima a sa�da conforme o exemplo fornecido.

//7
//1 2 3 PUM
//5 6 7 PUM
//9 10 11 PUM
//13 14 15 PUM
//17 18 19 PUM
//21 22 23 PUM
//25 26 27 PUM



public class Main4 {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n, i, aux=1;
		
		n = sc.nextInt();
		
		//Escreva o seu c�digo
		
		aux = n * 4;
		
		for(i=1; i<=aux; i++) {
			if(i % 4 == 0) {
				System.out.println(" PUM");
			}
			
			else {
				System.out.print(" " + i);
			}
			
			sc.close();
		}
		
	
	}
}
