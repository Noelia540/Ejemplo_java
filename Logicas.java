package paquete;

import java.util.Scanner;

public class Logicas {

	public static void main(String[]args){
		int m, n;
		boolean res;
		Scanner scanner = new Scanner(System.in);
		
		//1 pido el primer numero
		System.out.println("introduce m (entero): " );
		m = scanner.nextInt();
		
		//2 pido el segundo numero
		System.out.println("introduce n (entero): " );
		n  = scanner.nextInt();
		
	
	res =    (m > n) && (m >= n);   //res=false´
	System.out.println(res);
	
	
	res = ! (   (m < n) ||(m != n)    );//res=false
	System.out.println(res);
	
	
	}
}
