package controller;

public class Andador extends Robos{

	public Andador(String nome, Plano plano, int vermelho, int verde, int azul) {
		super(nome, plano, vermelho, verde,  azul);
	}
	
	public void movimentar(int coord[]) {
		this.setCoordRobo(this.movimentarRobo(getCoordRobo(), coord));
	}
	
}