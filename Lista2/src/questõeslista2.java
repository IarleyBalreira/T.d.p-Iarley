import java.util.Scanner;
import java.util.Random;

public class questõeslista2 {
	
	/* questao 1
	public static void main(String[] args) {
		for(int cont = 1; cont <= 100; cont++) {
			if( cont % 2 == 0)
			System.out.println(cont);
		}
	}
			*/
	
		/* questao2
	 
	 public static void main(String[] args) {
		int soma = 0 ,aux = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("digite os numeros a serem somados e pare ao digitar um numero nagativo");
		
		while(aux >= 0) {
			
			soma = soma + aux;
			aux = scan.nextInt();
			
		}
		System.out.println("A soma dos valores eh: "+ soma);
	}
	     */
		
		/* questao 3
 	public static void main(String[] args) {
		Random rand = new Random();
		int adivinha;
		int aleatorio = rand.nextInt((100 - 1) + 1) + 1;
		System.out.println("tente adivinhar o numero de 1 a 100  :)");
		Scanner scan = new Scanner(System.in);
		adivinha = scan.nextInt();
		while(adivinha != aleatorio) {
			if(adivinha > aleatorio)
				System.out.println("sua resposta eh maior que o numero escolhido");
			else
				System.out.println("sua resposta eh menor que o numero escolhido");
			
			adivinha = scan.nextInt();
		}
		System.out.println("parabens voce adivinhou corretamente !!");
	}
		  */
		
		/* questao 4
	public static void main(String[] args) {
		int numero , limite, cont = 0;
		System.out.println("Escolha um numero para obter a sua tabela de multiplicacao e outro que definira o limite de ate onde a tabela ira");
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		limite = scan.nextInt();
		while(cont <= limite) {
			System.out.println(numero +" x "+ cont+" = "+ numero*cont);
			cont++;
		}
	}
		*/
	
		/* questao 5
	public static void main(String[] args) {
		int esquerda, direita, contesq = 0, contdir = 0 ;
		System.out.println("defina o limite dos pares a serem apresentados a esquerda e a direita: ");
		Scanner scan = new Scanner(System.in);
		esquerda = scan.nextInt();
		direita = scan.nextInt();
		while(contesq <= esquerda){
			while(contdir <= direita){
				System.out.println(contesq +" - "+ contdir );
				contdir++;
			}
			contesq++;
			contdir = 0;
		}
	}
		 */
		
		/* questao 6
	public static void main(String[] args) {
		int linhas, colunas, i, j, cont = 0;
		System.out.println("informe as dimesoes da matriz");
		Scanner scan = new Scanner(System.in);
		linhas = scan.nextInt();
		colunas = scan.nextInt();
		int[][] matriz = new int[linhas][colunas];
		int[][] transposta = new int[linhas][colunas];

		for(i = 0;i < linhas; i++) {
			for( j = 0 ;j < colunas; j++) {
				System.out.println("defina os valores da matriz na linha "+ i +" e coluna "+ j);
				matriz[i][j] = scan.nextInt();
			}
		}
		for(i = 0 ; i <  linhas; i++) {
			for( j = 0 ;j < colunas; j++) {
				transposta[j][i] = matriz[i][j];
			}
		}
		for(i = 0 ; i <  linhas; i++) {
			for( j = 0 ;j < colunas; j++) {
				if(transposta[i][j] == matriz[i][j])
					cont++;
				else
					cont--;
			}
		}
		if(cont == linhas*colunas)
			System.out.println("A matriz fornecida eh simetrica");
		else
			System.out.println("A matriz nao eh simetrica");
		
	}
	*/			
				
		/* questao 7
	 public static void main(String[] args) {
		int primos = 2, maiorprimo = 2, numero, cont;
		System.out.println("Forneca um numero: ");
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		while(primos < numero) {
			cont = 1;
			int divisoes = 0;
			while(cont <= primos) {
				if(primos % cont == 0)
					divisoes++;
				cont++;
			}
			if(divisoes == 2)
				maiorprimo = primos;
			primos++;
		}	
		if(numero <= 2)
			System.out.println("Nao ha um numero primo menor que o numero fornecido! ");
		else
		System.out.println("O maior numero primo que vem antes do numero selecionado eh: "+ maiorprimo);
	}
		*/
		
		/*questao 8
	public static void main(String[] args) {
		String expressao;
		int cont = 0;
		int aux = 0;
		System.out.println("forneca uma expressao numerica");
		Scanner scan = new Scanner(System.in);
		expressao = scan.nextLine();
		char[] tamanho = new char[expressao.length()];
		expressao.getChars(0, expressao.length(), tamanho, 0);
		for(   ;aux < expressao.length(); aux ++) {
			
			if( tamanho[aux] == '[' || tamanho[aux] == '(' || tamanho[aux] == '{')
				cont++;
			if( tamanho[aux] == ']' || tamanho[aux] == ')' || tamanho[aux] == '}')
				cont--;
		}
		if(cont == 0)
			System.out.println("a expressao esta bem formada !");
		else
			System.out.println("a expressao nao ficou bem formada!");
		
	}
	*/
	
	/* questao 9
	public static void main(String[] args) {
		
	}
	*/
	
	// questao 10
	public static void main(String[] args) {
		int linhas, colunas, i, j;
		System.out.println("defina o numero de linhas e colunas (o numero de linhas e colunas sera igual ja que as matrizes serao quadradas).");
		Scanner scan = new Scanner(System.in);
		linhas = scan.nextInt();
		colunas = linhas;
		int[][] matriz = new int[linhas][colunas];
		 System.out.println(" a)  \n");
	        for ( i = 0; i < linhas; i++ ){
	            for ( j = 0; j < linhas; j++ ){
	                if (j <= i) 
	                System.out.print(j + " ");
	                else 
	                System.out.print("  ");    
	            }
	            System.out.println();
	        }
	        System.out.println("\n b)");
	        for ( i = 0; i < linhas; i++) {
	            for ( j = 0; j < colunas; j++){
	                if ((i + j) % 2 == 0) 
	                System.out.print("@ ");
	                else 
	                System.out.print("* ");          
	            }
	            System.out.println();
	        }
	        System.out.println("\n e)");
	        for( i = 0; i < linhas; i++) {
	        	for( j = 0; j < colunas; j++) {
	        		if(i == j)
	        			System.out.print( i + " ");
	        		else if(i + j == 4)
	        			System.out.print( j + " ");
	        		else
	        			System.out.print("* ");
	        	}
	        	System.out.println();
	        }
	}
	
}
