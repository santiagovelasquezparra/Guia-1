import java.util.Scanner;
/**
 * Write a description of class Ej8Colectivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej8Colectivo
{
   public static void main(String[] args)
   {
       //tenemos 3 datos de entrada; base, h, ht
       //definir 3 variables
       double capacidad, pasajeros;
       //dato de salida: area de la casa
       double viajes, pasajes, alquiler;
       //acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //preguntar datos de entrada
       System.out.print("Por favor ingrese la capacidad del colectivo: ");
       capacidad = teclado.nextDouble();
       System.out.print("Por favor ingrese el número de pasajeros: ");
       pasajeros = teclado.nextDouble();       
       //calcular los datos de salida
       viajes = (pasajeros / capacidad);
       pasajes = (pasajeros * 10000);
       alquiler = ((((int)(Math.ceil(viajes))) * 2000));
       //mostrar los datos de salida
       System.out.print("El número de viajes que debe hacer el colectivo es:  " + (int)(Math.ceil(viajes)));
       System.out.print("\nEl valor de todos los pasajes es de: " + ((int)(pasajes)) + " pesos.");
       System.out.print("\nEl valor que el conductor debe pagar a la empresa es de:  " + (int)alquiler + " pesos.");
    }
}

