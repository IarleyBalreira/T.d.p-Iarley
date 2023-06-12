package InterfaceGrafica;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class PainelCadastrar extends Painel{

	public PainelCadastrar() {
		
		
		JLabel nome = new JLabel("Nome: ");
		JTextField txtnome = new JTextField() ;
		
		JLabel cpf = new JLabel("CPF: ");
		JTextField txtcpf = new JTextField(); 
		
		JLabel matricula = new JLabel("Matricula: ");
		JTextField txtmatricula = new JTextField() ; 
		
		JLabel vertente = new JLabel("Vertente: ");
		JTextField txtvertente = new JTextField() ; 
		
		Botao b= new Botao("Cadastrar");
		
		this.setLayout(new GridLayout(5,2));
		
		this.add(nome);
		this.add(txtnome);
		this.add(cpf);
		this.add(txtcpf);
		this.add(matricula);
		this.add(txtmatricula);
		this.add(vertente);
		this.add(txtvertente);
		this.add(b);
		
	}
}
