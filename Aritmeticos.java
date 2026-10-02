package paquete;

import java.util.Scanner;

public class Aritmeticos {
    public static void main (String[] args) {	
    	
	int n1=2, n2;
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Introduce  el primer entero: ");
	n1 =scanner.nextInt();
	
	System.out.println("Introduce  el segundo entero: ");
	n2 = scanner.nextInt();
	
	n2= n1* n1; // n2=4
	System.out.println("producto da: " + n2);
	
	n2 = n2-n1; // n2=2
	System.out.println("resta de: " + n2);
	
	n2 = n2+n1+15; // n2=19
	System.out.println("suma da: "+ n2);
	
	n2= n2/n1; // n2=9
	System.out.println("cociente entero da: " + n2);
	
	n2= n2%n1; // n2=1
	System.out.println("modulo o resto da; " + n2);
		
	
}
}

