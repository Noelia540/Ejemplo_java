package paquete;

import java.util.Scanner;

public class Area_y_volumen_esfera {

	//constante
	final static double PI=3.141592;
	
	 public static void main (String[]args) {
		 Scanner scanner= new Scanner (System.in);
		 double radio = 0d;
		 double volumen,area;
		 
		 //entrada
		 System.out.println("Dame el radio para los calculos de la esfera : " );
		 radio= scanner.nextDouble();
		 
		 //algoritmo
		 area= 4*PI*Math.pow(radio, 2); 
		 volumen=4*PI*Math.pow(radio, 3)/3;
		 
		 //salida
		 System.out.println("El area de la esfera es: " + area );
		 System.out.println("el volumen de la esfera es: " + volumen);
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		 
		 
		 
	}	
}
