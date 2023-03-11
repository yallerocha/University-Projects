package com.matheusgr.lunr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.matheusgr.apresentacao.ApresentacaoService;
import com.matheusgr.lunr.documento.Documento;
import com.matheusgr.lunr.documento.DocumentoJava;
import com.matheusgr.lunr.documento.DocumentoHtml;
import com.matheusgr.lunr.documento.DocumentoService;

class ApresentacaoServiceTest {
	
	DocumentoService documentoService;
	ApresentacaoService apresentacaoService;
	
	Documento doc;
	Documento doc2;
	
	@BeforeEach
	public void baseTest() {
		documentoService = new DocumentoService();
		apresentacaoService = new ApresentacaoService(documentoService);
		
		doc = new DocumentoHtml("abc", "Azul\n"
				+ "Amarelo\n"
				+ "Preto\n"
				+ "Branco\n"
				+ "Vermelho\n"
				+ "Verde\n"
				+ "Rosa\n"
				+ "Laranja\n"
				+ "Roxa\n"
				+ "Cinza");
		doc2 = new DocumentoJava("123", "Azul\n"
				+ "Amarelo\n"
				+ "Preto\n"
				+ "Branco\n"
				+ "Vermelho\n"
				+ "Verde\n"
				+ "Rosa\n"
				+ "Laranja\n"
				+ "Roxa\n"
				+ "Cinza");
		
		documentoService.adicionaDocumento(doc);
		documentoService.adicionaDocumento(doc2);
	}
	
	@Test
	public void testApresentaStringString() {
		String texto = apresentacaoService.apresenta("abc", "CaixaAlta");
		assertEquals("AZUL\nAMARELO\nPRETO\nBRANCO\nVERMELHO\nVERDE\nROSA\nLARANJA\nROXA\nCINZA", texto);
	}

	@Test
	public void testApresentaStringStringInt() {
		String texto = apresentacaoService.apresenta("abc", "nPrimeiras", 4);
		assertEquals("Azul\nAmarelo\nPreto\nBranco\n",texto);
		texto = apresentacaoService.apresenta("123", "nPrimeiras", 10);
		assertEquals("Azul\nAmarelo\nPreto\nBranco\nVermelho\nVerde\nRosa\nLaranja\nRoxa\nCinza\n",texto);
		
		texto = apresentacaoService.apresenta("abc", "nUltimas", 3);
		assertEquals("Laranja\nRoxa\nCinza\n",texto);
		texto = apresentacaoService.apresenta("123", "nUltimas", 1);
		assertEquals("Cinza\n",texto);
	}

}
