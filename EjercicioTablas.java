package paquete;

public class EjercicioTablas {

	public static void main (String[] args){
		
	for(int i=1 ; i<=10; i++)  {//es un bucle externo crea la variable 'i' empezando en 1 y se ejecuta mientras 'i' sea menor o igual a 10.
			for(int j=1; j<=10; j++ ) { //Es un bucle interno crea la variable 'j' del 1 al 10. Representa los multiplicadores.

			System.out.println("TABLA DE MULTIPLICAR DEL NUMERO: " +i); // Muestra en pantalla el encabezado de la tabla actual (se ejecuta solo una vez por cada número i)
			System.out.println(i + " por " + j + " es: " +i*j); //Muestra la operación actual multiplicando 'i' por 'j' y calculando su resultado (ij)
			}// Fin bucle interno j
			System.out.println("-------------------------");//Como esta fuera del bucle interno solo se pondra en el bucle externo las lineas
		 } // fin bucle externo i 
	
	
}
}
