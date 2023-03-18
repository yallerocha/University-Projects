package com.matheusgr.apresentacao;

import java.util.Scanner;
import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoService;

/**
 * Componente para tratamento da lógica de negócio relativa 
 * a apresentação de documentos.
 */
public class ApresentacaoService {

	private DocumentoService documentoService;

	/**
	 * Inicialização da lógica de serviço.
	 * 
	 * @param documentoService DocumentoService a ser utilizado pelo
	 *                         ApresentacaoService.
	 */
	public ApresentacaoService(DocumentoService documentoService) {
		this.documentoService = documentoService;
	}

	/**
	 * Realiza a apresentação do documento indicado.
	 * 
	 *  
	 * @param docId1 Documento a ser apresentado.
	 * @param tipoApresentacao modo de apresentacao a ser aplicado sobre o documento.
	 */
	public String apresenta(String docId, String tipoApresentacao) {
		
		Documento doc = this.documentoService.recuperaDocumento(docId).get();
		
		String texto = doc.getTextoOriginal();
		
		String newTexto = caixaAlta(texto);
		
		return newTexto;
	}
	
	/**
	 * Realiza a apresentação do documento indicado.
	 * 
	 *  
	 * @param docId1 Documento a ser apresentado.
	 * @param tipoApresentacao modo de apresentacao a ser aplicado sobre o documento.
	 * @param numero de linhas a serem exibidas.
	 */
	public String apresenta(String docId, String tipoApresentacao, int numeroLinhas) {
			
		Documento doc = this.documentoService.recuperaDocumento(docId).get();
			
		String texto = doc.getTextoOriginal();
		
		String newTexto = "";
		if(tipoApresentacao.equals("nPrimeiras")) {
			newTexto = nPrimeiras(texto, numeroLinhas);
		} else {
			newTexto = nUltimas(texto, numeroLinhas);
		}
		
		return newTexto;
	}
	
	private String nPrimeiras(String texto, int n) {
		Scanner sc = new Scanner(texto);
			
        String parteTexto = "";
        for(int i = 1; i <= n; i++) {
            String linha = sc.nextLine();
            parteTexto += linha + "\n";
        }		
        sc.close();
		return parteTexto;
	}
	
	private String nUltimas(String texto, int n) {
		
		Scanner sc = new Scanner(texto);
	        
	    int count = 0;
	    
	    while(sc.hasNextLine()) {
	            sc.nextLine();
	            count ++;
	    }
		    
		Scanner sca = new Scanner(texto);
		    
	    String parteTexto = "";
	    for(int i = 0; i < count; i++) {
	        String linha = sca.nextLine();
	        if(i >= (count-n)) {
	            parteTexto += linha + "\n";
	        }
	    }		
		sc.close();
		sca.close();
		return parteTexto;
	}
	
	private String caixaAlta(String texto) {
		String caixaAlta = texto.toUpperCase();
        		
		return caixaAlta;
	}
	
	
}