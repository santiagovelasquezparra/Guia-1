import java.util.Scanner;
/**
 * Este programa permite hallar el volumen del tronco de un cono.
 * 
 * @author (Santiago Velasquez) 
 * @version (a version number or a date)
 */
public class Ej10Tronco
{
    public static void main(String[] args)
   {
       //Tenemos 4 datos de entrada
       //Radio del área de la base y la altura del cono completo. 
       //Radio del área de la base y la altura del cono deficiente.        
       double r1, h1, r2, h2;
       //Dato de salida: Volumen cono completo
       //Volumen cono deficiente
       //Tronco del cono
       double v1, v2, tronco;
       //Acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //preguntar datos de entrada
       System.out.print("Ingrese el radio de la base del cono completo: ");
       r1 = teclado.nextDouble();
       System.out.print("Ingrese la altura del cono completo: ");
       h1 = teclado.nextDouble();
       System.out.print("Ingrese el radio de la base del cono deficiente: ");
       r2 = teclado.nextDouble();
       System.out.print("Ingrese la altura del cono deficiente: ");
       h2 = teclado.nextDouble();
       //Calcular los datos de salida
       //Volumen del cono completo
       v1 = (Math.PI * Math.pow(r1, 2) * h1) / 3;
       //Volumen del cono deficiente
       v2 = (Math.PI * Math.pow(r2, 2) * h2) / 3;
       //Volumen del tronco de cono
       tronco = v1 - v2;
       //Mostrar los datos de salida
       System.out.print("El volumen del cono completo es de:  " + v1);
       System.out.print("\nEl volumen del cono deficiente es de:  " + v2);
       System.out.print("\nEl volumen del tronco de cono es de:  " + tronco);
    }
}
