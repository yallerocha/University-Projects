package EstacionAqui;

public class EstacionamentoVirtual {

	private Vaga[] estacionamento = new Vaga[100];
	
	
	public void adicionaVagas(String endereco, double valor) {
		for(int i = 0; i < estacionamento.length; i++) {
			if(estacionamento[i] != null) {
				estacionamento[i] = new Vaga(endereco, valor, i);
			}
		}
	}
	
	public void adicionaVagas(String endereco, String link, double valor) {
		for(int i = 0; i < estacionamento.length; i++) {
			if(estacionamento[i] != null) {
				estacionamento[i] = new Vaga(endereco, link, valor, i);
			}
		}
	}
	
	public void mudarStatus(int id) {
		estacionamento[id].mudarStatus();
	}
	
	public double simularPreco(int id, int horas) {
		double preco = estacionamento[id].simularPreco(horas);
		return preco;
	}
	
	public int vagaLivre() {
		int id = -1;
		
		for(int i = 0; i < estacionamento.length; i++) {
			if(estacionamento[i] == null) {
				id = i;
			}
		}
		return id;
	}
	
	public String[] listarVagas() {
		int tamanhoLista = 0;
		
		for(int i = 0; i < estacionamento.length; i++) {
			if(estacionamento[i] != null) {
				tamanhoLista += 1;
			}
		}
		
		String[] listaVagas = new String[tamanhoLista];
		
		int regulador = 0;
		for(int i = 0; i < listaVagas.length; i++) {
			for(int c = regulador; c < estacionamento.length; c++) {
				if(estacionamento[c] != null) {
					listaVagas[i] = estacionamento[c].toString();
					regulador = c + 1;
					break;
				}
			}
		}
		return listaVagas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
