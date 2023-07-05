package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Leitura {
	
	private BufferedReader leitor;
	private String diretorio;
	
	public Leitura() {
		diretorio = "src\\dados\\Dados.txt";
	}
	
	public String[] lerLinhas() {
		ArrayList<String> arrayStringTemp = new ArrayList<String>();
		
		try {
			
			leitor = new BufferedReader(new FileReader(diretorio));
			while (leitor.ready()) {
				arrayStringTemp.add(leitor.readLine());
			}
			leitor.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("EXCEPTION Classe Leitura: Arquivo Dados não encontrado");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String arrayString[] = new String[arrayStringTemp.size()];
		
		for(int i=0; i<arrayString.length; i++) {
			arrayString[i] = arrayStringTemp.get(i);
		}
		
		return arrayString;
	}

	
	 protected String lerConcatString() {
		String str = "";
		
		try {
			
			leitor = new BufferedReader(new FileReader(diretorio));
			while (leitor.ready()) {
				str += (leitor.readLine()+"\n");
			}
			leitor.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return str;
	}
	
}