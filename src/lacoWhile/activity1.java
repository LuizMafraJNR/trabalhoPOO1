package lacoWhile;

import java.util.Scanner;

public class activity1
{
	public static void main(String[] args)
	{
		/**
		 * Faça um programa que imprima a tabuada escolhida pelo usuario.
		 */
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite qual a tabuada que voce gostaria de saber: ");
		int tabuada = leitor.nextInt();

		for (int i = 1; i <= 10; i++){
			int calculoTabuada = tabuada * i;
			String resultados = String.format("%d x %d = %d",tabuada,i,calculoTabuada);
			System.out.println(resultados);
		}
	}
}
