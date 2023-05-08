package TecProg;

public class Main {

	public static void main(String[] args) {

		//clientes
		clientes aluno1 = new aluno("Jojo", 1415);
		
		clientes aluno2 = new aluno("Lais", 9999);
		
		clientes professor1 = new professor("Tobias", 1616);
		
		clientes professor2 = new professor("jonas", 22222);
		
		clientes servidor1 = new servidor("Thabata", 1010);
		
		clientes servidor2 = new servidor("Ganimedes", 4567);
		
		//publicacoes
		publicacoes livro1 = new livros("Java como programar", 2022, "Deitel", 20);
		
		publicacoes livro2 = new livros("Como ser aprovado em Tecnicas de Programacao", 2023, "Geovana", 15);
		
		publicacoes revista1 = new revistas("INDICO: inclisao digital necessaria para a sociedade atual", 2023, "Caua", 10);
		
		publicacoes artigo1 = new artigo("Um comparativo de desempenho entre Java e Python", 2021, "Silva", 10);
		
		Biblioteca bib = new Biblioteca();
		emprestimos e1 = new emprestimos(aluno2, livro1);
		
		emprestimos e2 = new emprestimos(servidor1, artigo1);
		
		emprestimos e3 = new emprestimos(professor1, revista1);
		
		bib.addEmprestimo(e1);
		System.out.println(e1.dadosEmprestimo());
		
		bib.addEmprestimo(e2);
		System.out.println(e2.dadosEmprestimo());
		
		bib.addEmprestimo(e3);
		System.out.println(e3.dadosEmprestimo());
		
		
	}

}
