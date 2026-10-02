package paquete;

import java.util.Scanner;

public class Ejercicio_De_Multiplicar {

	// funcion que multiplique dos números enteros
	public static int multiplicarEnteros(int num1, int num2) {
		// declaro una variable local
		int multiplicar = 0;
		// algoritmo de la multiplicación
		multiplicar = num1 * num2;
		return multiplicar ;
	}

	// metodo main

	public static void main(String[] args) {
		int a, b; // dos variables
		Scanner scanner = new Scanner(System.in);
		int resultado = 0;

		// 1 pedir primer entero
		System.out.println("Introduce el primer número entero:");
		a = scanner.nextInt();
		// 2 pedir el segundo entero
		System.out.println("Introduce el segundo número entero:");
		b = scanner.nextInt();
		// 3 Llamar a la función multiplicacion
		resultado = multiplicarEnteros(a, b);
		// mostrar resultado
		System.out.println("El total es:" + resultado + ", eres un crack");

	}

}
