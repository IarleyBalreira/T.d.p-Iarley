import java.util.Scanner;
//media ponderada
public class questao3 {

	public static void main(String[] args) {
		float valorMedia;
		int tamanhoNota;
		int tamanhoPeso;
		System.out.println("Defina o numero de notas e pesos");
		Scanner scan = new Scanner(System.in);
		tamanhoNota = scan.nextInt();
		tamanhoPeso = tamanhoNota;
		System.out.println("Informe as notas");
		float[] notas = new float[tamanhoNota];
		float[] pesos = new float[tamanhoPeso];
		for(int i = 0; i < tamanhoNota; i++) {
		notas[i] = scan.nextFloat();
		}
		System.out.println("Informe os pesos de cada nota");
		for(int i = 0; i < tamanhoPeso; i++) {
			pesos[i] = scan.nextFloat();
		}
		valorMedia = ponderada(notas, pesos);
		System.out.println("A media ponderada obtida eh: "+ valorMedia);
		
	}
	
	public static float ponderada(float[] valornota, float[] valorpeso) {
		float mediaPonderada = 0;
		float divisor = 0;
		for(int i = 0; i < valornota.length; i++) {
			mediaPonderada = mediaPonderada + valornota[i]*valorpeso[i];
			divisor += valorpeso[i];
		}
		mediaPonderada = mediaPonderada/divisor;
		return mediaPonderada;
	}

}
