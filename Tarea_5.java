package paquete;

import java.util.Scanner;

public class Tarea_5 {

	public static void main (String []args) {
	
	int m , n;
	boolean reset ;
	
	Scanner scanner = new Scanner ( System.in);
	
	//1 pido primer número
	System.out.println("introduce m (entero): " );
	m = scanner.nextInt();
	
	//2 pido segundo número
	System.out.println("introduce n (entero): " );
	n = scanner.nextInt();
	
	reset = ( m >=n) && ( m<= n ) ; // Devuelve true si m y n son exactamente iguales
	System.out.println(reset);
	
	reset = (m > n) ^ (m < n ) ; // Devuelve true si un número es mayor o menor que el otro, pero false si son iguales
	System.out.println(reset);
	
	reset = !(m>= 0) || !(n >= 0); //  Devuelve true si m es negativo, si n es negativo, o si ambos lo son.
	System.out.println(reset);
	
	reset= (m > 0 ) && (n>0) && ( m != n); // Devuelve true únicamente si ambos son mayores que cero y no valen lo mismo.
	System.out.println(reset);
	 
	reset = ( m % 2==0)	|| (n % 2 ==0);	 // Devuelve true si m es par, si n es par, o si ambos son pares.
	System.out.println(reset);
	
	
	
	
	}	
}
