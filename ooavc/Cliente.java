package ooavc;

public class Cliente implements AcessoBancoInterno{
		String nome;
		String sobreNome;
		String cpf;
		
		public boolean verifica(int senha) {
			return false;
		}

}
