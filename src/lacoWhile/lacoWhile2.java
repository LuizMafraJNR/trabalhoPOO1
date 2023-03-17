package lacoWhile;

public class lacoWhile2

{
	public static void main(String[] args)
	{

		//Exemplo ainda usando o While
		int contador = 0;
		while(contador < 10) {
			System.out.println("Repetiu "+contador);
			contador++;
		}
		System.out.println("Chegou no numero 10, laço cortado!");

		//Exemplo usando o For
		for(int i = 0; i < 10; i++) {
			System.out.println("Repetiu "+i);
		}

		for(int i = 10; i > 0; i--) {
			System.out.println("Repetiu "+i);
		}

		for(int i = 0; i < 10; i=i+2) {
			System.out.println("Repetiu "+i);
		}
	}
}
