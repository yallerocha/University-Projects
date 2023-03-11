package lab2;

/**
* Descanso é uma classe integrante do projeto CoISA. Representa a Rotina de Descanso 
* de um aluno com base na média de horas de descanso por semana.
* 
* @author Yalle Rocha
*/
public class Descanso {
	
	/**
	* horasDescanso é um atributo do tipo inteiro que recebe o número
	* total de horas de descanso do aluno ao longo da semana(s). É inicializado
	* como valor inteiro 0 (zero).
	*/
	private int horasDescanso = 0;
	
	/**
	* numeroSemanas é um atributo do tipo inteiro que recebe o número
	* de semanas referente ao tempo de descanso do aluno. É inicializado
	* com o valor inteiro 1 (um).
	*/
	private int numeroSemanas = 1;
	
	/**
	* statusGeral é um atributo do tipo string que recebe a palavra
	* "cansado" ou "descansado" de acordo com a média de horas que o
	* aluno descansou por semena. É inicializado com a string "cansado".
	*/
	private String statusGeral = "cansado";
	
	/**
	* O método defineHorasDescanso recebe o número de horas descansadas pelo
	* aluno como parâmetro e registra o valor no atributo horasDescanso.
	* 
	* @param número de horas descansadas (int).
	*/
	public void defineHorasDescanso(int valor) {
		horasDescanso = valor;
	}
	
	/**
	* O método defineNumeroSemanas recebe o número de semanas referente ao tempo
	* de descanso dp aluno como parâmetro e registra o valor no atributo numeroSemanas.
	* 
	* @param número de semanas referente ao tempo de descanso (int).
	*/
	public void defineNumeroSemanas(int valor) {
		numeroSemanas = valor;
	}
	
	/**
	* O método getStatusGeral calcula a média de horas descansadas por semana e, se
	* a média for maior ou igual a 26, o atributo statusGeral recebe a string "descansado".
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
