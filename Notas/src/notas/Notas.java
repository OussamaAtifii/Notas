package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota;
		String resultado;
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();

		if (nota >= 0 && nota < 5)
			resultado = "Suspenso";
		else if (nota >= 5 && nota < 7)
			resultado = "Aprobado";
		else if (nota >= 7 && nota < 9)
			resultado = "Notable";
		else if (nota >= 9 && nota <= 10)
			resultado = "Sobresaliente";
		else
			resultado = "El valor de la calificación introducida no es correcta";

		System.out.println(resultado);
		reader.close();
	}
}