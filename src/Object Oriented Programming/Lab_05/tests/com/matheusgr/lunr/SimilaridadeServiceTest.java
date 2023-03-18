package com.matheusgr.lunr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoJava;
import com.matheusgr.similaridade.SimilaridadeService;
import com.matheusgr.lunr.documento.DocumentoService;

class SimilaridadeServiceTest {
	
	DocumentoService documentoService;
	SimilaridadeService similaridade;
	
	Documento doc;
	Documento doc2;
	Documento doc3;
	Documento doc4;
	
	@Test
	public void testSimilaridade() {
		documentoService = new DocumentoService();
		similaridade = new SimilaridadeService(documentoService);
		
		doc = new DocumentoJava("abc", "Uma casa feliz é uma casa bonita" );
		doc2 = new DocumentoJava("123", "Um dia feliz é um bom dia" );
		doc3 = new DocumentoJava("qwe", "Um dia feliz é um bom dia" );
		doc4 = new DocumentoJava("zxc", "Prato Faca Comida" );
		
		documentoService.adicionaDocumento(doc);
		documentoService.adicionaDocumento(doc2);
		documentoService.adicionaDocumento(doc3);
		documentoService.adicionaDocumento(doc4);
		
		assertEquals(0.2, similaridade.similaridade("abc", "123"));
		assertEquals(1.0, similaridade.similaridade("qwe", "123"));
		assertEquals(0.0, similaridade.similaridade("qwe", "zxc")); 
	}

}
