package paquete;

import java.util.Scanner;

public class Funcion {
	
	//NO DECLARO UN CONSTRUCTOR PUES USO EL CONSTRUCTOR POR DEFECTO
	
	// funcion o metodo que sume dos enteros
		public  int sumaEnteros(int num1, int num2) {
	
			// declaro una variable local
			int suma = 0;
			// algoritmo de la suma
			suma = num1 + num2;
			return suma;
		}
		public  int multEnteros(int num1, int num2) {
			// declaro una variable local
						int multiplicación = 0;
						// algoritmo de la suma
						multiplicación = num1 * num2;
						return multiplicación;
		}
		// metodo main
		public static void main(String[] args) {

			int a, b; // dos variables enteras
			Scanner scanner = new Scanner(System.in);
			int resultado = 0;
			int otro_resultado= 0;

			// 1 pido el primer numero
			System.out.println("introduce el primer entero:");
			a = scanner.nextInt();

			// 2 pido el segundo entero
			System.out.println("introduce el segundo entero:");
			b = scanner.nextInt();

			// 3 llamar a la funcion suma ????????????????????
			Funcion objetito = new Funcion ();
			resultado = objetito.multEnteros(a, b);
			
			otro_resultado = objetito.sumaEnteros(a,b);
			
			// 4 mostrar
			System.out.println("el total es:" + resultado);
			System.out.println("el total multiplicado es:" + otro_resultado);
		}

	}

