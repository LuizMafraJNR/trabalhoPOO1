package lacoWhile;

import java.util.Random;
import java.util.Scanner;

public class lacoWhile
{
	public static void main(String[] args)
	{
		Random gerador = new Random();
		Scanner leitor = new Scanner(System.in);
		int secreto = gerador.nextInt();

		// Laço while
		while (true) {
			System.out.println("Digite um número: ");
			int i = leitor.nextInt();
			if(secreto == i){
				System.out.println("ACERTOUUUUUU");
				break;
			}
			System.out.println("ERROU");
		}
	}
}
