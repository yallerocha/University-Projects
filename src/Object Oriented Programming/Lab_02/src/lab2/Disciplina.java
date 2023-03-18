package lab2;

/**
* Disciplina é uma classe integrante do projeto CoISA. Ela é responsável por gerenciar
* o valor das notas, as horas e média do aluno em uma determinada disciplina.
* 
* @author Yalle Rocha
*/
public class Disciplina {
	
	/**
	* nomeDisciplina é um atributo do tipo string que recebe o nome de
	* uma determinada disciplina do aluno.
	*/
	private String nomeDisciplina;
	
	/**
	* horaDisciplina é um atributo do tipo inteiro que recebe o número de
	* horas de estudo da disciplina. É inicializado com o valor inteiro 0 (zero).
	*/
	private int horasDisciplina = 0;
	
	/**
	* nota1, nota2, nota3 e nota4 são atributos do tipo double responsáveis
	* por receber o valor das quatro notas do aluno em uma disciplina. São 
	* inicializadas com o valor inteiro 0 (zero).
	*/
	private double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
	
	/**
	* mediaDisciplina é um atributo do tipo double que recebe a media
	* aritmética das quatro notas do aluno em uma disciplina.
	*/
	private double mediaDisciplina;
	
	/**
	* Disciplina constrói um objeto a partir do parâmetro string nomeDisciplina
	* e o adiciona ao atributo nomeDisciplina.
	*
	* @param nome da disciplina (string).
	*/
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina; 
	}
	
	/**
	* O método cadastraHoras recebe uma certa quantidade de horas de estudo da
	* disciplina e a soma à quantidade de horas de estudo já estabelecida, ou seja, 
	* adiciona mais horas ao atributo tempoOnlineDedicado.
	* 
	* @param número de horas de estudo da disciplina (int).
	*/
	public void cadastraHoras(int horas) {
		this.horasDisciplina += horas;
	}
	
	/**
	* O método cadastraNota recebe um número de 1 a 4, que representa uma nota do aluno, e 
	* o valor de tal nota, que vai de 0.0 a 10.0. Em seguida, atribui o valor da nota ao atributo
	* que corresponde a nota determinada no parâmetro. 
	* 
	* @param número inteiro de que representa a nota (1, 2, 3 ou 4).
	* @param valor da nota determinada (double).
	*/
	public void cadastraNota(int nota, double valorNota) {
		if(nota == 1) {
			nota1 = valorNota;
		} else if (nota == 2) {
			nota2 = valorNota;
		} else if (nota == 3) {
			nota3 = valorNota;
		} else {
			nota4 = valorNota;
		}
	}
	
	/**
	* O método aprovado realiza a média aritmética das quatro notas do aluno e a atribui
	* ao atributo mediaDisciplina. Em seguida, dle verifica se a média é mais ou igual 7. Se sim
	* a variável aprovado recebe o valor boolean true, caso contrário ela recebe o valor false.
	* 
	* @return o valor da variável aprovado, que será true ou false (boolean).
	*/
	public boolean aprovado() {
		mediaDisciplina = (nota1 + nota2 + nota3 + nota4) / 4;
		
		boolean aprovado;
		
		if(mediaDisciplina >= 7) {
			aprovado = true;
		} else {
			aprovado = false;
		}
		return aprovado;
	}
	
	/**
	* O método toString formata os atributos referentes a disciplina e as notas
	* em uma string com o objetivo de organizar e facilitar a verificação das informações. 
	* 
	* @return uma string contendo o nome da disciplina, as horas da disciplina, a média aritmética e as notas.
	*/
	public String toString() {
		String toString = String.format("%s %s %s [%s, %s, %s, %s]", nomeDisciplina, horasDisciplina, mediaDisciplina, nota1, nota2, nota3, nota4);
		
		return toString;
	}
}