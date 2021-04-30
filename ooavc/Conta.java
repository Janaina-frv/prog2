package ooavc;

public class Conta {
	protected int numero;
	String nome;
	double saldo;
	double limite;
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
