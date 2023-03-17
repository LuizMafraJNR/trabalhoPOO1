package lacoWhile;

public class doWhile
{
	public static void main(String[] args)
	{
		// executa, depois testa a condição
		// do while garante que executa uma vez
		int contador = 0;
		do {
			System.out.println("contador: "+contador);
			contador++;
		} while (contador < 10);
	}
}
