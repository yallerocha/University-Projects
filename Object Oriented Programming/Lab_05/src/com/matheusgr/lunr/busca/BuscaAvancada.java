package com.matheusgr.lunr.busca;

import java.util.Map;
import java.util.Set;

import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoService;

/**
 * BuscaAvancada realiza uma operação de busca a partir dos metadados.
 * 
 * Dado os metadados, deve se buscar por tais documentos.
 * 
 * Os documentos que não tem nenhum dos metadados pesquisados, não devem ser
 * retornados.
 */
public class BuscaAvancada {
	
	private Map<String, String> metadados;
	
	/**
	 * Construtor padrão com os metadados a serem encontrados.
	 * 
	 * Os termos não vazios são ignorados.
	 * 
	 * @param metadados a serem pesquisados.
	 */
	public BuscaAvancada(Map<String, String> metadados) {
		this.metadados = metadados;
	}
	
	/**
	 * Realiza a busca a partir da consulta ao DocumentoService.
	 * 
	 * O DocumentoService realiza apenas operações simples de busca, mas sem
	 * ordenação ou tratamento da lógica de relevância.
	 * 
	 * @param ds DocumentoService a ser utilizado para busca.
	 * @return Mapa com os documentos encontrados.
	 */
	public Set<Documento> buscaAvancada(DocumentoService ds) {
		Set<Documento> respostaDocumento = ds.buscaAvancada(metadados);
		return respostaDocumento;
	}
	
}
