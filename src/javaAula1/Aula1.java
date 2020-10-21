package javaAula1;

import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		int i = 0;
		
		while(i <= 10) {
			System.out.println("O valor de i é: " + i);
			i++;
		}
		
		/*
		for(int i = 0; i<=10;i++) {
			System.out.println("O valor de i é: " + i);
		}
		
		/*Scanner ler = new Scanner(System.in);
		int i = 0;
		
		System.out.println("Escolher o valor de i: ");
		i = ler.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("O valor de i: " + i);
		break;
		
		case 2:
			System.out.println("O valor de i: " + i);
		break;
		
		case 3:
			System.out.println("O valor de i: " + i);
		break;
		
		default:
			System.out.println("Esse valor não é válido");
		break;
		}
		/*
		//atribuindo valor boolean false a variável valor
		boolean valor=false;
				
		//iniciando a estrutura if
		if(valor == true) {
		//Se o valor for = true, exiba a mensagem
		System.out.print("Essa lógica é verdadeira");
		}
		else {
			//Se o valor for = false, exiba a mensagem
			System.out.print("Essa lógica é falsa");
		}
		*/
	}

}
