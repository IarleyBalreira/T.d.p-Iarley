package trabalho;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Robos> listaRobos = new ArrayList<>();
		ArrayList<Alunos> listaAluno = new ArrayList<>();
		ArrayList<Bug> listaBug = new ArrayList<>();
		int x, y, aux;
		Jogador jogador = new Jogador(null);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo ao jogo ||-Resgate na ilha Java-|| !! informe seu nome: ");
		String nome = scan.next();
		jogador.setNome(nome);
		
		System.out.println("\nOla " + jogador.getNome() + "!");
		System.out.println("Qual tamanho do tabuleiro que deseja jogar? ( informe um numero para linhas e outro para colunas )");
		x = scan.nextInt();
		y = scan.nextInt();
		
		while (x <= 0 || y <= 0) {
            System.out.print("O tamanho deve ser maior que zero. Digite novamente: ");
            x = scan.nextInt();
            y = scan.nextInt();
        }
		
		Plano tabuleiro = new Plano(x, y);
		
		
		System.out.println("Defina a quantidade de alunos presentes no jogo");
		tabuleiro.numAlunos = scan.nextInt();
		while(tabuleiro.numAlunos >= (x*y)/2) {
			System.out.println("O numero de alunos deve ser menor que a metade de celulas no tabuleiro!!");
			tabuleiro.numAlunos = scan.nextInt();
		}
		aux = tabuleiro.numAlunos;
		for (int i = 0; i < aux; i++) {
			listaAluno.add(new Alunos((i), x, y, tabuleiro));
		}

		
		System.out.println("Defina a quantidade de bugs presentes no jogo");
		tabuleiro.numBugs = scan.nextInt();
		while(tabuleiro.numBugs >= (x*y)/2) {
			System.out.println("O numero de bugs deve ser menor que a metade de celulas no tabuleiro!!");
			tabuleiro.numBugs = scan.nextInt();
		}
		aux = tabuleiro.numBugs;
		for (int i = 0; i < aux; i++) {
			listaBug.add(new Bug((i), x, y, tabuleiro));
		}
		
		for(int h=0;h<10;h++) {
			System.out.println();
		}
		
		listaRobos.add(new Andador(1, "Andador", 1, y, tabuleiro));
		listaRobos.add(new Peao(2, "Peao", 1, y, tabuleiro));
		listaRobos.add(new Torre(3, "Torre", 1, y, tabuleiro));
		listaRobos.add(new Bispo(4, "Bispo", 1, y, tabuleiro));
		listaRobos.add(new Cavalo(5, "Cavalo", 1, y, tabuleiro));
		listaRobos.add(new Rei(6, "Rei", 1, y, tabuleiro));
		listaRobos.add(new Rainha(7, "Rainha", 1, y, tabuleiro));
		
		while (jogador.jogando && tabuleiro.numAlunos != 0) {
			tabuleiro.criaTabuleiro(tabuleiro);
			
			for (Robos robo : listaRobos) {
				System.out.println("Voce quer avancar(1) ou retroceder(2) com o(a): " + robo.nome + "? ( "+robo.personagem+" )");
				aux = scan.nextInt();
				scan.nextLine();
				while (aux != 1 && aux != 2) {
					System.out.println("valor invalido tente outro:");
					aux = scan.nextInt();
					scan.nextLine();
				}

				if (aux == 1)
					robo.avancar();
				else if (aux == 2)
					robo.retroceder();

				aux = 0;
			}
			System.out.println("Nesta rodada: " + (tabuleiro.totalAlunos - tabuleiro.numAlunos) + " Aluno(s) foram encontrados e " + tabuleiro.teveBug +" Bugs ocorreram \n");
			for (Robos robo : listaRobos) {
				System.out.println("PONTUACAO DO ROBO - " + robo.nome+": "+robo.getPontos());
			}
			System.out.println("Digite 's' para sair do jogo, caso contrario digite qualquer coisa");
			char aux2 = scan.next().charAt(0);
			if (aux2 == 's')
				jogador.jogando = false;
		}
		
		System.out.println("\t\tRELATORIO");
			String vencedor = listaRobos.get(listaRobos.size()-1).nome;
			for (int i =0; i < listaRobos.size();i++) {	
				System.out.print(listaRobos.get(i).nome +" - PONTOS: "+listaRobos.get(i).getPontos() + " Resgatou: " + listaRobos.get(i).encontrouAluno + " Aluno(s) e Encontrou: " + listaRobos.get(i).encontrouBug + " Bugs" +" - ANDOU POR:");
				
				
				if(listaRobos.get(i).getPontos() > listaRobos.get(listaRobos.size()-1).getPontos())
					vencedor = listaRobos.get(i).nome;
				
				for (int j =0;j < listaRobos.get(i).cordx.size();j++) {
					System.out.print(" ("+listaRobos.get(i).cordx.get(j) + "," + listaRobos.get(i).cordy.get(j)+") ");
				}
				System.out.println();
			}
			System.out.println("\nO robo vencedor do Jogador "+jogador.getNome()+" eh o robo: "+vencedor);
			scan.close();
		}
		
		/*
			Robos robo = null; {
				try {
				tabuleiro.verificarSeTemRobo();
				robo.moverEsquerda();
				tabuleiro.verificarSeTemRobo();	
				} catch (Exception e) {
				tabuleiro.verificarSeTemRobo();
				}
			}
			*/			
}
