/**
* Sentencia condicional ( if y switch )
*
* 
* @author Lino Haller Ríos
*/
public class Ejercicio14{
  public static void main(String[] args){
    
    String num1;
    double numero1;
    double division2;
    double division5;
    double resto;
    
    System.out.printf("\n\nPorfavor, introduzca un número: ");
    num1 = System.console().readLine();
    
    numero1 = Integer.parseInt(num1);
      
    division2 = numero1 % 2 ;
    division5 = numero1 % 5 ;
    
    if (division2 != 0) {
    
      System.out.printf("\nEl número es impar");
    
    }

    if (division2 == 0) {
    
      System.out.printf("\nEl número es par");
    
    }
    
    if (division5 == 0) {
    
      System.out.printf("\nEl número es divisible entre 5.");
    
    }

  }

}
