package TecProg;

public abstract class clientes implements ValidaEmprestimo{

		protected int matricula;
		
		protected String nome;
		
		protected int TP;
		
		protected String cargo;

		public clientes (String nome, int matricula) {
			this.nome  = nome;
			this.matricula = matricula;
			this.TP = 0;
			
		}
		
}
