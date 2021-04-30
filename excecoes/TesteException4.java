package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException4 {
	
	public static void metodo() throws FileNotFoundException{
	
			new FileReader("c:\\arquivodeteste.txt");
	
	}
	
}
