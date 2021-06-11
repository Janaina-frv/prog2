package progredes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9000);
		System.out.println("Porta 9000 aberta, aguardando conexão com o cliente");
		
		Socket client = server.accept();
		System.out.println("Conexão com o cliente "+client.getInetAddress().getHostAddress());
		
		Scanner s = new Scanner(client.getInputStream());
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		
		s.close();
		client.close();
		server.close();
		
	}
}
