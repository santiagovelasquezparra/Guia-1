import java.util.Scanner;
/**
 * Write a description of class Arirmética here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ej1Aritmética
{
    public static void main(String[] args)
   {
       //Tenemos 2 variables enteras: a y b.
       //Definir variables
       int a, b;
       //dato de salida: area de la casa
       double suma, resta, producto, cociente, residuo, logaritmo, potencia;
       //acceso al teclado
       Scanner teclado = new Scanner(System.in);
       //preguntar datos de entrada
       System.out.print("Por favor escriba la variable (a) en numeros enteros:");
       a = teclado.nextInt();
       System.out.print("Por favor escriba la variable (b) en numeros enteros:");
       b = teclado.nextInt();
       //calcular los datos de salida
       suma = a + b;
       resta = a - b;
       producto = a * b;
       cociente = a / b;
       residuo = a % b;     
       logaritmo = java.lang.Math.log(a);
       potencia = java.lang.Math.pow(a ,b);
       //mostrar los datos de salida
       System.out.print("SUMA = " + suma);      
       System.out.print("   RESTA = " + resta);
       System.out.print("   MULTIPLICACION = " + producto);
       System.out.print("   DIVISIÓN = " + cociente);
       System.out.print("   RESIDUO = " + residuo);      
       System.out.print("   LOGARITMO = " + logaritmo); 
       System.out.print("   POTENCIA = " + potencia); 
    }
}
