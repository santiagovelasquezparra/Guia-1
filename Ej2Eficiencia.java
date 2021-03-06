import java.util.Scanner;
/**
 * Este programa hace la conversion de MPG a LPK
 * 
 * @author (Santiago Velasquez) 
 * @version (a version number or a date)
 */
public class Ej2Eficiencia
{
      public static void main(String[] args)
   {
       //Tenemos un dato de entrada; MPG (Millas por gálon)       
       double MPG;
       //Tenemos un dato de salida: LPK (Litros por kilómetro)
       double LPK;
       //Acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //Preguntar dato de entrada
       System.out.print("Por favor ingrese la valor de MPG (Millas por gálon) : ");
       MPG = teclado.nextDouble ();
       //calcular los datos de salida
       //Tenemos que 1 milla = 1.609 km  y  1 gálon = 3.785 L
       //La formula seria la sigiente:
       //(MPG) * (1.609 km / 1 milla) * (1 gálon / 3.785 L) = LPK
       LPK = (MPG) * (1.609 / 1) * (1 / 3.785);
       //mostrar los datos de salida
       System.out.print("La conversion a LPK (Litros por kilómetro)es:  " + LPK);
    }
}
