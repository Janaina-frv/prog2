package ooavc;

public class TestaConta3 {
	public static void main(String[] args) {
		Conta c1; //declaracao 
		c1 = new Conta(); //instancializacao - passa a ser estrutura
		c1.limite = 100; //inicializacao
		
		Conta c2; //at� esse momento ainda s� tem o ponteiro
		c2 = c1; // t� apontando pro mesmo lugar
		c2.limite = 200; //sobrescevendo
		
		// dois ponteiros
		//1 estrutura s�, al�m da original
		
		System.out.println(c1.limite);
		
	}
	
}
