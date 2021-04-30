package ooavc;

public class TestaPolimorfismo1 {
	public static void main(String[] args) {
		//Funcionario f1 = new Funcionario();
		//f1.setSalario(1000);
		//double salFunc = f1.getSalario();
		//System.out.println("O salario é: "+salFunc);
		//System.out.println("O bunos é: "+f1.getBonus());

		Gerente g1 = new Gerente();
		g1.setSalario(1000);
		double salFunc1 = g1.getSalario();
		System.out.println("O salario é: "+salFunc1);
		System.out.println("O bunos é: "+g1.getBonus());
	}

}
