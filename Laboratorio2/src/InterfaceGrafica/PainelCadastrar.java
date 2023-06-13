package InterfaceGrafica;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class PainelCadastrar extends JPanel{

	public PainelCadastrar() {
		
		this.setPreferredSize(new Dimension(500,500));
		this.setBackground(Color.LIGHT_GRAY);
		Border loweredbevel = BorderFactory.createLoweredBevelBorder();
		
		//JLabel nome = new JLabel("Nome: ");
		//nome.setBounds(200, 10, 50, 50);
		//nome.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		JTextField txtnome = new JTextField() ;
		txtnome.setBounds(150, 10, 200, 50);
		txtnome.setBackground(Color.LIGHT_GRAY);
		txtnome.setBorder(BorderFactory.createTitledBorder(loweredbevel, "Nome"));
		
		//JLabel cpf = new JLabel("CPF: ");
		JTextField txtcpf = new JTextField();
		txtcpf.setBounds(150, 80, 200, 50);
		txtcpf.setBackground(Color.LIGHT_GRAY);
		txtcpf.setBorder(BorderFactory.createTitledBorder(loweredbevel, "CPF"));
		
		//JLabel matricula = new JLabel("Matricula: ");
		JTextField txtmatricula = new JTextField() ; 
		txtmatricula.setBounds(150, 150, 200, 50);
		txtmatricula.setBackground(Color.LIGHT_GRAY);
		txtmatricula.setBorder(BorderFactory.createTitledBorder(loweredbevel, "Matricula"));
		
		//JLabel vertente = new JLabel("Vertente: ");
		JTextField txtvertente = new JTextField() ;
		txtvertente.setBounds(150, 220, 200, 50);
		txtvertente.setBackground(Color.LIGHT_GRAY);
		txtvertente.setBorder(BorderFactory.createTitledBorder(loweredbevel, "Vertente"));
		
		Botao realizarCadastro = new Botao("Cadastrar");
		realizarCadastro.setBounds(150, 350, 200, 50);
		
		
		this.setLayout(null);
		
		//this.add(nome);
		this.add(txtnome);
//		this.add(cpf);
		this.add(txtcpf);
//		this.add(matricula);
		this.add(txtmatricula);
//		this.add(vertente);
		this.add(txtvertente);
		this.add(realizarCadastro);
		
		setVisible(false);
	}
}
