package ooavc;

public class Caixa extends Funcionario implements AcessoBancoInterno{
	
	int senha;
	
	public boolean verifica (int senha) {
		//metodo de verificacao da senha
		//inplementacao disferente do metodo
		//da classe Gerente
		return false;
	}
	
	double getBonus() {
		return 0;
	}
	
}
