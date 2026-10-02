package paquete;

public class Suma {

	static int n1 = 50; // variable miembro de la clase
	
	public static void main (String [] args){
		int n2 = 30 , suma = 0 ; // variables locales
		incrementoN1(); // n1 pasa a valer 200
		suma= n1+n2;
		System.out.println("LA SUMA ES: " + suma); // es 30+200
		
		//llamo a manolito de nuevo
		incrementoN1(); // n1 vale 350
		
		
	}
		public static void incrementoN1 () {
			
			n1=n1+150;
			//n2=n2+25;  // n2 NO es global
			System.out.println("la variable n1 vale: " + n1);
			
			
			
			
		}		
	}	
	

