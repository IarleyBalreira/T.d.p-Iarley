package model;

import java.io.FileWriter;

public class EscreverDados {
	
	private FileWriter escritor;
	private String strg;
	
	public EscreverDados() {
		strg = "src\\dados\\Dados.txt";
	}
	
	public boolean gravarConcatString(String str) {
		String strTemp = "";
		
		try {
			
			LerDados ler = new LerDados();
			strTemp = (str+"\n")+ler.lerConcatString();
			escritor = new FileWriter(strg);	
			escritor.write(strTemp);
			escritor.close();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}