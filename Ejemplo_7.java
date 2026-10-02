package paquete;

import java.util.Scanner;

public class Ejemplo_7 {

	//constante
	final static double PI=3.141592;
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		double radio = 0d;
		double longitud,area;
		
		//entrada
		System.out.println("Dame el radio para los calculos: " );
		radio= scanner.nextDouble();
		
		//algoritmo
		longitud  = 2*PI*radio;
		area= 4*PI*Math.pow(radio, 2)/3; //pi*radio*radio
		
		//salida
		System.out.println("La longitud de la circunferencia es: " + longitud );
		System.out.println("El area del circunferencia es: " + area);
		
	
	}
	
	
	
}
