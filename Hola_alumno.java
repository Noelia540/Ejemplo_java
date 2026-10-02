package paquete;

import java.util.Scanner;

public class Hola_alumno {

	
	public static void main(String[] args) {
		
		//variable a utilizar
		Scanner sc = new Scanner (System.in);
		String nome   = new String ("") ;
		
		//System.out.println("antes de recoger: " +  nome );
		
		//sacar mensaje de peticion de nombre
		System.out.println("Dame tu nombre: ");
		
		//guardar en una variable de tipo cadena 
		nome = sc.nextLine();
		
		//mostrar salida
		System.out.append("TE GUSTA PROGRAMAR, eh..."+nome      );
		
		sc.close();
	}
	
	
}
