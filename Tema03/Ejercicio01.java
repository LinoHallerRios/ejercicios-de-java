/**
* Lectura de datos desde teclado
*
* Programa que pida dos números y que luego muestre el resultado
* de su multiplicación.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio01{
  public static void main(String[] args){
    
    String numero1;
    String numero2;
    double multiplicacion;
    
    System.out.printf("\nIntroduzca un número:  ");
    numero1 = System.console().readLine();
    
    System.out.printf("\nIntroduzca otro número:  ");
    numero2 = System.console().readLine();
    
    multiplicacion = Double.parseDouble(numero1) * Double.parseDouble(numero2);
    
    System.out.printf("\nLa multiplicación de los dos es: %.3f",multiplicacion);
  }

}
