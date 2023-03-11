package agenda;

public class Contato {
	
	private static final int TAMANHO_TAGS = 5;
	
	private int idcontato;
	private int idfavorito;
	private String nome;
	private String sobrenome;
	private String telefone;
	private Boolean favorito;
	private String[] tags;
	
	/**
	 * Cria um contato.
	 */
	public Contato(int posicao, String nome, String sobrenome, String telefone) {
		this.idcontato = posicao;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.favorito = false;
		this.tags = new String[TAMANHO_TAGS];
	}
	
	/**
	 * Adiciona uma tag ao array de tags do contato.
	 * 
	 * @param A posição em que a tag de ser adicionada.
	 * @param A tag.
	 */
	public void tags(int posicao, String tag) {
		this.tags[posicao - 1] = tag;
	}
	
	/**
	 * Define o contato como favorito e guarda a sua posição na lista de favoritos.
	 * 
	 * @param valor "True" para definir como favorito ou valor "False" para desfavoritar
	 * @return posição em que o contato foi adicionado em favoritos.
	 */
	public void favorito(Boolean favorito, int posicao) {
		this.favorito = favorito;
		this.idfavorito = posicao;
	}
	
	/**
	 * Retorna o array de tags do contato.
	 * 
	 * @return Um array string contendo as tags.
	 */
	public String[] getTags() {
		return this.tags;
	}
	
	/**
	 * Retorna a posição em que o contato foi adicionado na lista de favoritos.
	 * 
	 * @return um inteiro referente a posição.
	 */
	public int getIdFavorito() {
		return this.idfavorito;
	}
	
	/**
	 * Diz se o contato está nalista de favoritos ou não.
	 * 
	 * @return Se está (true) ou não está (false).
	 */
	public Boolean getFavorito() {
		return this.favorito;
	}
	
	/**
	 * Retorna o nome, o sobrenome e o telefone do contato.
	 * 
	 * @return um array com os dados do contato.
	 */
	public String[] getDadosDoContato() {
		String[] dados = {nome, sobrenome, telefone};
		
		return dados;
	}
	
	/**
	 * Retorna uma representação do contato em forma de string.
	 * 
	 * @return uma string formatada com a posição do contato, o nome e o sobrenome.
	 */
	public String toString() {
		String toString = String.format("%s - %s %s", idcontato, nome, sobrenome);
		
		return toString;
	}
}
