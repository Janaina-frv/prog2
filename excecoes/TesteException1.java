package excecoes;

public class TesteException1 {
	public static void main(String[] args) {
		System.out.println("Inicio do metodo main");
		metodo1();
		System.out.println("Fim do metodo main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo 2");
		//faz alguma coisa entre o inicio e fim do metodo 2
		int array[];
		array = new int[10];
		try {
			for(int i =0; i<20;i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro pego(catched): "+e);
		}
		
		System.out.println("Fim do metodo 2");
	}

}
