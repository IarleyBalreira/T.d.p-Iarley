package controller;

import java.awt.Color;
import java.util.ArrayList;

public class Celulas {

	private int x;
	private int y;
	private RobosAbstract roboCelula;
	
	private boolean temAluno;
	private boolean temBug;
	private boolean visitado;
	
	public Celulas(int x, int y) { //celula padrao
		this.x = x;
		this.y = y;
		temAluno = false;
		temBug = false;
		visitado = false;
	}
	
	public Color imprimirCor() {
		if(this.temRobo()) {
			
			return this.getRobo().getCorNoPlano();
			
		} else {
			//verificacao se tem algo na celula
			if(visitado) {
				if(temAluno) {
					
					return new Color(0, 170, 0); 
					
				}else if(temBug) {
					
					return new Color(150, 0, 0);
					
				}else {
					
					return new Color(0, 0, 130); 
					
				}
			}
				return null; 
				
		}
	}

	public RobosAbstract getRobo() {
		return roboCelula; 
	}
	
	public void addRobo(RobosAbstract robo) {
		this.roboCelula = robo;
	}
	
	public void removerRobo(RobosAbstract robo) {
		this.roboCelula = null;
	}
	
	public boolean temRobo() {
		return this.roboCelula!=null;
	}
	
	public void addAluno() {
		temAluno = true;
		temBug = false;
	}
	
	public void addBug() {
		temBug = true;
		temAluno = false;
	}
	
	public boolean temAluno() {
		return temAluno;
	}

	public boolean temBug() {
		return temBug;
	}

	public boolean roboVisitou() {
		return visitado;
	}
	
	public void setRoboVisitou(boolean estado) {
		visitado = estado;
	}
	
	public void setTrueRoboVisitou() {
		visitado=true;
	}
	
	public int[] getCoords() {
		int[] coords = {x,y};
		return coords;
	}
	
}