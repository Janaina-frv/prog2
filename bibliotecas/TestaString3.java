package bibliotecas;

public class TestaString3 {
	public static void main(String[] args) {
		String a = "Java ADS na veia";
		System.out.println(a);
		char c = a.charAt(5); //zero based
		System.out.println(c);
		int i = a.length();  //non zero based (conta a partir de 1)
		System.out.println(i);
		
		//Exercicios de exemplos que voces devem
		//implementar com a classe String, os metodos:
		//TestaString4: substrig, trim, indexOf, lastIndexOf
		String x = " Java ADS na veia ";
		System.out.println(x.substring(6, 10));
		System.out.println(x.trim());		
		System.out.println(x.indexOf("a"));	
		System.out.println(x.lastIndexOf("a"));	
		//TestaString5: isEmpty, contains, replace
		String y = "";
		System.out.println(x.isEmpty()?"Está vazio":"Não está vazio");
		System.out.println(y.isEmpty()?"Está vazio":"Não está vazio");		
		System.out.println(x.contains("ADS")?"Contém":"Não contém");	
		System.out.println(y.contains("ADS")?"Contém":"Não contém");	
		System.out.println(x.replace("ADS", "AdS"));	
	}
}
