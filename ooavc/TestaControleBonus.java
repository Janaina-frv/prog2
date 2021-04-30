package ooavc;

public class TestaControleBonus {
	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();
		
		//Funcionario f2 = new Funcionario();
		//f2.setSalario(1000);
		//System.out.println("Salario f2: "+f2.getBonus());
		//controle.setTotalBonus(f2);
		//System.out.println("Bonus acumulado f2: "+controle.getTotalBonus());
		
		Gerente g2 = new Gerente();
		g2.setSalario(10000);
		//System.out.println("Salario g2: "+g2.getBonus());
		controle.setTotalBonus(g2);
		System.out.println("Bonus acumulado g2: "+controle.getTotalBonus());
	}

}
