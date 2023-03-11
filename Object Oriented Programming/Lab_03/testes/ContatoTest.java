import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import agenda.Contato;

class ContatoTest {
	
	private Contato contatoBase;
	
	@BeforeEach
    void preparaContatos() {
        this.contatoBase = new Contato(10, "Matheus", "Gaudencio", "555-5551");
    }

	@Test
	void testTags() {
		this.contatoBase.tags(1, "ufcg");;
		assertEquals("ufcg", contatoBase.getTags()[1 - 1]);
		this.contatoBase.tags(5, "Ab9 -test@");;
		assertEquals("Ab9 -test@", contatoBase.getTags()[5 - 1]);
	}

	@Test
	void testFavorito() {
		this.contatoBase.favorito(true, 1);
		assertTrue(contatoBase.getFavorito());
		this.contatoBase.favorito(false, 10);
		assertFalse(contatoBase.getFavorito());
	}
	
	@Test
	void testToString() {
		assertEquals("10 - Matheus Gaudencio", contatoBase.toString());
	}

}
