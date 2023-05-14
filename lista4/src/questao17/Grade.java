package questao17;

public class Grade {

	 public Campo[][] grade = new Campo[3][3];

	    public Grade() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                grade[i][j] = new Campo();
	            }
	        }
	    }
	    
	    public void mudarCampo(int[] posicao, char jogador) {
	        grade[posicao[0]][posicao[1]].setCampo(jogador);
	    }
}
