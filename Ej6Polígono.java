import java.util.Scanner;
/**
 * Este programa sirve para encontrar el área de un polígono regular.  * 
 * 
 * @author (Santiago Velasquez) 
 * @version (a version number or a date)
 */
public class Ej6Polígono
{
    public static void main(String[] args)
   {
       //Tenemos 2 datos de entrada; s (longitud del lado)
       //y n (número de lados)
       //definir 2 variables
       double s, n;
       //dato de salida: area de la casa
       double Area;
       //acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //Preguntar datos de entrada
       System.out.print("Por favor ingrese la longitud de un lado del polígono:  ");
       s = teclado.nextDouble();
       System.out.print("Por favor ingrese el número de lados del polígono:  ");
       n = teclado.nextDouble();
       //Calcular los datos de salida
       Area = (n * Math.pow(s, 2)) / (4 * Math.tan (Math.PI / n));
       //mostrar los datos de salida
       System.out.print("El área del polígono con  " + n + " Lados y de longitud  " + s + " es: " + Area);
    }
}
