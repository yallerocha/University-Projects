import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.Agenda;
import agenda.Contato;

class AgendaTest {
	
	private Agenda agendaBase; 
	
	@BeforeEach
    void preparaContatos() {
        this.agendaBase = new Agenda();
        agendaBase.cadastraContato(1, "Yalle", "Rocha", "9999-9999");
        agendaBase.cadastraContato(80, "Tony", "Stark", "7777-7777");
        agendaBase.cadastraContato(90, "Ednaldo", "Pereira", "0000-0000");
        agendaBase.cadastraContato(100, "Steve", "", "2222-2222");
    }

	@Test
	void testIsNull() {
		assertTrue(agendaBase.isNull(50));
		assertFalse(agendaBase.isNull(1));
	}

	@Test
	void testIsFavorito() {
		assertFalse(agendaBase.isFavorito(100));
		assertFalse(agendaBase.isFavorito(1));
		agendaBase.adicionaFavorito(1, 1);
		assertTrue(agendaBase.isFavorito(1));
	}
	

	@Test
	void testJaCadastrado() {
		assertTrue(agendaBase.jaCadastrado("Yalle", "Rocha"));
		assertFalse(agendaBase.jaCadastrado("YALLE", "ROCHA"));
		assertFalse(agendaBase.jaCadastrado("Jonathan", "Joestar"));
		assertTrue(agendaBase.jaCadastrado("Steve", ""));
	}

	@Test
	void testRemoveContatos() {
		assertEquals("Yalle Rocha\n9999-9999", agendaBase.getContato(1));
		int[] arrayInt = {1};
		agendaBase.removeContatos(arrayInt);
		assertTrue(agendaBase.isNull(1));
		
		assertEquals("Tony Stark\n7777-7777", agendaBase.getContato(80));
		assertEquals("Steve \n2222-2222", agendaBase.getContato(100));
		int[] arrayIntDois = {80, 100};
		agendaBase.removeContatos(arrayIntDois);
		assertTrue(agendaBase.isNull(80));
		assertTrue(agendaBase.isNull(100));
		
		assertEquals("Ednaldo Pereira\n0000-0000", agendaBase.getContato(90));
		agendaBase.adicionaFavorito(90, 1);
		int[] arrayIntTres = {90};
		agendaBase.removeContatos(arrayIntTres);
		assertTrue(agendaBase.isNull(90));
	}

	@Test
	void testAdicionaTags() {
		Contato[] contatos = agendaBase.getContatos();
		
		String[] tags = contatos[1 - 1].getTags();
		assertEquals(null, tags[5 - 1]);
		
		String[] tagsDois = contatos[100 - 1].getTags();
		assertEquals(null, tagsDois[5 - 1]);
		
		int[] arrayInt = {1, 100};
		agendaBase.adicionaTags(arrayInt, "ufcg", 5);
		
		assertEquals("ufcg", tags[5 - 1]);
		assertEquals("ufcg", tagsDois[5 - 1]);
	}

	@Test
	void testAdicionaFavorito() {
		assertEquals("Ednaldo Pereira\n0000-0000", agendaBase.getContato(90));
		agendaBase.adicionaFavorito(90, 10);
		assertEquals("❤️ Ednaldo Pereira\n0000-0000", agendaBase.getContato(90));
		
		assertEquals("Yalle Rocha\n9999-9999", agendaBase.getContato(1));
		agendaBase.adicionaFavorito(1, 10);
		assertEquals("❤️ Yalle Rocha\n9999-9999", agendaBase.getContato(1));

	}

	@Test
	void testCadastraContato() {
		Contato[] contatos = agendaBase.getContatos();
		
		assertEquals(null, contatos[95 - 1]);
		agendaBase.cadastraContato(95, "Silvio", "Santos", "3333-3333");
		
		contatos = agendaBase.getContatos();
		assertEquals("95 - Silvio Santos", contatos[95 - 1].toString());
		
		assertEquals(null, contatos[35 - 1]);
		agendaBase.cadastraContato(35, "Faustão", "", "5555-5555");
		
		contatos = agendaBase.getContatos();
		assertEquals("35 - Faustão ", contatos[35 - 1].toString());
	}
}
