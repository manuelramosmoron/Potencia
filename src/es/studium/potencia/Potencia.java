package es.studium.potencia;

import java.util.Scanner;

public class Potencia
{

	public static void main(String[] args)
	{Scanner teclado = new Scanner(System.in);
	int base, exponente, resultado, i;
	resultado = 1; //inicializar la variable resultado, ya que es una variable acumuladora(empiezan con 1 si es multiplicaci�n o divisi�n)
	System.out.println("Dame un n�mero para la base");
	base = teclado.nextInt();
	System.out.println("Dame un n�mero para el exponente");
	exponente = teclado.nextInt();
	teclado.close();
	for(i=1;i<=exponente;i++) // 1*2*2*2
	{
		resultado = resultado * base;
	}
	System.out.println("El n�mero " + base + " elevado a " + exponente + " vale " + resultado);

	}

}
