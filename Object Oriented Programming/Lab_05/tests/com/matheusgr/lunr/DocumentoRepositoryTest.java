package com.matheusgr.lunr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.matheusgr.lunr.documento.*;

class DocumentoRepositoryTest {

	DocumentoRepository documentoRepository;

	Documento doc;
	Documento doc2;
	Documento doc3;

	@BeforeEach
	void documentoRepository() {
		documentoRepository = new DocumentoRepository();

		doc = new DocumentoJava("abc", "Bolo Prato Café" );
		doc2 = new DocumentoJava("123", "Moto Carro Aviao" );
		doc3 = new DocumentoJava("qwe", "Festa Presente Bolo" );
	}

	@Test
	void testAdiciona() {
		assertEquals(0, documentoRepository.totalDocumentos());	
		documentoRepository.adiciona(doc);
		assertEquals(1, documentoRepository.totalDocumentos());		
	}

	@Test
	void testRecupera() {
		documentoRepository.adiciona(doc);
		assertEquals(Optional.ofNullable(doc), documentoRepository.recupera("abc"));
	}

	@Test
	void testTotalDocumentos() {
		assertEquals(0, documentoRepository.totalDocumentos());	
		documentoRepository.adiciona(doc);
		documentoRepository.adiciona(doc2);
		assertEquals(2, documentoRepository.totalDocumentos());	
	}

	@Test
	void testBusca() {
		documentoRepository.adiciona(doc);
		documentoRepository.adiciona(doc2);
		documentoRepository.adiciona(doc3);
		
		Set<Documento> docs = new HashSet<Documento>();
		docs.add(doc);
		docs.add(doc3);
		
		assertEquals(docs, documentoRepository.busca("Bolo"));
	}

}
