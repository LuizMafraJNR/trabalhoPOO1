package lacoWhile;

import java.util.Scanner;

public class trabalhoOne
{
	/**
	 * 1.a) javac arquivoJava.java
	 * 1.b) java arquivoJava.java
	 * 1.c) public class HelloWorld {}
	 *
	 * 2. public static void main(String[] args){}
	 *
	 * 3.a) Scanner, biblioteca do java.util
	 */
	public static void main(String[] args)
	{
//		// 3.b)
//		Scanner leitor = new Scanner(System.in);
//		// 3.c) leitor.nextInt();
//		// 3.d) leitor.nextLine();
//		// 3.e) leitor.nextDouble();
//
//		 3.a) double saldo = 3900.98;
//		 3.b) { }
//		 3.c) ;
//
//		 4.a) tipo int é 32 bits e long 64 bits
//		 4.b) tipo float é 32 bits e double 64 bits
//
//		// 5. o System.out.print, escreve tudo na mesma linha. Enquanto o System.out.println, escreve pulando linha a cada "println".
//		// 6
		int a = 3;
		if (a != 3)
		{
			System.out.println("A é diferente de 3");
		} else {
			System.out.println("A é igual a 3");
		}
		// 7
		// 7.1
		int contador = 0;
		do {
			System.out.println(contador);
			contador ++;
		} while (contador < 10);
		// 7.2
		for(int i=0; i <= 10; i++){
			System.out.println(i);
		}
		//7.3
		contador = 0;
		while (contador < 10)
		{
			System.out.println(contador);
			contador++;
		}

	}
}
