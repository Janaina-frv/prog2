package ooavc;

public class TestaPolimorfismo1 {
	public static void main(String[] args) {
		//Funcionario f1 = new Funcionario();
		//f1.setSalario(1000);
		//double salFunc = f1.getSalario();
		//System.out.println("O salario �: "+salFunc);
		//System.out.println("O bunos �: "+f1.getBonus());

		Gerente g1 = new Gerente();
		g1.setSalario(1000);
		double salFunc1 = g1.getSalario();
		System.out.println("O salario �: "+salFunc1);
		System.out.println("O bunos �: "+g1.getBonus());
	}

}
