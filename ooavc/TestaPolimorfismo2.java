package ooavc;

public class TestaPolimorfismo2 {
	
	public static void main(String[] args) {
		//Funcionario f2 = new Funcionario();
		//f2.setSalario(1000);
		//double salFunc3 = f2.getSalario();
		//System.out.println("O salario �: "+salFunc3);
		//System.out.println("O bunos �: "+f2.getBonus());

		Gerente g2 = new Gerente();
		g2.setSalario(1000);
		double salFunc4 = g2.getSalario();
		System.out.println("O salario �: "+salFunc4);
		System.out.println("O bunos �: "+g2.getBonus());
	}

}
