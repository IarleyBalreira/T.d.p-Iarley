package negocio;

import apresentacao.Tela;
import apresentacao.Terminal;
import java.util.Random;

public class Jogo {

	private Jogador jogador;
	private Tela tela;
	private Terminal terminal;
	private int numeroEscolhido;
	private boolean jogando;

	public Jogo() {
		Random aleatorio = new Random();
		tela = new Tela();
		terminal = new Terminal();
		jogador = new Jogador();
		numeroEscolhido = aleatorio.nextInt(101);
		jogando = true;
	}

	public void inciarJogoTerminal() {
		jogador.setNome(terminal.entradaNome());
		terminal.mesagem("Seja bem vindo: " + jogador.getNome());
	}

	public void inciarJogoGUI() {
		jogador.setNome(tela.entradaDados("Qual o seu nome?"));
		tela.mesagem("Seja bem vindo: " + jogador.getNome());
		jogadas();
	}

	public int solicitarNumero() {
		try {
		String numero = tela.entradaDados("Informe um numero:");
		return Integer.parseInt(numero);
		}catch(NumberFormatException e) {
			tela.mesagem("Ocorreu uma exceção: " + e.getMessage());
		}
		return -1;
	}
	 
	public void jogadas() {
		do {
			verificarAcerto();
		} while (jogando);

		fimDoJogo();
	}

	private void fimDoJogo() {

		String numeros = "";
		for (Integer numero : jogador.getListaNumeros()) {
			numeros += " - " + numero;
		}
		tela.mesagem("Numeros apostados: " + numeros);

	}

	public boolean verificarMenor(int numero) {
		if (numero < numeroEscolhido)
			return true;

		return false;
	}

	public void verificarAcerto() {
		int numero = solicitarNumero();
		jogador.addNumero(numero);
		if (numero == numeroEscolhido) {
			tela.mesagem("Parabens voce acertou! Seu numero de tentativas foi de: " + jogador.getNumeroTentativa()+ " tentativa(s)");
			jogando = false;
		} else {
			jogador.setNumeroTentativa();
			tela.mesagem("Deu ruim,  voce errou.    Fez "+ jogador.getNumeroTentativa()+" tentativa(s)ate agora");

			if (verificarMenor(numero)) {
				tela.mesagem("Tente um numero maior");
			} else {
				tela.mesagem("Tente numero menor");
			}
		}
	}

	// public void verificarAcerto() {
	// do {
	// if (solicitarNumero() == numeroEscolhido) {
	// jogador.setNumeroTentativa();
	// tela.mesagem("Parabens voce acertou! numero de tentativas: " +
	// jogador.getNumeroTentativa());
	// return;
	// } else {
	// tela.mesagem("Deu ruim, voce errou");
	// jogador.setNumeroTentativa();
	// }
	// } while (true);
	// }
}
