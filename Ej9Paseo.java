import java.util.Scanner;
/**
 * Este programa sirve para la planificación de un viaje de estudiantes.
 * 
 * @author (Santiago Velasquez) 
 * @version (a version number or a date)
 */
public class Ej9Paseo
{
    public static void main(String[] args)
   {
       //Tenemos 3 datos de entrada
       //Número de estudiantes gordos
       //Número de estudiantes flacos
       //Número de días del paseo
       //definir 3 variables
       double gordos, flacos, dpaseo;
       //Datos de salida
       //Número de buses
       //Número de platos de comida
       //Costo de toda la comida
       //Número de habitaciones
       //Costo de las habitaciones
       double nbuses, nplatos, ctcomida, nhabitaciones, cthabitaciones;
       //Acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //Preguntar datos de entrada
       System.out.print("Por favor ingrese el número de estudiantes gordos:  ");
       gordos = teclado.nextDouble();
       System.out.print("Por favor ingrese el número de estudiantes flacos:  ");
       flacos = teclado.nextDouble();
       System.out.print("Por favor ingrese el número de días que va a durar el paseo:  ");
       dpaseo = teclado.nextDouble();
       //Calcular los datos de salida
       nbuses = ((gordos * 2) + flacos) / 60;
       nplatos = ((gordos * 5) + (flacos * 3));
       ctcomida = nplatos * 10000 * dpaseo;
       nhabitaciones = (gordos + flacos) / 4;
       cthabitaciones = (int)Math.ceil(nhabitaciones) * 25000;
       //Mostrar los datos de salida
       System.out.print("El número de buses para todos los estudiantes es de:  " + (int)Math.ceil(nbuses));
       System.out.print("\nEl número de platos de comida diarios es de :  " + (int)nplatos);
       System.out.print("\nEl número de platos de comida para todo el viaje es de :  " + (int)nplatos * (int)dpaseo);
       System.out.print("\nEl costo de la comida para todo el viaje es de:   " + (int)ctcomida + " pesos.");
       System.out.print("\nEl número total de habitaciones es de:    " + (int)Math.ceil(nhabitaciones));
       System.out.print("\nEl costo de las habitaciones por día es de:    " + (int)cthabitaciones);
       System.out.print("\nEl costo de las habitaciones por todo el viaje es de:    " + (int)cthabitaciones * (int)dpaseo);
    }
}
