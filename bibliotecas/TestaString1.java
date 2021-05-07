package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		//String a = new String("Java ADS an veia");
		//System.out.println(a);
		String a = new String("Java ADS an veia");
		String b = new String("Java ADS an veia");
//		int a = 2;//tipo primitivo, o comportamento é diferente
//		int b = 3;
		if (a == b) {
			System.out.println("a e b são iguais");
		} else {
			System.out.println("a e b são objetos diferentes");
		}
		//se quero comprar o conteudo de um obj String, tenho que usar Equals
		if (a.equals(b)) {
			System.out.println("a e b são iguais");
		} else {
			System.out.println("a e b são objetos diferentes");
		}
	}

}
