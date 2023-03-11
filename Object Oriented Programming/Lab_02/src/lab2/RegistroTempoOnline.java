package lab2;

/**
* RegistroTempoOnline é uma classe integrante do projeto CoISA. Ela organiza o tempo
* de uso de internet para cada disciplina de aluno. Isso ocorre por meio da comparação 
* entre a quantidade de tempo online que o aluno dedicou para o estudo de uma determinada 
* disciplina e a quantidade de tempo online que se esperava que o aluno dedicasse para o 
* estudo de tal disciplina. 
* 
* @author Yalle Rocha
*/
public class RegistroTempoOnline {
    
	/**
	* nomeDisciplina é um atributo do tipo string que recebe o nome de
	* uma determinada disciplina do aluno.
	*/
    private String nomeDisciplina;
    
    /**
	* tempoOnlineEsperado é um atributo do tipo inteiro que recebe o número
	* de horas online que se espera que o aluno dedique para uma determinada
	* disciplina. É inicializado, por padrão, com o valor inteiro 120 (cento e vinte).
	*/
    private int tempoOnlineEsperado = 120;
    
    /**
	* tempoOnlineDedicado é um atributo do tipo inteiro que recebe o número
	* de horas online que o aluno dedicou para uma determinada disciplina.
	* É inicializado com o valor inteiro 0 (zero).
	*/
    private int tempoOnlineDedicado = 0;
    
    /**
    * RegistroTempoOnline constrói um objeto a partir do parâmetro string nomeDisciplina
    * e o adiciona ao atributo nomeDisciplina.
    *
    * @param nome da disciplina (string).
    */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    /**
     * RegistroTempoOnline constrói um objeto a partir do parâmetro string nomeDisciplina
     * e do parâmetro inteiro tempoOnlineEsperado. Em seguida, adiciona nomeDisciplina ao atributo 
     * nomeDisciplina e tempoOnlineEsperado ao atributo tempoOnlineEsperado.
     *
     * @param nome da disciplina (string).
     * @param tempo online esperado (int).
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    
    /**
	* O método adicionaTempoOnline recebe uma certa quantidade de horas dedicadas
	* pelo aluno e a soma à quantidade de horas dedicadas já estabelecida, ou seja, 
	* adiciona mais horas ao atributo tempoOnlineDedicado.
	* 
	* @param número de horas dedicadas pelo aluno em uma determinada disciplina (int).
	*/
    public void adicionaTempoOnline(int tempo) {
       this.tempoOnlineDedicado += tempo; 
    }
    
    /**
	* O método atingiuMetatempoOnline faz uma comparação entre o tempo dedicado
	* pelo aluno e o tempo esperado. Se o tempo dedicado for maior ou igual ao tempo
	* esperado, a variável atingiuMeta recebe o valor boolean "true", caso contrário,
	* permanecerá com o valor boolean "false".  
	* 
	* @return o valor da variável atingiuMeta (boolean).
	*/
    public boolean atingiuMetaTempoOnline() {
        boolean atingiuMeta = false;
        
        if(tempoOnlineDedicado >= tempoOnlineEsperado) {
            atingiuMeta = true;
        }
        return atingiuMeta;
    }
    
    /**
	* O método toString formata os atributos nomeDisciplina, tempoOnlineDedicado e tempoOnlineEsperado
	* em uma string com o objetivo de organizar e facilitar a verificação dos dados referentes ao tempo 
	* online do aluno em uma determinada disciplina.  
	* 
	* @return uma string contendo o nome da disciplina, o tempo dedicado e o tempoesperado.
	*/
    public String toString() {
        String toString = String.format("%s %s/%s", this.nomeDisciplina, this.tempoOnlineDedicado, this.tempoOnlineEsperado);
        
        return toString;
    }
}