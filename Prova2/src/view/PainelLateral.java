package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controller.*;

public class PainelLateral extends Painel{
	// basicamente o placar
	private Janela janela;
	private Plano plano;
	private ArrayList<Robos> robos;
	private JLabel labelNumAlunos;
	private JLabel labelNumBugs;
	private JLabel pontuacaoAndador;
	private JLabel pontuacaoRei;
	private JLabel pontuacaoRainha;
	
	
	protected PainelLateral (Janela janela, ArrayList<Robos> robos, Plano plano, Color corBackgroung) {
		super(janela);
		this.janela = janela;
		this.robos = robos;
		this.plano = plano;
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		
		JPanel painelBugAluno = criarpainel(Color.DARK_GRAY);
		painelBugAluno.setPreferredSize(new Dimension(100,100)); 
		painelBugAluno.add(criarLabel("Quantidades de   ||alunos||   e   ||bugs||  encontrados:"));
		
		labelNumAlunos = criarLabel(plano.alunosResgatados() + "     ",  "Aluno.png", Color.LIGHT_GRAY);
		labelNumBugs = criarLabel(plano.bugsOcorridos() + "     ",  "Bug.png", Color.LIGHT_GRAY);
		
//		labelNumAlunos.setBounds(10, 10, 50, 50);
//		labelNumBugs.setBounds(10, 70, 50, 50);
		
		painelBugAluno.add(labelNumAlunos);
		painelBugAluno.add(labelNumBugs);
		
		painelBugAluno.add(criarLabel("                           "));
		painelBugAluno.add(criarLabel("   Pontuacoes dos Robos:   "));
		painelBugAluno.add(criarLabel("                           "));
		
		pontuacaoAndador = criarLabel(robos.get(0).getPontuacao()+" Pontos    ",  "Andador.png", Color.LIGHT_GRAY);
		
		pontuacaoRei = criarLabel(robos.get(1).getPontuacao()+" Pontos    ",  "Rei.png", Color.LIGHT_GRAY);
		
		pontuacaoRainha = criarLabel(robos.get(2).getPontuacao()+" Pontos    ",  "Cavalo.png", Color.LIGHT_GRAY);
		
		painelBugAluno.add(pontuacaoAndador);
		painelBugAluno.add(pontuacaoRei);
		painelBugAluno.add(pontuacaoRainha);
		
		this.add(painelBugAluno);
	}
	
	private JLabel criarLabel(String msg, String arquivoIcone, Color corBackground) {
		JLabel label = new JLabel(msg);
		label.setIcon(criarImageIcon(arquivoIcone, 25, 25));
		label.setIconTextGap(7);
		label.setForeground(Color.WHITE);
		label.setBackground(corBackground);
		return label;
	}
	
	private JLabel criarLabel(String str) {
		JLabel label = new JLabel(str);
		label.setForeground(Color.WHITE);
		return label;
	}
	
	
	
	protected void atualizarInfoDoJogo() {
		
		labelNumAlunos.setText(plano.alunosResgatados()+"     ");
		labelNumBugs.setText(plano.bugsOcorridos()+"     ");
		
		pontuacaoAndador.setText(robos.get(0).getPontuacao()+" Pontos  ");
		pontuacaoRei.setText(robos.get(1).getPontuacao()+" Pontos  ");
		pontuacaoRainha.setText(robos.get(2).getPontuacao()+" Pontos  ");
	}
	
}