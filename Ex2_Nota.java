package me.dio.exercicio;

import java.util.Scanner;

/*
 *  Fa�a um programa que pela uma nota, entre zero e dez,
 *  Mostre uma mensagem caso o valor seja inv�lido e continue pedindo
 *  at� que o usuario inform um valor v�lido.
 * */

public class Ex2_Nota {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = sc.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inv�lida! Digite novamente");
			nota = sc.nextInt();
		}
		
		sc.close();
	}

}
