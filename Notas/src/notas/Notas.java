package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota;
		String resultado;
		System.out.print("Introduzca el valor de una calificación: ");
		nota = reader.nextInt();

		resultado = califica(nota);

		System.out.println(resultado);
		reader.close();
	}

	/**
	 * @param nota
	 * @return
	 * @deprecated Use {@link #califica(int)} instead
	 */
	public static String cali(int nota) {
		return califica(nota);
	}

	/**
	 * @param num_nota
	 * @return
	 */
	public static String califica(int num_nota) {
		String resultado;
		if (num_nota >= 0 && num_nota < 5)
			resultado = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			resultado = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			resultado = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			resultado = "Sobresaliente";
		else
			resultado = "El valor de la calificación introducida no es correcta";
		return resultado;
	}
}