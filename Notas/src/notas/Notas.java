package notas;

import java.util.Scanner;

/**
 * Clase que al indicarle una nota, nos devuelve su resultado.
 * @author Oussama Atifi
 * @version 1.0 24/02/2023
 * */
public class Notas {
	
	/**
	 * Metodo main en el que se realizara todo el proceso de devolver resultado.
	 * @param args argumentos que se indican en las propiedades del proyecto
	 * */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
		int nota; // Varible nota
		String resultado; // Variable resultado
		System.out.print("Introduzca el valor de una calificación: "); // Pedir al usuario el dato numerico
		nota = reader.nextInt(); // Leer el dato numero introducido por el usuario

		resultado = notas.califica.califica(nota); // Resultado es el valor que nos devuelve el metodo califica

		System.out.println(resultado); // Mostrar por consola el resultado
		reader.close();
	}

	/**
	 * @param nota se le indica desde la clase main y es obtenida por el usuario
	 * @return devuelve resultado
	 * @deprecated Use {@link notas.califica#califica(int)} instead
	 */
	public static String cali(int nota) {
		return notas.califica.califica(nota);
	}

	/**
	 * @param num_nota se le indica desde la clase main y es obtenida por el usuario
	 * @return devuelve resultado
	 * @deprecated Use {@link califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return califica.califica(num_nota);
	} 
} // Cierre de la clase