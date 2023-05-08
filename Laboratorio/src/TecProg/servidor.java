package TecProg;

public class servidor extends clientes {

	public servidor (String nome, int matricula) {
		super(nome, matricula);
		this.cargo = "Servidor";

	}

	public int verificarDias() {
		return 15;
	}
}
