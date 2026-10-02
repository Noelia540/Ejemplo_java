package paquete;

public class Ejemplo_Ternario {
public static void main (String[]args) {
	 // Ejemplo 1: Comprobación de mayoría de edad (Evaluación básica)
    int edad = 20;
    String mensaje = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
    System.out.println("Ejemplo 1: " + mensaje);

    // Ejemplo 2: Obtener el número máximo entre dos valores (Asignación directa)
    int num1 = 15;
    int num2 = 42;
    int maximo = (num1 > num2) ? num1 : num2;
    System.out.println("Ejemplo 2: El número mayor es: " + maximo);

    // Ejemplo 3: Operador ternario anidado (Clasificación de notas)
    int nota = 85;
    String resultado = (nota >= 90) ? "Sobresaliente" :
                       (nota >= 70) ? "Notable" : 
    				   (nota >= 50) ? "Aprobado" : "Suspenso";
    System.out.println("Ejemplo 3: Calificación: " + resultado);
    
    
    //ALTERNATIVA CLASICA
     int notas=85;
     String resultados;
     
     if(notas >=90) {
    	 resultados ="Sobresaliente ;";
     }	 else if (notas >= 70) {
    	 resultados = "Notable" ;
     } else if (notas >= 50) {
    	 resultados = "Aprobado";
     } else {
    	 resultados = "suspenso";
     }
  System.out.println("Ejemplo 3 : Calificación: " + resultado);
}
	
}
	
	
	
	
	
	
	

