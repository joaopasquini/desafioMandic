package segundoDesafio;

import java.net.URLConnection;
import java.util.Scanner;
import java.net.URL;
import java.io.IOException;
import java.net.MalformedURLException;



public class app {
   public static void main(String[] args) {
	  Scanner userInput = new Scanner(System.in);
      
      boolean loop = false;
      
	  while(!loop) {
		  delay(1000);
		  try {
			   URL endereco = new URL("https://www.google.com");
			   
			   URLConnection conexao = endereco.openConnection();
			   
			   conexao.connect();
			   System.out.println("Internet conectada!");
		  } catch (MalformedURLException e) {
			   System.out.println("Internet indisponível!");
		    } catch (IOException e) {
			   System.out.println("Internet indisponível!");
		    }
	  }  
  }

  public static void delay(int tempoEmMilisegundos) {
	   try
	   {
	       Thread.sleep(tempoEmMilisegundos);
	   }
	   catch(InterruptedException ex)
	   {
	       Thread.currentThread().interrupt();
	   }
  }
   
   
}