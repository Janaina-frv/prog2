package ooavc;

public class TestaConta1 {
	public static void main(String[] args) {
		//Operacao de declaracao
		//So criou a referencia, o ponteiro
		//Conta c1;
		
		//Peracao de instaciacao
		//Agora eu crie concretamente a
		//Estrutura de uma Conta em memo
		//c1 = new Conta();
		
		//Fazendo declaracao e instaciacao
		//Na mesma linha
		//Conta c1 = new Conta();
		
		//Operacoes de inicializacao dos a
		//c1.numero = 001;
		//c1.nome = "Mateus";
		//c1.saldo = "1000.0";
		
		//Conta c1 = new ContaPoupanca();
		//c1.setNumero(002);
		//System.out.println(c1.getNumero());
		
		Conta c1 = new ContaPoupanca();
		c1.numero = 001;
		c1.nome = "Mateus";
		c1.saldo = 1000.0;
		c1.limite = 100.0;
		
		System.out.println("Nr da conta:"+c1.numero);
		System.out.println("Titular:"+c1.nome);
		System.out.println("Saldo atual:"+c1.saldo);
		System.out.println("Limite:"+c1.limite);
		
		double valorSaque = 200;
		boolean resultado = c1.sacar(valorSaque);
		//if(c1.sacar(valorSaque)) fasttrack
		if(resultado) {
			System.out.println("Voce sacou R$"+valorSaque);
		}else {
			System.out.println("Saque não autorizado");
		}
		
		
		
		
		
	}
}
