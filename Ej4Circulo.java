import java.util.Scanner;
/**
 * Este programa sirve para encontrar el área y el volumen de un círculo.
 * 
 * @author (Santiago Velasquez) 
 * @version (a version number or a date)
 */
public class Ej4Circulo
{
    public static void main(String[] args)
   {
       //Tenemos 1 dato de entrada; r
       //definir 3 variables
       double r;
       //Dato de salida: Area y Volumen
       double Area, Volumen;
       //Acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //preguntar datos de entrada
       System.out.print("Por favor ingrese el radio del cirulo: ");
       r = teclado.nextDouble();
       //Calcular los datos de salida
       //Tenemos que la fórmula para hallar el área de u circulo es A = π r² 
       Area = Math.PI * Math.pow(r, 2);
       //Tenemos que la fórmula para hallar el volumen de una esfera con el radio es V = ⁴⁄₃πr³ 
       Volumen = (4 * Math.PI * Math.pow(r, 3)) / 3;
       //mostrar los datos de salida
       System.out.print("El área del circulo con radio  "+ r + " es: " + Area);
       System.out.print("El volumen de una esfera con radio  " + r +" es: " + Volumen);
    }
}
