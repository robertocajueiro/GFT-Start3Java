package me.dio.exercicio;

import java.util.Scanner;

/*
 * 	Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualqeru numero inteiro entre 1 a 10.
 * O usuário deve informar de qual numero ele deseja ver a tabuada.
 * A saida deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 x 2 = 10
 * ...
 * */

public class Ex5_Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de tabuada: ");
		int tabuada = sc.nextInt();
		
		System.out.println("Tabuada de: "+ tabuada);
		
		for(int i = 1; i<=10 ; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}

	}

}
