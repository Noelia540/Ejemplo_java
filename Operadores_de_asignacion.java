package paquete;

public class Operadores_de_asignacion {

	public static void main (String []args) {
	
		  int a;
	        int b = 3;

	        // 1. Suma y asignación (+=)  --->  a = a + b
	        a = 10;
	        a += b; 
	        System.out.println("a += b  -->  Resultado: " + a); // 10 + 3 = 13

	        // 2. Resta y asignación (-=)  --->  a = a - b
	        a = 10;
	        a -= b; 
	        System.out.println("a -= b  -->  Resultado: " + a); // 10 - 3 = 7

	        // 3. Multiplicación y asignación (*=)  --->  a = a * b
	        a = 10;
	        a *= b; 
	        System.out.println("a *= b  -->  Resultado: " + a); // 10 * 3 = 30

	        // 4. División y asignación (/=)  --->  a = a / b
	        a = 10;
	        a /= b; 
	        System.out.println("a /= b  -->  Resultado: " + a); // 10 / 3 = 3 (división entera)

	        // 5. Módulo/Resto y asignación (%=)  --->  a = a % b
	        a = 10;
	        a %= b; 
	        System.out.println("a %= b  -->  Resultado: " + a); // 10 % 3 = 1 (resto de la división)
	
	
	
	
	
	}
}
