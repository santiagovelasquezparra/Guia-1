import java.util.Scanner;
/**
 * EEste programa sirve para organizar la logística y administración de un colectivo. .
 * 
 * @author (Santiago Velasquez) 
 * @version (a version number or a date)
 */
public class Ej8Colectivo
{
   public static void main(String[] args)
   {
       //Tenemos 2 datos de entrada
       //La capacidad del colectivo
       //El número de pasajeros
       //Definir 2 variables
       double capacidad, pasajeros;
       //Dato de salida
       //Número de viajes
       //Suma de todos los pasajes
       //Alquiler a la empresa propietaria del vehiculo
       double viajes, pasajes, alquiler;
       //Acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //preguntar datos de entrada
       System.out.print("Por favor ingrese la capacidad del colectivo: ");
       capacidad = teclado.nextDouble();
       System.out.print("Por favor ingrese el número de pasajeros: ");
       pasajeros = teclado.nextDouble();       
       //Calcular los datos de salida
       viajes = (pasajeros / capacidad);
       pasajes = (pasajeros * 10000);
       alquiler = ((((int)(Math.ceil(viajes))) * 2000));
       //Mostrar los datos de salida
       System.out.print("El número de viajes que debe hacer el colectivo es:  " + (int)(Math.ceil(viajes)));
       System.out.print("\nEl valor de todos los pasajes es de: " + ((int)(pasajes)) + " pesos.");
       System.out.print("\nEl valor que el conductor debe pagar a la empresa es de:  " + (int)alquiler + " pesos.");
    }
}

