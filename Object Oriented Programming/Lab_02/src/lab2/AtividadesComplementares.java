package lab2;

import java.util.ArrayList;

/**
* AtividadesComplementares é uma classe integrante do projeto CoISA. Ela é responsável por gerenciar
* as atividades complementares de um aluno resgistrando horas de estágios, meses de projetos, horas de
* cursos e a quantidade de créditos adquiridas.
* 
* @author Yalle Rocha
*/
public class AtividadesComplementares {
	
	/**
	* arrayHorasEstagios é um atributo do tipo arraylist que recebe as horas que
	* um aluno dedicou em estágios.
	*/
	private ArrayList<Integer> arrayHorasEstagios = new ArrayList<Integer>();
	
	/**
	* arrayMesesProjetos é um atributo do tipo arraylist que recebe os meses que
	* um aluno dedicou em projetos.
	*/
	private ArrayList<Integer> arrayMesesProjetos = new ArrayList<Integer>();
	
	/**
	* horasCursos é um atributo do tipo double que recebe as horas que
	* um aluno dedicou em cursos. É inicializado com valor 0 (zero).
	*/
	private double horasCursos = 0;
	
	/**
	* creditosEstagios, creditosProjetos e creditosCursos são atributos do tipo inteiro que recebem
	* os creditos que um aluno conseguie através, respectivamente, de estagios, projetos e cursos.
	*/
	private int creditosEstagios, creditosProjetos, creditosCursos;
	
	/**
	* AtividadesComplementares constrói um objeto que herda os elementos da classe AtividadesComplementares.
	*/
	public AtividadesComplementares() {}
	
	/**
	* O método adicionaEstagio recebe uma certa quantidade de horas de um estágio
	* feito pelo aluno como parâmetro e a adiciona ao arraylist arrayHorasEstagios.
	* 
	* @param número de horas do estágio (int).
	*/
	public void adicionarEstagio(int horas) {
		arrayHorasEstagios.add(horas);
	}
	
	/**
	* O método adicionaProjeto recebe uma certa quantidade de meses de um projeto
	* do aluno como parâmetro e a adiciona ao arraylist arrayMesesProjetos.
	* 
	* @param número de meses do projeto (int).
	*/
	public void adicionarProjeto(int meses) {
		arrayMesesProjetos.add(meses);
	}
	
	/**
	* O método adicionaCurso recebe uma certa quantidade de horas de um curso feito
	* pelo aluno como parâmetro e a soma à quantidade de horas de curso já registrada, 
	* ou seja, adiciona mais horas ao atributo horasCurso.
	* 
	* @param número de horas de curso (double).
	*/
	public void adicionarCurso(double horas) {
		horasCursos += horas;
	}
	
	/**
	* O método pegaAtividades cria o array string atividades que recebe as horas de cada estágio, os meses de cada projeto,
	* as horas totais de curso, os créditos de estágio, os créditos de projetos e os créditos de curso.
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
	* O método contaCreditos realiza a soma de todos os créditos adquiridos
	* pelo aluno (estágios, projetos e cursos).
	* 
	* @return o número total de créditos do aluno (int).
	*/
	public int contaCreditos() {
		int totalCreditos = creditosEstagios + creditosProjetos + creditosCursos;
		
		return totalCreditos;
	}
	
	/**
	* O método calculaAtribuiCreditos realiza o cálculo dos créditos do aluno com base
	* nas horas de estágio, nos meses de projeto e nas horas de curso. Em seguida, atribui
	* os créditos aos seus respectivos atributos: creditosEstagios, creditosProjeto e creditosCurso.
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
