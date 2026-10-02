package paquete;

import java.util.Scanner;

public class Ejemplo_4 {

	//ejemplo de division de enteros con decimales
	public static void main (String[] args){
	
	
		//dividiendo= divisor*cociente+ modulo
		float a ; //ent
		float b ; //float
		Scanner scanner= new Scanner (System.in);
		float resultado = 0;
		
		//1 pido el primero entero
		System.out.println("introduce el primer número: ");
		a=scanner.nextFloat();
		
		//2 pido el segundo entero
		System.out.println("introduce el segundo número: ");
		b=scanner.nextFloat(); 
		
		//3 algoritmo de cociente entero Uno de los dos tiene que ser flotante
		resultado=a/b;
	
		// 4 mostrar
		System.out.println("el resultado es :  "+ resultado);
	
	}
}
