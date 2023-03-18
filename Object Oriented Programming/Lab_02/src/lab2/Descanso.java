package lab2;

/**
* Descanso � uma classe integrante do projeto CoISA. Representa a Rotina de Descanso 
* de um aluno com base na m�dia de horas de descanso por semana.
* 
* @author Yalle Rocha
*/
public class Descanso {
	
	/**
	* horasDescanso � um atributo do tipo inteiro que recebe o n�mero
	* total de horas de descanso do aluno ao longo da semana(s). � inicializado
	* como valor inteiro 0 (zero).
	*/
	private int horasDescanso = 0;
	
	/**
	* numeroSemanas � um atributo do tipo inteiro que recebe o n�mero
	* de semanas referente ao tempo de descanso do aluno. � inicializado
	* com o valor inteiro 1 (um).
	*/
	private int numeroSemanas = 1;
	
	/**
	* statusGeral � um atributo do tipo string que recebe a palavra
	* "cansado" ou "descansado" de acordo com a m�dia de horas que o
	* aluno descansou por semena. � inicializado com a string "cansado".
	*/
	private String statusGeral = "cansado";
	
	/**
	* O m�todo defineHorasDescanso recebe o n�mero de horas descansadas pelo
	* aluno como par�metro e registra o valor no atributo horasDescanso.
	* 
	* @param n�mero de horas descansadas (int).
	*/
	public void defineHorasDescanso(int valor) {
		horasDescanso = valor;
	}
	
	/**
	* O m�todo defineNumeroSemanas recebe o n�mero de semanas referente ao tempo
	* de descanso dp aluno como par�metro e registra o valor no atributo numeroSemanas.
	* 
	* @param n�mero de semanas referente ao tempo de descanso (int).
	*/
	public void defineNumeroSemanas(int valor) {
		numeroSemanas = valor;
	}
	
	/**
	* O m�todo getStatusGeral calcula a m�dia de horas descansadas por semana e, se
	* a m�dia for maior ou igual a 26, o atributo statusGeral recebe a string "descansado".
	* Caso contrario, o atributo recebe a string "cansado".
	*
	* @return o atributo statusGeral definido como "cansado" ou "descansado" (string).
	*/
	public String getStatusGeral() {
		int media = horasDescanso / numeroSemanas;

		if(media >= 26) {
			statusGeral = "descansado";
		} else {
			statusGeral = "cansado";
		}
		return statusGeral;
	}
}
