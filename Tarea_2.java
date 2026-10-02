package paquete;

import java.util.Scanner;

public class Tarea_2 {
	//Este metodo pide retorna el número seleccionado del usuario
	public static int pedirNum(String mensaje) {
		//Declaro variable scanner
        Scanner scanner = new Scanner (System.in);

        System.out.println(mensaje);
        return scanner.nextInt();
    }
	 //Este metodo imprime la cantidad de veces del multiplo pedido
	public static void imprimirMultiplos(int multiplo, int cantidad) {
        for(int n=1; n<=cantidad; n++) {
            System.out.println(n + ": " + multiplo*n);
            //Realentiza el bucle 
            try {
				Thread.sleep(800);
			} catch (Exception e) {
				// TODO: handle exception
			}
        }
    }
	
	public static void main(String[] args) throws InterruptedException {
		        // 1.Pido el multiplo 
        int n = pedirNum("Introduce un número entero que quieras , por favor : ");  
        //2.Pido la cantidad de veces del multiplo
        int veces = pedirNum("¿Cuántos múltiplos que deseas entre 2-9? : " );
        //Bucle for que imprime los multiplos n veces pedidas
        imprimirMultiplos(n,veces);
           
         
        
        System.out.println("Ahí tienes el resultado , crack");
        
    }
}