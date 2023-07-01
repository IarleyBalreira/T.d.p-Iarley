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
	
	private Janela ig;
	private Plano plano;
	private ArrayList<RobosAbstract> robos;
	private JLabel labelNumAlunos;
	private JLabel labelNumBugs;
	private JLabel pontuacaoAndador;
	private JLabel pontuacaoRei;
	private JLabel pontuacaoRainha;
	
	
	protected PainelLateral (Janela ig, ArrayList<RobosAbstract> robos, Plano plano, Color corBackgroung) {
		super(ig);
		this.ig = ig;
		this.robos = robos;
		this.plano = plano;
		
		Color cor = corBackgroung.darker();
		this.setBackground(cor); 
		this.setBorder(BorderFactory.createSoftBevelBorder(5));
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		
		JPanel painelBugAluno = criarpainel(cor);
		painelBugAluno.setPreferredSize(new Dimension(100,45));
		painelBugAluno.setBorder(BorderFactory.createSoftBevelBorder(1));
		painelBugAluno.add(criarJLabel("Quantidades de   ||alunos||   e   ||bugs||  :          "));
		
		labelNumAlunos = criarJLabel(plano.alunosResgatados()+"     ",  "Aluno.png", Color.LIGHT_GRAY);
		labelNumBugs = criarJLabel(plano.bugsOcorridos()+"     ",  "Bug.png", Color.LIGHT_GRAY);
		
		painelBugAluno.add(labelNumAlunos);
		painelBugAluno.add(labelNumBugs);
		
		JPanel painelPontosDosRobos = criarpainel(cor);
		
		painelPontosDosRobos.setPreferredSize(new Dimension(100,55));
		painelPontosDosRobos.setBorder(BorderFactory.createSoftBevelBorder(1));
		painelPontosDosRobos.add(criarJLabel("   Pontuacoes dos Robos:   "));
		
		pontuacaoAndador = criarJLabel(robos.get(0).getPontuacao()+" Pontos    ",  "Andador.png", Color.LIGHT_GRAY);
		
		pontuacaoRei = criarJLabel(robos.get(1).getPontuacao()+" Pontos    ",  "Rei.png", Color.LIGHT_GRAY);
		
		pontuacaoRainha = criarJLabel(robos.get(2).getPontuacao()+" Pontos    ",  "Cavalo.png", Color.LIGHT_GRAY);
		
		painelPontosDosRobos.add(pontuacaoAndador);
		painelPontosDosRobos.add(pontuacaoRei);
		painelPontosDosRobos.add(pontuacaoRainha);
		
		this.add(painelBugAluno);
		this.add(painelPontosDosRobos);
	}
	
	private JLabel criarJLabel(String msg, String arquivoIcone, Color corBackground) {
		JLabel label = new JLabel(msg);
		label.setIcon(criarImageIcon(arquivoIcone, 20, 20));
		label.setIconTextGap(7);
		label.setForeground(Color.WHITE);
		label.setBackground(corBackground);
		return label;
	}
	
	private JLabel criarJLabel(String str) {
		JLabel label = new JLabel(str);
		label.setForeground(Color.WHITE);
		return label;
	}
	
	
	
	protected void atualizarJLabelsDeRelatorio() {
		
		labelNumAlunos.setText(plano.alunosResgatados()+"     ");
		labelNumBugs.setText(plano.bugsOcorridos()+"     ");
		
		pontuacaoAndador.setText(robos.get(0).getPontuacao()+" Pontos  ");
		pontuacaoRei.setText(robos.get(1).getPontuacao()+" Pontos  ");
		pontuacaoRainha.setText(robos.get(2).getPontuacao()+" Pontos  ");
	}
	
}