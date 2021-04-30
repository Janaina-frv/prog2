package ooavc;

public class Conta2 {
	protected int numero;
	Cliente cliente;
//	Cliente cliente = new Cliente();
	double saldo;
	double limite;
	
	Conta2 (int numero, Cliente cliente, double saldo, double limite){
		this.numero = numero;
		this.cliente = new Cliente();
		this.saldo = saldo;
		this.limite = limite;
	}
	
	boolean sacar(double valor) {
//		double saldoAlterado = saldo-valor;
//		saldo = saldoAlterado;
		//saldo = saldo - valor;
		if(valor>this.saldo+this.limite) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
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

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	void depositar (double valor) {
		this.saldo = this.saldo + valor;
	}

}
