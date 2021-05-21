package ooavc;

public class Conta3 {
	private static int contadorContas;
	int numero;
	Cliente cliente;
	double saldo;
	double limite;
	
	public Conta3() {
		super();
	}

	public Conta3 (int numero, String nome, double saldo, double limite){
		this.numero = numero;
		this.cliente = new Cliente();
		this.cliente.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
		contadorContas++;
				
	}
	
	public int getcontadorContas(){
		return Conta3.contadorContas;
	}
	
	public boolean sacar(double valor) {
//		double saldoAlterado = saldo-valor;
//		saldo = saldoAlterado;
		//saldo = saldo - valor;
		if(valor>this.saldo+this.limite) {
			return false;
		} else {
			saldo = saldo - valor;
			return true;
		}
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar (double valor) {
		this.saldo = this.saldo + valor;
	}

}
