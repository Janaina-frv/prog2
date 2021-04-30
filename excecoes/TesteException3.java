package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException3 {
	public static void main(String[] args) {
		//try {
			//codigo com varias classes checked
	//	} catch (FileNotFoundException e) {
		//	e.printStackTrace();
		//} catch (IllegalAcessException e) {
		//	e.printStackTrace();
		//} catch (IOException e) {
		//	e.printStackTrace();
		//} finally {
		//	conn.close()
		//}
		try {
			new FileReader("c:\\arquivodeteste.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
