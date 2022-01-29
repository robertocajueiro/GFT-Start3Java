package me.dio.exercicio;

import java.util.Scanner;

/*
 * 	Faça um programa que pela N números inteiros, calcule e mostre a quantidade numeros pares e 
 * a quantidade de numeros impares
 * */

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidadeNumeros;
		int numero;
		int quantPares = 0; 
		int quantImpares = 0;
		
		System.out.println("Quantidade de numeros: ");
		quantidadeNumeros = sc.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("Número: ");
			numero = sc.nextInt();
			
			if(numero % 2 == 0 ) quantPares++;
			else quantImpares++;
			
			count++;
			
		} while( count < quantidadeNumeros);
		
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade impar: " + quantImpares);

	} 

}
