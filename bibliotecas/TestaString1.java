package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		//String a = new String("Java ADS an veia");
		//System.out.println(a);
		String a = new String("Java ADS an veia");
		String b = new String("Java ADS an veia");
//		int a = 2;//tipo primitivo, o comportamento � diferente
//		int b = 3;
		if (a == b) {
			System.out.println("a e b s�o iguais");
		} else {
			System.out.println("a e b s�o objetos diferentes");
		}
		//se quero comprar o conteudo de um obj String, tenho que usar Equals
		if (a.equals(b)) {
			System.out.println("a e b s�o iguais");
		} else {
			System.out.println("a e b s�o objetos diferentes");
		}
	}

}
