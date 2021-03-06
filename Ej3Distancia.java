import java.util.Scanner;
/**
 * Este programa sirve para encontrar la distancia entre dos puntos en la tierra. .
 * 
 * @author (Santiago Velasquez) 
 * @version (a version number or a date)
 */
public class Ej3Distancia
{
    public static void main(String[] args)
   {
       //Tenemos 4 datos de entrada; t1, g1, t2, g2
       //t1 y g1 corresponden a la latitud y longitud de la primera ciudad
       //t2 y g2 corresponden a la latitud y longitud de la segunda ciudad
       //Definir las variables
       double t1, g1, t2, g2;
       //Datos de salida: Distancia entre los dos puntos
       double Distancia;       
       //acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //preguntar datos de entrada
       System.out.print("Ingrese la latitud de la primera ciudad:");
       t1 = teclado.nextDouble();
       System.out.print("Ingrese la longitud de la primera ciudad:");
       g1 = teclado.nextDouble();
       System.out.print("Ingrese la latitud de la segunda ciudad:");
       t2 = teclado.nextDouble();
       System.out.print("Ingrese la longitud de la segunda ciudad::");
       g2 = teclado.nextDouble();
       //calcular los datos de salida
       //Para enncontrar la distancia tenemos la formula 6371.07 * arccos(sin(t1) * sin(t2) + cos(t1) cos(t2) cos((g1 - g3)))
       Distancia = 6371.07 * (Math.acos (Math.sin(t1) * Math.sin(t2) + Math.cos(t1) * Math.cos(t2) * Math.cos(g1 - g2)));
       //mostrar los datos de salida
       System.out.print("La distacia entre estos 2 puntos es : " + Distancia + "Km");
    }
}
