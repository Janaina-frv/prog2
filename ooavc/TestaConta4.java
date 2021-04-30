package ooavc;

public class TestaConta4 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.numero = 001;
		c1.nome = "Rodrigo";
		
		Conta c2 = new Conta();
		c1.numero = 001;
		c2.nome = "Rodrigo";
		
		if (c1 == c2) {
			System.out.println("as contas sao iguais");
		} else {
			System.out.println("as contas sao diferentes");
		}
		
		int i;
		int j;
		i = 2;
		j = 2;
		
		if (i == j) {
			System.out.println("sao iguais");
		} else {
			System.out.println("sao diferentes");
		}
		
	}
}
