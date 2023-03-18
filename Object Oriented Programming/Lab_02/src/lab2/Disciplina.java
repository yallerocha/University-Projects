package lab2;

/**
* Disciplina � uma classe integrante do projeto CoISA. Ela � respons�vel por gerenciar
* o valor das notas, as horas e m�dia do aluno em uma determinada disciplina.
* 
* @author Yalle Rocha
*/
public class Disciplina {
	
	/**
	* nomeDisciplina � um atributo do tipo string que recebe o nome de
	* uma determinada disciplina do aluno.
	*/
	private String nomeDisciplina;
	
	/**
	* horaDisciplina � um atributo do tipo inteiro que recebe o n�mero de
	* horas de estudo da disciplina. � inicializado com o valor inteiro 0 (zero).
	*/
	private int horasDisciplina = 0;
	
	/**
	* nota1, nota2, nota3 e nota4 s�o atributos do tipo double respons�veis
	* por receber o valor das quatro notas do aluno em uma disciplina. S�o 
	* inicializadas com o valor inteiro 0 (zero).
	*/
	private double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
	
	/**
	* mediaDisciplina � um atributo do tipo double que recebe a media
	* aritm�tica das quatro notas do aluno em uma disciplina.
	*/
	private double mediaDisciplina;
	
	/**
	* Disciplina constr�i um objeto a partir do par�metro string nomeDisciplina
	* e o adiciona ao atributo nomeDisciplina.
	*
	* @param nome da disciplina (string).
	*/
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina; 
	}
	
	/**
	* O m�todo cadastraHoras recebe uma certa quantidade de horas de estudo da
	* disciplina e a soma � quantidade de horas de estudo j� estabelecida, ou seja, 
	* adiciona mais horas ao atributo tempoOnlineDedicado.
	* 
	* @param n�mero de horas de estudo da disciplina (int).
	*/
	public void cadastraHoras(int horas) {
		this.horasDisciplina += horas;
	}
	
	/**
	* O m�todo cadastraNota recebe um n�mero de 1 a 4, que representa uma nota do aluno, e 
	* o valor de tal nota, que vai de 0.0 a 10.0. Em seguida, atribui o valor da nota ao atributo
	* que corresponde a nota determinada no par�metro. 
	* 
	* @param n�mero inteiro de que representa a nota (1, 2, 3 ou 4).
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
	* O m�todo aprovado realiza a m�dia aritm�tica das quatro notas do aluno e a atribui
	* ao atributo mediaDisciplina. Em seguida, dle verifica se a m�dia � mais ou igual 7. Se sim
	* a vari�vel aprovado recebe o valor boolean true, caso contr�rio ela recebe o valor false.
	* 
	* @return o valor da vari�vel aprovado, que ser� true ou false (boolean).
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
	* O m�todo toString formata os atributos referentes a disciplina e as notas
	* em uma string com o objetivo de organizar e facilitar a verifica��o das informa��es. 
	* 
	* @return uma string contendo o nome da disciplina, as horas da disciplina, a m�dia aritm�tica e as notas.
	*/
	public String toString() {
		String toString = String.format("%s %s %s [%s, %s, %s, %s]", nomeDisciplina, horasDisciplina, mediaDisciplina, nota1, nota2, nota3, nota4);
		
		return toString;
	}
}