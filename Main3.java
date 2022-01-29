package me.dio.exercicio;

//Desafio
//Voc� recebeu desafio para determinar qual dos produtos � o prefer�ncial dos clientes de um posto de abastecimento de combust�vel. Para isso voc� deve escrever um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado for o n�mero 4.
//
//Entrada
//A entrada cont�m apenas valores inteiros e positivos.
//
//Sa�da
//Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combust�vel, conforme exemplo.
//
// 
//Exemplo de Entrada	Exemplo de Sa�da
//8
//1
//7
//2
//2
//4
//
//MUITO OBRIGADO
//Alcool: 1
//Gasolina: 2
//Diesel:

import java.io.IOException;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		
	  int combustivel, stop=1;
		int soma1=0, soma2=0, soma3=0;

		
		while (stop != 2){
			if (stop == 1){
				combustivel = sc.nextInt();
				if (combustivel == 1){
					soma1 = soma1 + 1;
				}
				else if (  combustivel == 2){
					    soma2++;
				}
				else if (  combustivel == 3 ){
					soma3++;
				}
				else if (  combustivel == 4 ){
					stop = 2;
				}
				else {
				 stop = 1;
				}
			}
			if (stop == 2){
				System.out.println("MUITO OBRIGADO");
				System.out.printf("Alcool: %d\n",soma1);
				System.out.printf("Gasolina: %d\n",soma2);
				System.out.printf("Diesel: %d\n",soma3);
			}
		}
		sc.close();
	}
}
