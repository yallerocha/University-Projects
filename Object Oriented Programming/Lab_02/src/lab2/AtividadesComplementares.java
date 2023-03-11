package lab2;

import java.util.ArrayList;

/**
* AtividadesComplementares � uma classe integrante do projeto CoISA. Ela � respons�vel por gerenciar
* as atividades complementares de um aluno resgistrando horas de est�gios, meses de projetos, horas de
* cursos e a quantidade de cr�ditos adquiridas.
* 
* @author Yalle Rocha
*/
public class AtividadesComplementares {
	
	/**
	* arrayHorasEstagios � um atributo do tipo arraylist que recebe as horas que
	* um aluno dedicou em est�gios.
	*/
	private ArrayList<Integer> arrayHorasEstagios = new ArrayList<Integer>();
	
	/**
	* arrayMesesProjetos � um atributo do tipo arraylist que recebe os meses que
	* um aluno dedicou em projetos.
	*/
	private ArrayList<Integer> arrayMesesProjetos = new ArrayList<Integer>();
	
	/**
	* horasCursos � um atributo do tipo double que recebe as horas que
	* um aluno dedicou em cursos. � inicializado com valor 0 (zero).
	*/
	private double horasCursos = 0;
	
	/**
	* creditosEstagios, creditosProjetos e creditosCursos s�o atributos do tipo inteiro que recebem
	* os creditos que um aluno conseguie atrav�s, respectivamente, de estagios, projetos e cursos.
	*/
	private int creditosEstagios, creditosProjetos, creditosCursos;
	
	/**
	* AtividadesComplementares constr�i um objeto que herda os elementos da classe AtividadesComplementares.
	*/
	public AtividadesComplementares() {}
	
	/**
	* O m�todo adicionaEstagio recebe uma certa quantidade de horas de um est�gio
	* feito pelo aluno como par�metro e a adiciona ao arraylist arrayHorasEstagios.
	* 
	* @param n�mero de horas do est�gio (int).
	*/
	public void adicionarEstagio(int horas) {
		arrayHorasEstagios.add(horas);
	}
	
	/**
	* O m�todo adicionaProjeto recebe uma certa quantidade de meses de um projeto
	* do aluno como par�metro e a adiciona ao arraylist arrayMesesProjetos.
	* 
	* @param n�mero de meses do projeto (int).
	*/
	public void adicionarProjeto(int meses) {
		arrayMesesProjetos.add(meses);
	}
	
	/**
	* O m�todo adicionaCurso recebe uma certa quantidade de horas de um curso feito
	* pelo aluno como par�metro e a soma � quantidade de horas de curso j� registrada, 
	* ou seja, adiciona mais horas ao atributo horasCurso.
	* 
	* @param n�mero de horas de curso (double).
	*/
	public void adicionarCurso(double horas) {
		horasCursos += horas;
	}
	
	/**
	* O m�todo pegaAtividades cria o array string atividades que recebe as horas de cada est�gio, os meses de cada projeto,
	* as horas totais de curso, os cr�ditos de est�gio, os cr�ditos de projetos e os cr�ditos de curso.
	* 
	* @return o array string atividades.
	*/
	public String[] pegaAtividades() {
		calculaAtribuiCreditos();
		
		int tamanhoEstagios = arrayHorasEstagios.size();
		int tamanhoProjetos = arrayMesesProjetos.size();
		int tamanhoArray = tamanhoEstagios + tamanhoProjetos + 4;
		
		String[] atividades = new String[tamanhoArray];
		
		for(int i = 0; i < tamanhoEstagios; i++) {
			atividades[i] = "Estagio " + arrayHorasEstagios.get(i);
		}
		for(int i = tamanhoEstagios; i < tamanhoEstagios + tamanhoProjetos; i++) { 
			atividades[i] = "Projeto " + arrayMesesProjetos.get(i - tamanhoEstagios);
		}
		atividades[tamanhoArray - 4] = "Cursos " + horasCursos;
		atividades[tamanhoArray - 3] = "Creditos_Estagio " + creditosEstagios;
		atividades[tamanhoArray - 2] = "Creditos_Projeto " + creditosProjetos;
		atividades[tamanhoArray - 1] = "Creditos_Cursos " + creditosCursos;
		
		return atividades;
	}
	
	/**
	* O m�todo contaCreditos realiza a soma de todos os cr�ditos adquiridos
	* pelo aluno (est�gios, projetos e cursos).
	* 
	* @return o n�mero total de cr�ditos do aluno (int).
	*/
	public int contaCreditos() {
		int totalCreditos = creditosEstagios + creditosProjetos + creditosCursos;
		
		return totalCreditos;
	}
	
	/**
	* O m�todo calculaAtribuiCreditos realiza o c�lculo dos cr�ditos do aluno com base
	* nas horas de est�gio, nos meses de projeto e nas horas de curso. Em seguida, atribui
	* os cr�ditos aos seus respectivos atributos: creditosEstagios, creditosProjeto e creditosCurso.
	*/
	private void calculaAtribuiCreditos() {
		int somaHorasEstagios = 0;
		
		for(int i = 0; i < arrayHorasEstagios.size(); i++) {
			somaHorasEstagios += arrayHorasEstagios.get(i);
		}
		creditosEstagios = somaHorasEstagios / 300 * 5;
		
		int somaMesesProjetos = 0;
		
		for(int i = 0; i < arrayMesesProjetos.size(); i++) {
			somaMesesProjetos += arrayMesesProjetos.get(i);
		}
		creditosProjetos = somaMesesProjetos / 3 * 2;
		
		creditosCursos = (int) horasCursos / 30;
	}
}
