package lab2;

/**
* RegistroTempoOnline � uma classe integrante do projeto CoISA. Ela organiza o tempo
* de uso de internet para cada disciplina de aluno. Isso ocorre por meio da compara��o 
* entre a quantidade de tempo online que o aluno dedicou para o estudo de uma determinada 
* disciplina e a quantidade de tempo online que se esperava que o aluno dedicasse para o 
* estudo de tal disciplina. 
* 
* @author Yalle Rocha
*/
public class RegistroTempoOnline {
    
	/**
	* nomeDisciplina � um atributo do tipo string que recebe o nome de
	* uma determinada disciplina do aluno.
	*/
    private String nomeDisciplina;
    
    /**
	* tempoOnlineEsperado � um atributo do tipo inteiro que recebe o n�mero
	* de horas online que se espera que o aluno dedique para uma determinada
	* disciplina. � inicializado, por padr�o, com o valor inteiro 120 (cento e vinte).
	*/
    private int tempoOnlineEsperado = 120;
    
    /**
	* tempoOnlineDedicado � um atributo do tipo inteiro que recebe o n�mero
	* de horas online que o aluno dedicou para uma determinada disciplina.
	* � inicializado com o valor inteiro 0 (zero).
	*/
    private int tempoOnlineDedicado = 0;
    
    /**
    * RegistroTempoOnline constr�i um objeto a partir do par�metro string nomeDisciplina
    * e o adiciona ao atributo nomeDisciplina.
    *
    * @param nome da disciplina (string).
    */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    /**
     * RegistroTempoOnline constr�i um objeto a partir do par�metro string nomeDisciplina
     * e do par�metro inteiro tempoOnlineEsperado. Em seguida, adiciona nomeDisciplina ao atributo 
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
	* O m�todo adicionaTempoOnline recebe uma certa quantidade de horas dedicadas
	* pelo aluno e a soma � quantidade de horas dedicadas j� estabelecida, ou seja, 
	* adiciona mais horas ao atributo tempoOnlineDedicado.
	* 
	* @param n�mero de horas dedicadas pelo aluno em uma determinada disciplina (int).
	*/
    public void adicionaTempoOnline(int tempo) {
       this.tempoOnlineDedicado += tempo; 
    }
    
    /**
	* O m�todo atingiuMetatempoOnline faz uma compara��o entre o tempo dedicado
	* pelo aluno e o tempo esperado. Se o tempo dedicado for maior ou igual ao tempo
	* esperado, a vari�vel atingiuMeta recebe o valor boolean "true", caso contr�rio,
	* permanecer� com o valor boolean "false".  
	* 
	* @return o valor da vari�vel atingiuMeta (boolean).
	*/
    public boolean atingiuMetaTempoOnline() {
        boolean atingiuMeta = false;
        
        if(tempoOnlineDedicado >= tempoOnlineEsperado) {
            atingiuMeta = true;
        }
        return atingiuMeta;
    }
    
    /**
	* O m�todo toString formata os atributos nomeDisciplina, tempoOnlineDedicado e tempoOnlineEsperado
	* em uma string com o objetivo de organizar e facilitar a verifica��o dos dados referentes ao tempo 
	* online do aluno em uma determinada disciplina.  
	* 
	* @return uma string contendo o nome da disciplina, o tempo dedicado e o tempoesperado.
	*/
    public String toString() {
        String toString = String.format("%s %s/%s", this.nomeDisciplina, this.tempoOnlineDedicado, this.tempoOnlineEsperado);
        
        return toString;
    }
}