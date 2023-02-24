package notas;

public class califica {

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
