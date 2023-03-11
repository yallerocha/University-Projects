package com.matheusgr.similaridade;

import com.matheusgr.lunr.documento.DocumentoService;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
/**
 * Componente para tratamento da lógica de negócio relativa a similaridade.
 */
public class SimilaridadeService {

	private DocumentoService documentoService;

	/**
	 * Inicialização da lógica de serviço.
	 * 
	 * @param documentoService DocumentoService a ser utilizado pelo
	 *                         SimilaridadeService.
	 */
	public SimilaridadeService(DocumentoService documentoService) {
		this.documentoService = documentoService;
	}

	/**
	 * Calcula e retorna a similaridade.
	 * 
	 * Para o cálculo da similaridade:
	 * <ul>
	 * <li>Pega o documento 1</li>
	 * <li>Pega o documento 2</li>
	 * <li>Pega os termos do documento 1 e coloca em um conjunto (Termos1)</li>
	 * <li>Pega os termos do documento 2 e coloca em um conjunto (Termos2)</li>
	 * <li>Calcula a interseção entre Termos1 e Termos2 (Inters)</li>
	 * <li>Calcula a união entre Termos1 e Termos2 (Uniao)</li>
	 * <li>A similaridade é o tamanho de Inters sobre o tamanho do conjunto
	 * Uniao</li>
	 * </ul>
	 * 
	 * @param docId1 Documento 1.
	 * @param docId2 Documento 2.
	 * @return Valor de similaridade (entre 0 e 1, inclusives) representando a
	 *         semelhança entre os documentos.
	 */
	public double similaridade(String docId1, String docId2) {
		String[] termos1 = this.documentoService.recuperaDocumento(docId1).get().getTexto();
		String[] termos2 = this.documentoService.recuperaDocumento(docId2).get().getTexto();
	
		Set<String> conjunto1 = new HashSet<>(Arrays.asList(termos1));
		Set<String> conjunto2 = new HashSet<>(Arrays.asList(termos2));
		
		Set<String> intersecao = new HashSet<>();
		Set<String> uniao = new HashSet<>(conjunto2);
		
		for(String termo1: conjunto1) {
			uniao.add(termo1);
			for(String termo2: conjunto2) {
				if(termo1.equals(termo2)) {
					intersecao.add(termo2);
				}
			}
		}
		
		double similaridade = (double) intersecao.size() / (double) uniao.size();
		
		return similaridade;
	}

}
