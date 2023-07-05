package controller;

public class RoboRei extends RobosAbstract{

	public RoboRei(String nome, Plano plano, int vermelho, int verde, int azul) {
		super(nome, plano, vermelho, verde,  azul);
	}

	public void movimentar(int coord[]) {
		this.setCoordRobo(this.movimentarRobo(getCoordRobo(), coord));
	}

}