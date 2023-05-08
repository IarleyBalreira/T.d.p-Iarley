package TecProg;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<emprestimos> listaEmprestimos;
	private ArrayList<clientes> cadastroClientes;
	private ArrayList<publicacoes> listaPublicacoes;
	
	public Biblioteca() {
		listaEmprestimos = new ArrayList<emprestimos>();
		cadastroClientes = new ArrayList<clientes>();
		listaPublicacoes = new ArrayList<publicacoes>();
	}
	public void addEmprestimo(emprestimos e) {
		listaEmprestimos.add(e);
	}
	
	public ArrayList<emprestimos> getlista(){
		return listaEmprestimos;
	}
	
	
	
	
}
