package TecProg;

public class professor extends clientes
{
	public professor (String nome, int matricula) {
		super(nome, matricula);
		this.cargo = "Professor";
		
	}
	public int verificarDias() {
		return 20;
	}
}
