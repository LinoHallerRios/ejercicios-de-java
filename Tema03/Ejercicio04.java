/**
* Lectura de datos desde teclado
*
* Programa que sume, reste, multiplique y divida dos números
* introducidos por teclado.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio04{
  public static void main(String[] args){
    
    String numero1;
    String numero2;
    double multiplicacion;
    double suma;
    double resta;
    double division;
    
    System.out.printf("\nIntroduce un número: ");
    numero1 = System.console().readLine();
    
    System.out.printf("\nIntroduce otro número: ");
    numero2 = System.console().readLine();
    
    division = Double.parseDouble(numero1) / Double.parseDouble(numero2);
    suma = Double.parseDouble(numero1) + Double.parseDouble(numero2);
    resta = Double.parseDouble(numero1) - Double.parseDouble(numero2);
    multiplicacion = Double.parseDouble(numero1) * Double.parseDouble(numero2);
    
    System.out.printf("\nLa división será: %.3f ",division);
    System.out.printf("\nLa suma será: %.3f ",suma);
    System.out.printf("\nLa resta será: %.3f ",resta);
    System.out.printf("\nLa multiplicación será: %.3f ",multiplicacion);
    
  }

}
