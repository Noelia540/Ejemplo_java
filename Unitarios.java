package paquete;

import java.util.Scanner;

public class Unitarios {

	public static void main(String[]args) {
	
		
		int m=2, n=5;
		Scanner scanner = new Scanner (System.in);
		
		//Pido primer número
		System.out.println("introduce el primer entero: " );
		m = scanner.nextInt();
		//Pido el segundo número
		System.out.println("introduce el segundo entero: " );
		n = scanner.nextInt();
		
		m++; // m <---  m+1
		System.out.println("valor de m: " +m);
		
		n--; // n<--- n-1
		System.out.println("valor de n: " +n);
		
		++m; //???????? m <---  m+1
		System.out.println("valor de m: " +m);
		
		--n; // ???????n<--- n-1
		System.out.println("valor de n: " +n);
		
		int x = 5;
		System.out.println(x++); // imprime 5 y luego x pasa a ser 6.
		System.out.println("Siguiente línea: " + x); 
		
		int y = 5;
		System.out.println(++y); // Primero x pasa a ser 6 y luego imprime 6.
		
		
	
	
	}
}
