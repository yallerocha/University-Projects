package com.matheusgr.lunr.documento;

import java.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Repositório de documentos. O repositório pode ter opreações simples de busca,
 * mas a lógica de ranking, limitação e ordenação deve ficar em outra entidade.
 *
 * O ID de um documento é único.
 */
public class DocumentoRepository {

	private HashMap<String, Documento> documentos;
	private ValidadorDocumentos validador;

	/**
	* Construção padrão do repositório de documentos.
	*/
	public DocumentoRepository() {
		this.documentos = new HashMap<>();
		this.validador = new ValidadorDocumentos();
	}
	
	/**
	* Adiciona o documento. O documento é validado para garantir a consistência do
	* documento (sem termos e id vazios).
	*
	* @param d Documento a ser adicionado.
	*/
	public void adiciona(Documento d) {
		this.validador.validacao(d.getId(), d.getTexto());
		this.documentos.put(d.getId(),d);
	}
	
	/**
	* Recupera um documento do repositório.
	*
	* @param id ID do documento.
	* @return Documento, caso exista.
	*/
	public Optional<Documento> recupera(String id) {
		Documento doc = null;
		this.validador.validacao(id);
		
		doc = documentos.get(id);
		
		return Optional.ofNullable(doc);
	}
	
	/**
	* Retorna o total de documentos cadastrados.
	*
	* @return O total de documentos cadastrados.
	*/
	public int totalDocumentos() {
		return this.documentos.size();
	}
	
	/**
	* Realiza uma busca pelos termos.
	*
	* @param termo Termo a ser buscado.
	* @return Conjunto de documentos com o termo.
	*/
	public Set<Documento> busca(String termo) {
		Set<Documento> docs = new HashSet<Documento>();
		
		for(Documento d:this.documentos.values()) {
			String[] termos = d.getTexto();
			for(int i = 0; i < termos.length; i++) {
				if (termos[i].equals(termo)) {
					docs.add(d);
					break;
				}
			}
		}
	return docs;
	}
	
	/**
	* Realiza uma busca pelos metadados.
	*
	* @param metadados a serem buscados.
	* @return conjunto de documentos com os metadados.
	*/
	public Set<Documento> buscaAvancada(Map<String, String> metadados) {
		Set<Documento> docs = new HashSet<>();
		
		for(Documento d:this.documentos.values()) {
			
			Map<String,String> comparator = new HashMap<>();
			
			for(String keyRepository:d.getMetadados().keySet()) {
				
				for(String key:metadados.keySet()) {
					if((d.getMetadados().get(keyRepository)).equals(metadados.get(key))) {
						comparator.put(key,metadados.get(key));
					}
				}
			}
		if(comparator.equals(metadados)) {
			docs.add(d);
		}
		}
		return docs;
	}
}