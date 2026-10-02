package paquete;

import java.util.Scanner;

public class Tarea2_por_Pepe {


 
public static void main (String [] args) {
	
	Scanner scanner = new Scanner (System.in);

System.out.println("De que número quieres saber los multiplos");
int n = scanner.nextInt();

System.out.println("¿Cuantos multiplos deseas ver?");
int tope =  scanner.nextInt();
/*
 * while (n<2 || n>9) {
 * System.out.println("Error. El número debe estar entre 2 y 9");
 * System.out.println("Introduce otro numero"); n=scanner.nextInt();
 */


for (int i=0; i < tope ;i++){
	
	
System.out.println("Multiplo de" + n + ":" + n*i);
}
 
System.out.println("fin....");
scanner.close();



}
}