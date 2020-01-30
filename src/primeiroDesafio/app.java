package primeiroDesafio;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		float peso;
		float altura;
		float imc;
		
		Scanner leitor = new Scanner(System.in);
		
		do {
			System.out.println("Insira o Peso(kg): ");
			peso = leitor.nextFloat();	
			if(peso<=0) {
				System.out.println("Peso invalido. Insira novamente!");
			}
		}
		while(peso<=0);
		
		
        do {		
		    System.out.println("Insira a altura(m): ");
		    altura = leitor.nextFloat();
		    if(altura<=0) {
				System.out.println("Altura invalida. Insira novamente!");
			}
	    }
        while(altura<=0);
        
        imc = calcularImc(altura,peso);
        
        avaliarPessoa(imc);
	}
	
	public static float calcularImc(float altura, float peso) {
		return (peso/(altura*2));
	}
	
	public static void avaliarPessoa(float imc) {
		
		if(imc < 16) {
			System.out.println("IMC: "+imc+"   Situa��o: Subpeso Severo");
		}
		else if(imc >= 16 && imc<20){
			System.out.println("IMC: "+imc+"   Situa��o: Subpeso");
		}
		else if(imc>=20 && imc<25) {
			System.out.println("IMC: "+imc+"   Situa��o: Normal");
		}
		else if(imc>=25 && imc<30) {
			System.out.println("IMC: "+imc+"   Situa��o: Sobrepeso");
		}
		else if(imc>=30 && imc<40) {
			System.out.println("IMC: "+imc+"   Situa��o: Obeso");
		}
		else {
			System.out.println("IMC: "+imc+"   Situa��o: Obeso M�rbido");
		}
		
	}
	
}
