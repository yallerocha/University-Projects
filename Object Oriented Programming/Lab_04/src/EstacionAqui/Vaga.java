package EstacionAqui;

public class Vaga {
	
	private String endereco;
	private double valor; //é o valor por hora?
	private String link;
	private String status;
	private int id;
	private int area;
	
	
	public Vaga(String endereco, double valor, int id) {
		this.endereco = endereco;
		this.valor = valor;
		this.id = id;
		this.status = "LIVRE";
		this.link = "https://";
	}
	
	public Vaga(String endereco, String link, double valor, int id) {
		this.endereco = endereco;
		this.valor = valor;
		this.id = id;
		this.status = "LIVRE";
		this.link = link;
	}
	
	public void mudarStatus() {
		if(this.status.equals("LIVRE")) {
			this.status = "OCUPADA";
		} else {
			this.status = "LIVRE";
		}
	}
	
	public double simularPreco(int horas) {
		double preco = horas * 3 + 0.1 * area;
		return preco;
	}
	
	public String toString() {
		String toString = id + " - " + endereco + " - " + link + " - " + status;
		return toString;
	}
}

