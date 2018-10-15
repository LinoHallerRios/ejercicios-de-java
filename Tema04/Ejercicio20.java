/**
 * 4. Sentencia condicional ( if y switch )
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio20 {

  public static void main(String[] args) {
    
    int num;
    String num1;
    
    System.out.printf("\nPor favor, introduzca un número de hasta 5 cifras: ");
    num1 = System.console().readLine();
    num = Integer.parseInt(num1);
    
    if (num < 10) {
      
      System.out.printf("\nEl número es capicúa.");
      
    }
    
    if ((num >= 10) && (num < 100)) {
      
      if ((num / 10) == (num % 10)) {
        
        System.out.printf("\nEl número es capicúa.");
        
      }else {
      
      System.out.printf("\nEl número no es capicúa.");
      
      }
      
    }

    if ((num >= 100) && (num < 1000)) {
      
      if ((num / 100) == (num % 10)) {
        
        System.out.printf("\nEl número es capicúa.");
        
      }else {
      
      System.out.printf("\nEl número no es capicúa.");
      
      }
      
    }

    if ((num >= 1000) && (num < 10000)) {
      
      if (((num / 1000) == (num % 10)) && ((( num / 100 ) % 10)== (( num / 10) % 10))) {

        System.out.printf("\nEl número es capicúa.");

      }else {
      
      System.out.printf("\nEl número no es capicúa.");
      
      }
      
    }
    
    if (num >= 10000) {
      
      if (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))) {
        
        System.out.printf("\nEl número es capicúa.");
        
      }else {
      
      System.out.printf("\nEl número no es capicúa.");
      
      }
      
    }
    

    
  }
}
