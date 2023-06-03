package trabalho;

import java.util.ArrayList;

public class Plano {
	
	public int numAlunos;
	public int numBugs;
	public int totalAlunos;
	public int teveBug;
	

	public ArrayList<Celulas> listaCelulas;

	public Plano(int tamanhoX, int tamanhoY) {
		listaCelulas = new ArrayList<Celulas>();
		
			int contador = 1;
			for (int i = 1; i <= tamanhoX; i++) {
				for (int j = 1; j <= tamanhoY; j++) {
					Celulas celula = new Celulas(contador, i, j);
					listaCelulas.add(celula);
					contador++;
				}
			}
	}
	
		public void verificarSeTemRobo() {
			for (int i = 0; i < listaCelulas.size(); i++) {
				Celulas aux = listaCelulas.get(i);
				if (listaCelulas.get(i).robo != null) {
					System.out.println("tem robo" + aux.robo.nome + "  - x: " + aux.posicaoX + "  - y: " + aux.posicaoY);
				}
			}
		}


		public Celulas retornarCelula(int x, int y) {

			for (int i = 0; i < listaCelulas.size(); i++) {
				if (listaCelulas.get(i).posicaoX == x && listaCelulas.get(i).posicaoY == y) {
					return listaCelulas.get(i);
				}
			}
			return null;
		}

		public void retornarCelulas() {
			for (int i = 0; i < listaCelulas.size(); i++) {
				System.out.println(listaCelulas.get(i).imprimir());
			}
		}
		
		public void criaTabuleiro(Plano plano) {
			
			int i = plano.listaCelulas.size()-1;
			int limiteY = plano.listaCelulas.get(i).posicaoY;
			
			for (int j = 0; j<plano.listaCelulas.get(i).posicaoY; j++ ) {
			System.out.print(" _ ");	
			}
			System.out.println();
			for (Celulas celula : plano.listaCelulas) {
				System.out.print("|" + celula.personagem + "|");
				if(celula.posicaoY == limiteY)
					System.out.println();
			}
			for (int j = 0; j<plano.listaCelulas.get(i).posicaoY; j++ ) {
				System.out.print(" - ");	
				}
			System.out.println();
			
		}
		
}
