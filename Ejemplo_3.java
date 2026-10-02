package paquete;

import java.util.Scanner;

public class Ejemplo_3 {

	
	public static void main (String []args) {
	
		//dividiendo= divisor*cociente+ modulo
		
	int a, b; //dos variables
	Scanner scanner= new Scanner (System.in);
	int cociente = 0;
	int modulo=0;
	
	//1 pido el primero entero
	System.out.println("introduce el primer entero: ");
	a=scanner.nextInt();
	
	//2 pido el segundo entero
	System.out.println("introduce el segundo entero: ");
	b=scanner.nextInt();
	
	//3 algoritmo de cociente entero
	cociente=a/b;
	modulo= a%b;
	
	// 4 mostrar
	System.out.println("el COCIENTE es :  "+ cociente);
	System.out.println("el MODULO es: " + modulo);
	
		
	}
}

