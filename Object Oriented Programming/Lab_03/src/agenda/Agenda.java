package agenda;

/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100 contatos. 
 * 
 * @author nazarenoandrade
 * @author yallerocha
 *
 */
public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	private static final int TAMANHO_FAVORITOS = 10;
	
	private Contato[] contatos;
	private Contato[] favoritos;

	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		this.favoritos = new Contato[TAMANHO_FAVORITOS];
	}
	
	/**
	 * Diz se uma posicao na lista de contatos é nula ou não.
	 * 
	 * @param A posição do contato.
	 * @return Se é nula (true) ou não (false).
	 */
	public Boolean isNull(int posicao) {
		Boolean isNull = false;
		if(contatos[posicao - 1] == null) {
			isNull = true;
		}
		return isNull;
	}
	/**
	 * Diz se um contato está na lista de favoritos ou não.
	 * 
	 * @param A posição do contato.
	 * @return Se é favorito (true) ou não (false).
	 */
	public Boolean isFavorito(int posicao) {
		Boolean isFavorito = contatos[posicao - 1].getFavorito();
		return isFavorito;
	}
	
	/**
	 * Acessa a lista de contatos mantida.
	 * 
	 * @return O array de contatos.
	 */
	public Contato[] getContatos() {
		return this.contatos.clone();
	}
	
	/**
	 * Acessa a lista de contatos favoritos mantida.
	 * 
	 * @return O array de contatos favoritos.
	 */
	public Contato[] getFavoritos() {
		return this.favoritos.clone();
	}
	/**
	 * Acessa os dados de um contato específico.
	 * 
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public String getContato(int posicao) {
		String dadosString = null;
		
		if(contatos[posicao - 1] != null) {
			Contato contato = contatos[posicao - 1];
			String[] dados = contato.getDadosDoContato();
			Boolean isFavorito = contatos[posicao - 1].getFavorito();
			if(isFavorito == true) {
				dadosString = String.format("❤️ %s %s\n%s", dados[0], dados[1], dados[2]);
			} else {
			dadosString = String.format("%s %s\n%s", dados[0], dados[1], dados[2]);
			}
		}
		
		return dadosString;
	}
	
	/**
	 * Retorna a lista de tags de um contato.
	 * 
	 * @param A posição do contato.
	 */
	public String[] getTags(int posicao) {
		String[] tags = contatos[posicao - 1].getTags();
		return tags;
	}
	
	/**
	 * Verifica se um contato já está cadastrado na lista de contatos.
	 * 
	 * @param O nome do contato.
	 * @param O sobrenome do contato.
	 * @return Se o contato já está cadastrado (true) ou não (false).
	 */
	public Boolean jaCadastrado(String nome, String sobrenome) {
		Boolean jaCadastrado = false;
		
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				String[] dados = contatos[i].getDadosDoContato();
				if(dados[0].equals(nome) && dados[1].equals(sobrenome)) {
					jaCadastrado = true;
					break;
				}
			}
		}
		return jaCadastrado;
	}
	
	/**
	 * Remove um ou mais contatos da lista de contatos.
	 * 
	 * @param As posições dos contatos a serem removidos.
	 */
	public void removeContatos(int[] arrayIntContatos) {
		for (int i = 0; i < arrayIntContatos.length; i++) {
			if(contatos[arrayIntContatos[i] - 1].getFavorito() == true) {
				int idfavorito = contatos[arrayIntContatos[i] - 1].getIdFavorito();
				favoritos[idfavorito - 1] = null;
			}
			contatos[arrayIntContatos[i] - 1] = null;
		}
	}
	
	/**
	 * Adiciona uma tag a um ou mais contatos.
	 * 
	 * @param As posições dos contatos.
	 * @param A tag a ser adicionada.
	 * @param Posição em que a tag deve ser adicionada na lista de tags.
	 */
	public void adicionaTags(int[] arrayIntContatos, String tag, int posicaoTag) {
		for (int i = 0; i < arrayIntContatos.length; i++) {
			contatos[arrayIntContatos[i] - 1].tags(posicaoTag, tag);
		}
	}
	
	/**
	 * Adiciona um contato à lista de favoritos.
	 * 
	 * @param A posição do contato.
	 * @param A posição em que o contato deve ser adicionado na lista de favoritos.
	 */
	public void adicionaFavorito(int contato, int posicao) {
		if(favoritos[posicao - 1] != null) {
			favoritos[posicao - 1].favorito(false, posicao);
		}
		favoritos[posicao - 1] = contatos[contato - 1];
		contatos[contato - 1].favorito(true, posicao);
		
	}

	/**
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe sobrescreve o anterior. 
	 * 
	 * @param posicao Posição do contato.
	 * @param nome Nome do contato.
	 * @param sobrenome Sobrenome do contato.
	 * @param telefone Telefone do contato.
	 */
	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		Contato contato = new Contato(posicao, nome, sobrenome, telefone);
		contatos[posicao - 1] = contato;
	}
}
