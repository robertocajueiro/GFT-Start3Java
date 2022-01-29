package me.dio.exercicio;

import java.util.Scanner;

/*
 *  Faça um programa que pela uma nota, entre zero e dez,
 *  Mostre uma mensagem caso o valor seja inválido e continue pedindo
 *  até que o usuario inform um valor válido.
 * */

public class Ex2_Nota {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = sc.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inválida! Digite novamente");
			nota = sc.nextInt();
		}
		
		sc.close();
	}

}
