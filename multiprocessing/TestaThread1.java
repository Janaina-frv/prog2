package multiprocessing;

public class TestaThread1 {
	public static void main(String[] args) {
		DesenhaMapa dMapa = new DesenhaMapa();
		//Thread tMapa = new Thread((Runnable) dMapa);
		Thread tMapa = new Thread(dMapa);
		
		BarraDeProgresso bProg = new BarraDeProgresso();
		Thread tProg = new Thread(bProg);
		
		tMapa.run();
		tProg.run();
	}
}
