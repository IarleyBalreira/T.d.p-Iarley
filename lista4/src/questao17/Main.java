package questao17;

import java.util.Scanner;

public class Main {

	public static int lerInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
	
    public static void mostrarJogo(Campo[][] grade){
        System.out.println("  1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1)+" " + grade[i][0].getCampo()+" | " + grade[i][1].getCampo() + " | " + grade[i][2].getCampo());
            System.out.println(" -----------");
        }
    }
    
    public static boolean validaJogada(int[] jogada, Campo[][] grade){
        if(grade[jogada[0]][jogada[1]].getCampo()==' '){
            return true;
        }else{
            return false;
        }
    }
    
    public static char verificavitoria(Campo[][] grade){
        if ((grade[0][0].getCampo() == 'x' && grade[0][1].getCampo() == 'x' && grade[0][2].getCampo() == 'x')
        ||(grade[1][0].getCampo() == 'x' && grade[1][1].getCampo() == 'x' && grade[1][2].getCampo() == 'x')
        ||(grade[2][0].getCampo() == 'x' && grade[2][1].getCampo() == 'x' && grade[2][2].getCampo() == 'x')
        ||(grade[0][0].getCampo() == 'x' && grade[1][0].getCampo() == 'x' && grade[2][0].getCampo() == 'x')
        ||(grade[0][1].getCampo() == 'x' && grade[1][1].getCampo() == 'x' && grade[2][1].getCampo() == 'x')
        ||(grade[0][2].getCampo() == 'x' && grade[1][2].getCampo() == 'x' && grade[2][2].getCampo() == 'x')
        ||(grade[0][0].getCampo() == 'x' && grade[1][1].getCampo() == 'x' && grade[2][2].getCampo() == 'x')
        ||(grade[2][0].getCampo() == 'x' && grade[1][1].getCampo() == 'x' && grade[0][2].getCampo() == 'x')) {
            return 'x';
        }else if ((grade[0][0].getCampo() == 'o' && grade[0][1].getCampo() == 'o' && grade[0][2].getCampo() == 'o')
        ||(grade[1][0].getCampo() == 'o' && grade[1][1].getCampo() == 'o' && grade[1][2].getCampo() == 'o')
        ||(grade[2][0].getCampo() == 'o' && grade[2][1].getCampo() == 'o' && grade[2][2].getCampo() == 'o')
        ||(grade[0][0].getCampo() == 'o' && grade[1][0].getCampo() == 'o' && grade[2][0].getCampo() == 'o')
        ||(grade[0][1].getCampo() == 'o' && grade[1][1].getCampo() == 'o' && grade[2][1].getCampo() == 'o')
        ||(grade[0][2].getCampo() == 'o' && grade[1][2].getCampo() == 'o' && grade[2][2].getCampo() == 'o')
        ||(grade[0][0].getCampo() == 'o' && grade[1][1].getCampo() == 'o' && grade[2][2].getCampo() == 'o')
        ||(grade[2][0].getCampo() == 'o' && grade[1][1].getCampo() == 'o' && grade[0][2].getCampo() == 'o')) {
            return 'y';
        }
        else {
            return ' ';
        }
    }
    
    public static void main(String[] args) {
        Grade jogoVelha = new Grade();
        boolean deuVelha = false;
        char campeao = ' ';
        int[] jogada = new int[2];
        char jogadorVez = 'x';
        int contadorDeJogadas = 0;
       
        while (campeao==' ') {
            if(contadorDeJogadas==9){
                deuVelha = true;
                break;
            }
            mostrarJogo(jogoVelha.grade);
          
            while(true){
                System.out.println("O jogador atual e " + jogadorVez);
                System.out.print("Digite a linha da jogada: ");
                jogada[0] = lerInt()-1;
                // O valor é subtraido de 1 porque, nos indices que sao aplicados, as linhas comecam com 0
                System.out.print("Digite a coluna da jogada: ");
                jogada[1] = lerInt()-1;
                if (validaJogada(jogada, jogoVelha.grade)) {
                    break;
                }
                
                System.out.println("Valor digitado já está preenchido. Digite um valor válido");
            }
            
            jogoVelha.mudarCampo(jogada, jogadorVez);
            
            contadorDeJogadas++;
            
            if(jogadorVez=='x'){
                jogadorVez = 'o';
            }
            else{
                jogadorVez = 'x';
            }
            
            for (int i = 0; i < 20; i++) {
                System.out.println();
            }
            
            campeao = verificavitoria(jogoVelha.grade);
        }
        
        if (deuVelha) {
            System.out.println("Deu velha");
        }
        else{
            System.out.println("O campeao é o "+ campeao);
        }
    }
}
