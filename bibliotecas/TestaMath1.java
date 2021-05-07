package bibliotecas;

public class TestaMath1 {
	public static void main(String[] args) {
		
		int i = -10;
		System.out.println("i: "+i);
		int j = Math.abs(i);
		System.out.println("abs i: "+j);
		System.out.println("abs i: "+Math.abs(i));
		
		double d1 = 4.15;
		System.out.println("d1: "+d1);
		double d2 = 4.0000;
		System.out.println("d2: "+d2);
		
		double d3 = Math.round(d1);
		System.out.println("round d1: "+d3);
		double d4 = Math.max(d1, d3);
		System.out.println("max d1,d2: "+d4);
		
		//Testa Math1
		//1terefas para a turma:
		//Implementar e testar Math.min()
		double e1 = Math.min(d1, d3);
		System.out.println("min d1,d2: "+e1);
		
		//Funcoes Ceil e floor
		System.out.println("ceil d1: "+Math.ceil(d1));
		double d5 = 4.99999999;
		System.out.println("floor d5: "+Math.floor(d5));
		
		//Testa Math2
		//Implementar e Testar Math.exp, Meth.log, Meth.pow
		//Math.sqrt, log de a na base b
		double x = 28;    
        double y = 4; 
        System.out.println("x: "+x+" e y:"+y);
        System.out.println("exp x: " +Math.exp(x));  
        System.out.println("Log x: " + Math.log(x));   
        System.out.println("Log y: " + Math.log(y));  
        System.out.println("Power x e y: " + Math.pow(x, y));    
        System.out.println("Square y: " + Math.sqrt(y));   
		
		//Testa Math3
		//Ver a diferença de Math.sin e Math.toDegrees, Math.toRadians
        System.out.println("Seno do Radiano 8: " + Math.sin(8));
        System.out.println("Radianos p/ Grau 8: " + Math.toDegrees(8));
        System.out.println("Graus p/ Radians 8: " + Math.toRadians(8));
		
	}
}

//https://guides.github.com/introduction/flow/
//https://docs.oracle.com/en/java/javase/16/docs/api/index.html
//https://docs.oracle.com/en/java/javase/index.html

//https://www.oracle.com/java/technologies/platform-glance.html

//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
