package quartoDesafio;
import java.util.HashMap;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		//Variaveis
		HashMap<Character,Integer> codigoAlfaNumerico = new HashMap<>();
		String[][] asciiTrabalhoso = new String[27][3];
		String texto = new String();
		//
		mapeamentoDosCaracteres(codigoAlfaNumerico);
		preencherMatrizAscii(asciiTrabalhoso);
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um Texto para aplicar o ASCII Art: ");
		texto = leitor.nextLine();
		
		escreverTextoComAsciiTrabalhoso(texto.toLowerCase(), codigoAlfaNumerico, asciiTrabalhoso);
		
	}
	
	public static void escreverTextoComAsciiTrabalhoso(String texto,
			                                           HashMap<Character,Integer> mapa,
			                                           String[][] matrizAscii) {
		String[] textoEmAscii = new String[3];
		textoEmAscii[0] = "";
		textoEmAscii[1] = "";
		textoEmAscii[2] = "";
		
		
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < texto.length(); j++) {
				 if(mapa.containsKey(texto.charAt(j))) {
					 textoEmAscii[i]+=(matrizAscii[mapa.get(texto.charAt(j))][i]);
				 }
			}
		}
		
		System.out.println(textoEmAscii[0]);
		System.out.println(textoEmAscii[1]);
		System.out.println(textoEmAscii[2]);
		
		
	}
	
	public static void mapeamentoDosCaracteres(HashMap<Character,Integer> mapa) {
		for(int i = 0 ; i < 26 ; i++) {
			mapa.put((char)(97+i), i);
		}
		mapa.put(' ',26);
	}
	
	
	public static void preencherMatrizAscii(String[][] matrizDeString) {
		
		matrizDeString[0][0] = "     ";
		matrizDeString[0][1] = " /\\  ";
		matrizDeString[0][2] = "/~~\\ ";
		
		matrizDeString[1][0] = " __  ";
		matrizDeString[1][1] = "|__) ";
		matrizDeString[1][2] = "|__) ";
		
		matrizDeString[2][0] = " __  ";
		matrizDeString[2][1] = "/  ` ";
		matrizDeString[2][2] = "\\__, ";
		
		matrizDeString[3][0] = " __  ";
		matrizDeString[3][1] = "|  \\ ";
		matrizDeString[3][2] = "|__/ ";
		
		matrizDeString[4][0] = " ___ ";
		matrizDeString[4][1] = "|__  ";
		matrizDeString[4][2] = "|___ ";
		
		matrizDeString[5][0] = " ___ ";
		matrizDeString[5][1] = "|__  ";
		matrizDeString[5][2] = "|    ";
		
		matrizDeString[6][0] = " __  ";
		matrizDeString[6][1] = "/ _` ";
		matrizDeString[6][2] = "\\__> ";
		
		matrizDeString[7][0] = "     ";
		matrizDeString[7][1] = "|__| ";
		matrizDeString[7][2] = "|  | ";
		
		matrizDeString[8][0] = "  ";
		matrizDeString[8][1] = "| ";
		matrizDeString[8][2] = "| ";
		
		matrizDeString[9][0] = "     ";
		matrizDeString[9][1] = "   | ";
		matrizDeString[9][2] = "\\__/ ";
		
		matrizDeString[10][0] = "     ";
		matrizDeString[10][1] = "|__/ ";
		matrizDeString[10][2] = "|  \\ ";
		
		matrizDeString[11][0] = "     ";
		matrizDeString[11][1] = "|    ";
		matrizDeString[11][2] = "|___ ";
		
		matrizDeString[12][0] = "     ";
		matrizDeString[12][1] = "|\\/| ";
		matrizDeString[12][2] = "|  | ";
		
		matrizDeString[13][0] = "     ";
		matrizDeString[13][1] = "|\\ | ";
		matrizDeString[13][2] = "| \\| ";
		
		matrizDeString[14][0] = " __  ";
		matrizDeString[14][1] = "/  \\ ";
		matrizDeString[14][2] = "\\__/ ";
		
		matrizDeString[15][0] = " __  ";
		matrizDeString[15][1] = "|__) ";
		matrizDeString[15][2] = "|    ";
		
		matrizDeString[16][0] = " __  ";
		matrizDeString[16][1] = "/  \\ ";
		matrizDeString[16][2] = "\\__x ";
		
		matrizDeString[17][0] = " __  ";
		matrizDeString[17][1] = "|__) ";
		matrizDeString[17][2] = "|  \\ ";
		
		matrizDeString[18][0] = " __  ";
		matrizDeString[18][1] = "/__` ";
		matrizDeString[18][2] = ".__/ ";
		
		matrizDeString[19][0] = "___  ";
		matrizDeString[19][1] = " |   ";
		matrizDeString[19][2] = " |   ";
		
		matrizDeString[20][0] = "     ";
		matrizDeString[20][1] = "|  | ";
		matrizDeString[20][2] = "\\__/ ";
		
		matrizDeString[21][0] = "     ";
		matrizDeString[21][1] = "\\  / ";
		matrizDeString[21][2] = " \\/  ";
		
		matrizDeString[22][0] = "     ";
		matrizDeString[22][1] = "|  | ";
		matrizDeString[22][2] = "|/\\| ";
		
		matrizDeString[23][0] = "     ";
		matrizDeString[23][1] = "\\_/  ";
		matrizDeString[23][2] = "/ \\  ";
		
		matrizDeString[24][0] = "     ";
		matrizDeString[24][1] = "\\ /  ";
		matrizDeString[24][2] = " |   ";
		
		matrizDeString[25][0] = "__   ";
		matrizDeString[25][1] = " /   ";
		matrizDeString[25][2] = "/_   ";
		
		matrizDeString[26][0] = "    ";
		matrizDeString[26][1] = "    ";
		matrizDeString[26][2] = "    ";
		
	}
	
	
	
	
}
