package agenda;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Interface com menus texto para manipular uma agenda de contatos.
 * 
 * @author nazarenoandrade
 * @author yallerocha
 *
 */
public class MainAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		System.out.println("Carregando agenda inicial");
		try {
			/*
			 * Essa é a maneira de lidar com possíveis erros por falta do arquivo. 
			 */
			carregaAgenda("agenda_inicial.csv", agenda);
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Erro lendo arquivo: " + e.getMessage());
		}

		Scanner scanner = new Scanner(System.in);
		String escolha = "";
		while (true) {
			escolha = menu(scanner);
			comando(escolha, agenda, scanner);
		}
	}

	/**
	 * Exibe o menu e captura a escolha do/a usuário/a.
	 * 
	 * @param scanner Para captura da opção do usuário.
	 * @return O comando escolhido.
	 */
	private static String menu(Scanner scanner) {
		System.out.print(
				"\n---\nMENU\n" + 
						"(C)adastrar Contato\n" + 
						"(L)istar Contatos\n" + 
						"(E)xibir Contato\n" +
						"(F)avoritos\n" +
						"(A)dicionar Favorito\n" +
						"(T)ags\n" +
						"(R)emover Contato\n" +
						"(S)air\n" + 
						"\n" + 
						"Opção> ");
		
		String escolha = scanner.next().toUpperCase(); scanner.nextLine();
		return escolha;
	}

	/**
	 * Interpreta a opção escolhida por quem está usando o sistema.
	 * 
	 * @param opcao   Opção digitada.
	 * @param agenda  A agenda que estamos manipulando.
	 * @param scanner Objeto scanner para o caso do comando precisar de mais input.
	 */
	private static void comando(String opcao, Agenda agenda, Scanner scanner) {
		switch (opcao) {
		case "C":
			cadastraContato(agenda, scanner);
			break;
		case "L":
			listaContatos(agenda);
			break;
		case "E":
			exibeContato(agenda, scanner);
			break;
		case "F":
			favoritos(agenda);
			break;	
		case "A":
			adicionaFavoritos(agenda, scanner);
			break;
		case "T":
			tags(agenda, scanner);
			break;
		case "R":
			removerContato(agenda, scanner);
			break;	
		case "S":
			sai();
			break;
		default:
			System.out.println("\nOPÇÃO INVÁLIDA!");
		}
	}
	
	/**
	 * Interage com o usuário a fim de remover um ou mais contatos da agenda.
	 * 
	 * @param agenda A agenda sendo manipulada.
	 * @param O scanner que recebe as entradas do usuário.
	 */
	private static void removerContato(Agenda agenda, Scanner scanner) {
		System.out.print("\nContato (s)> ");
		String stringContatos = scanner.nextLine();
		
		int[] arrayIntContatos = converteArray(stringContatos);
		Boolean invalido = verificaArrayContatos(arrayIntContatos);
		Boolean nulo = verificaContatoNulo(agenda, arrayIntContatos);
		
		if(invalido == true || nulo == true) {
			System.out.println("\nCONTATOS(S) INVÁLIDO(S)");
			
		} else {
			agenda.removeContatos(arrayIntContatos);
			System.out.println("\nCONTATOS(S) REMOVIDOS(S)");	
		}
	}
	
	/**
	 * Interage com o usuário a fim de adicionar uma tag a um ou mais contatos.
	 * 
	 * @param agenda A agenda sendo manipulada.
	 * @param O scanner que recebe as entradas do usuário.
	 */
	private static void tags(Agenda agenda, Scanner scanner) {
		System.out.print("\nContato (s)> ");
		String stringContatos = scanner.nextLine();
		
		int[] arrayIntContatos = converteArray(stringContatos);
		Boolean invalido = verificaArrayContatos(arrayIntContatos);
		
		if(invalido == true) {
			System.out.println("\nCONTATO(S) INVÁLIDO(S)");
		} else {
			System.out.print("\nTag> ");
			String tag = scanner.nextLine();
			System.out.print("\nPosição tag> ");
			int posicaoTag = scanner.nextInt(); 
			if(posicaoTag < 1 || posicaoTag > 5) {
				System.out.println("\nPOSIÇÃO INVÁLIDA");
			} else {
				agenda.adicionaTags(arrayIntContatos, tag, posicaoTag);
				System.out.println("\nTAG ADICIONADA");
			}
		}
	}
	
	/**
	 * Interage com o usuário a fim de adicionar um contato aos favoritos.
	 * 
	 * @param agenda A agenda sendo manipulada.
	 * @param O scanner que recebe as entradas do usuário.
	 */
	private static void adicionaFavoritos(Agenda agenda, Scanner scanner) {
		System.out.print("\nContato> ");
		int contato = scanner.nextInt();
		if(contato < 1 || contato > 100 || agenda.isNull(contato) == true) { 
			System.out.println("\nCONTATO INVÁLIDO");
		} else if(agenda.isFavorito(contato) == true) {
			System.out.println("\nCONTATO JÁ FAVORITADO");
		} else {
			System.out.print("\nPosição> ");
			int posicao = scanner.nextInt();
			if(posicao < 1 || posicao > 10) {
				System.out.println("\nPOSIÇÃO INVÁLIDA");
			} else {
				agenda.adicionaFavorito(contato, posicao);
				System.out.println("\nCONTATO FAVORITADO NA POSIÇÃO " + posicao + "!");
			}
		}
	}
	
	/**
	 * Imprime lista de contatos favoritos da agenda.
	 * 
	 * @param agenda A agenda sendo manipulada.
	 */
	private static void favoritos(Agenda agenda) {
		System.out.println("\nLista de favoritos: ");
		Contato[] favoritos = agenda.getFavoritos();
		for (int i = 0; i < favoritos.length; i++) {
			if (favoritos[i] != null) {
				System.out.println(favoritos[i].toString());
			}
		}
	}
	
	/**
	 * Imprime lista de contatos da agenda.
	 * 
	 * @param agenda A agenda sendo manipulada.
	 */
	private static void listaContatos(Agenda agenda) {
		System.out.println("\nLista de contatos: ");
		Contato[] contatos = agenda.getContatos();
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				System.out.println(contatos[i].toString());
			}
		}
	}
	
	/**
	 * Imprime os detalhes de um dos contatos da agenda. 
	 * 
	 * @param agenda A agenda.
	 * @param scanner Scanner para capturar qual contato.
	 */
	private static void exibeContato(Agenda agenda, Scanner scanner) {
		System.out.print("\nQual contato> ");
		int posicao = scanner.nextInt();
		if(posicao < 1 || posicao > 100) {
			System.out.println("\nPOSIÇÃO INVÁLIDA");
		} else {
			String dadosDoContato = agenda.getContato(posicao);
			if(dadosDoContato == null) {
				System.out.println("\nPOSIÇÃO INVÁLIDA");
			} else {
				System.out.println("\nDados do contato:\n" + dadosDoContato);
				String[] tags = agenda.getTags(posicao);
				for (int i = 0; i < tags.length; i++) {
					if(tags[i] != null) {
						System.out.println(tags[i]);
					}
				}
			}
		}
	}

	/**
	 * Cadastra um contato na agenda. 
	 * 
	 * @param agenda A agenda.
	 * @param scanner Scanner para pedir informações do contato.
	 */
	private static void cadastraContato(Agenda agenda, Scanner scanner) {
		System.out.print("\nPosição na agenda> ");
		int posicao = scanner.nextInt(); scanner.nextLine();
		if(posicao < 1 || posicao > 100) {
			System.out.println("\nPOSIÇÃO INVÁLIDA");
		} else {
			System.out.print("\nNome> ");
			String nome = scanner.nextLine();
			if(nome.equals("")) {
				System.out.println("\nCONTATO INVÁLIDO");
			} else {
				System.out.print("\nSobrenome> ");
				String sobrenome = scanner.nextLine();
				Boolean jaCadastrado = agenda.jaCadastrado(nome, sobrenome);
				if(jaCadastrado == true) {
					System.out.println("\nCONTATO JÁ CADASTRADO");
				} else {
					System.out.print("\nTelefone> ");
					String telefone = scanner.nextLine();
					if(telefone.equals("")) {
						System.out.println("\nCONTATO INVÁLIDO");
					} else {
						agenda.cadastraContato(posicao, nome, sobrenome, telefone);
						System.out.println("\nCADASTRO REALIZADO");
						
					}
				}
			}	
		}
	}
	
	/**
	 * Converte uma string de posições de contatos em um array de inteiros. 
	 * 
	 * @param String de posições.
	 * @return Um array de inteiros referente as posições de contatos contidas na string.
	 */
	private static int[] converteArray(String stringContatos) {
		
		String[] arrayStringContatos = stringContatos.split(" ");
		int[] arrayIntContatos = new int[arrayStringContatos.length];
		for (int i = 0; i < arrayIntContatos.length; i++) {
			arrayIntContatos[i] = Integer.parseInt(arrayStringContatos[i]);
		}
		return arrayIntContatos;
	}
	
	/**
	 * Verifica se uma das posições em um array de posições de contatos é
	 * menor que 1 ou maior que 100. 
	 * 
	 * @param agenda A agenda.
	 * @param Array de posições de contatos.
	 * @return Se tem uma posição que menor que 1 ou maior que 100 (true), ou não (false).
	 */
	private static Boolean verificaArrayContatos(int[] arrayIntContatos) {
		Boolean invalido = false;
		for (int i = 0; i < arrayIntContatos.length; i++) {
			if(arrayIntContatos[i] < 1 || arrayIntContatos[i] > 100) {
				invalido = true;
				break;
			}
		}
		return invalido;
	}
	
	/**
	 * Verifica se uma das posições em um array de posições de contatos é nula. 
	 * 
	 * @param agenda A agenda.
	 * @param Array de posições de contatos.
	 * @return Se tem uma posição nula no array (true) ou não (false).
	 */
	private static Boolean verificaContatoNulo(Agenda agenda, int[] arrayIntContatos) {
		Boolean nulo = false;
		Contato[] contatos = agenda.getContatos();
		for (int i = 0; i < arrayIntContatos.length; i++) {
			if(contatos[arrayIntContatos[i] - 1] == null) {
				nulo = true;
				break;
			}
		}
		return nulo;
	}
	
	/**
	 * Sai da aplicação.
	 */
	private static void sai() {
		System.out.println("\nVlw flw o/");
		System.exit(0);
	}

	/**
	 * Lê uma agenda de um arquivo csv. 
	 * 
	 * @param arquivoContatos O caminho para o arquivo.
	 * @param agenda A agenda que deve ser populada com os dados. 
	 * @throws IOException Caso o arquivo não exista ou não possa ser lido.
	 */
	private static void carregaAgenda(String arquivoContatos, Agenda agenda) throws FileNotFoundException, IOException {
		LeitorDeAgenda leitor = new LeitorDeAgenda();
		
		int carregados =  leitor.carregaContatos(arquivoContatos, agenda);
		System.out.println("Carregamos " + carregados + " registros.");
	}
}
