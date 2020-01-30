package terceiroDesafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class app {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("== Converter um Texto para o novo alfabeto ==");
		System.out.println("\nInsira um texto: ");
		String texto = leitor.nextLine();
		converterTextoParaNovoAlfabeto(texto);
				
	}
	
	public static void converterTextoParaNovoAlfabeto(String texto) {
	
		texto = texto.toLowerCase();
		
	    String novoTexto = new String();
	    
		HashMap<Character,String> mapaSubstituicaoDeLetras = new HashMap<>();
		mapaSubstituicaoDeLetras.put('c', "3");
		mapaSubstituicaoDeLetras.put('f', "6");
		mapaSubstituicaoDeLetras.put('i', "9");
		mapaSubstituicaoDeLetras.put('l',"12");
		mapaSubstituicaoDeLetras.put('o',"15");
		mapaSubstituicaoDeLetras.put('r',"18");
		mapaSubstituicaoDeLetras.put('u',"21");
		mapaSubstituicaoDeLetras.put('x',"24");
		
        for(int i = 0 ; i< texto.length() ; i++ ) {	
		  //fraseQualquer.replace(fraseQualquer.charAt(i), mapaSubstituicaoDeLetras.get(fraseQualquer.charAt(i)));
		  if((texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') || texto.charAt(i) == ' ') {
			if(mapaSubstituicaoDeLetras.get(texto.charAt(i)) != null) {
				novoTexto+= mapaSubstituicaoDeLetras.get(texto.charAt(i));
			} else {
				novoTexto+= texto.charAt(i);
			}	  
		  }  		
		}
        System.out.println("\nTexto no novo alfabeto: "+novoTexto);
		
	}
	
	
	

}
