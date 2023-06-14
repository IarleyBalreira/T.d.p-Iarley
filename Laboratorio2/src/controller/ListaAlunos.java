package controller;

import java.util.ArrayList;

public class ListaAlunos {

	private ArrayList<Aluno> listaAlunos;
	
	public ListaAlunos() {
		
		listaAlunos = new ArrayList<Aluno>();
	}
	
	
	public void addAluno(Aluno aluno) {
		listaAlunos.add(aluno);
	}
	
	public void setListaAluno(ArrayList<Aluno> listaA) {
		listaAlunos = listaA;
	}
	
	public int numAluno() {
		return listaAlunos.size();
	}

}
