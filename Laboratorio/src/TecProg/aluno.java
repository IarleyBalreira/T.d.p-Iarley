package TecProg;

public class aluno extends clientes{

	public aluno (String nome, int matricula) {
		super(nome, matricula);
		this.cargo = "Aluno";

	}

	public int verificarDias() {
		return 10;
	}
	
	
}