package paquete;

public class Ejemplo_6 {

public static void main (String [] args) 
{
byte a;

short b, c=3;
System.out.println("es un short: "+ c);
int d = -30;
System.out.println("es un int: " + d);
int e = 0xC125; /* cpor 16 al cubo + 1 por 16 al cuadrado + 2*16 + 5* (16 elevado a cero==1) */
System.out.println("es un int: " +e);

long be=434123 ;
System.out.println("es un long: " + be);
long bi=5L ; /* la L en este caso indica Long*/
System.out.println("es un long: " + bi);

char car1='c';
System.out.println("es un char: "+car1);
char car2=99; /*car1 y car2 son lo mismo porque el 99 en decimal es la ‘c’ */
System.out.println("es un char: "+car2);

float pi=3.1416f;
System.out.println("es un floar: " + pi);

float pia=3.1416F; /* la F en este caso indica Float*/

float medio=1/2F; /*0.5*/
System.out.println("es un float: "+ car2);

double  millon=1e6; /* 1x106 */
System.out.println("es un doble: " + millon);
double mediobis=1/2D; /*0.5 la D en este caso indica Double*/
System.out.println("es un doble: " + mediobis);
}
}