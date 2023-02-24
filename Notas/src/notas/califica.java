package notas;

/**
 * Clase a la que se le hace refencia desde Notas para devolver el resultado
 * @author Oussama Atifi
 * @version 1.0 24/02/2023
 * @see Notas
 * */
public class califica {

	/**
	 * Metodo que obtiene un numero y devuelve su resultado.
	 * @param num_nota contiene la nota que se le da desde la clase Notas
	 * @return resultado
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
	}// Cierre del metodo califica

}// Cierre de la clase
