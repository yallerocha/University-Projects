package com.matheusgr.apresentacao;

/**
 * Controller para operações relacionadas com a apresentação
 * de documentos.
 */
public class ApresentacaoController {

	private ApresentacaoService apresentacaoService;

	/**
	 * Construtor padrão, inicializa com o service a ser usado pelo controller.
	 * 
	 * @param apresentacaoService ApresentacaoService a ser utilizado.
	 */
	public ApresentacaoController(ApresentacaoService apresentacaoService) {
		this.apresentacaoService = apresentacaoService;
	}

	/**
	 * Operação de apresentação de um documento. Para a apresentação
	 * será possível exibição o documento de acordo com o modo de exibição
	 * especificado.
	 * 
	 * @param docId documento a ser apresentado.
	 * @param tipoApresentacao modo de apresentacao a ser aplicado sobre o documento.
	 */
	public String apresenta(String docId, String tipoApresentacao) {
		return apresentacaoService.apresenta(docId, tipoApresentacao);
	}
	
	/**
	 * Operação de apresentação de um documento. Para a apresentação
	 * será possível exibição o documento de acordo com o modo de exibição
	 * especificado.
	 * 
	 * @param docId documento a ser apresentado.
	 * @param tipoApresentacao modo de apresentacao a ser aplicado sobre o documento.
	 */
	public String apresenta(String docId, String tipoApresentacao, int numeroLinhas) {
		return apresentacaoService.apresenta(docId, tipoApresentacao, numeroLinhas);
	}
}
