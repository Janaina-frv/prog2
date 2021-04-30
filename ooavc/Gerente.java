package ooavc;

public class Gerente extends Funcionario implements AcessoBancoInterno {

	int senha;

	public boolean verifica (int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
	//v2 do bonus: percent 15% fixo 
	//	double getBonus () {
	//		return this.salario * 0.15;
	//	}
	//v4 do bonus: percent 5% mais um valor fixo de R$ 5.000
	double getBonus () {
		return this.salario * 0.5 +5000;
	}

}
