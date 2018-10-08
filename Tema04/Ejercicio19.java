/**
 * 4. Sentencia condicional ( if y switch )
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio19 {

  public static void main(String[] args) {
    
    int num;
    String num1;
    int cifras;
    
    System.out.printf("\nPor favor, introduzca un número de 5 cifras: ");
    num1 = System.console().readLine();
    num = Integer.parseInt(num1);
    
    cifras = 0;
    
    if (num < 0){
    
    num = num * -1;
    
      if ( num < 10 ) {
      cifras = 1;
      } 
    
      if (( num >= 10 ) && ( num < 100 )) {
      cifras = 2;
      }
    
      if (( num >= 100 ) && ( num < 1000 )) {
      cifras = 3;
      }
    
      if (( num >= 1000 ) && ( num < 10000 )) {
      cifras = 4;
      }
    
      if ( num >= 10000 ) {
      cifras = 5;
      }
    
      if ( num > 100000 ) {
      System.out.println("\nEl número introducido tiene más de 5 cifras.");
      }
      
      if (num < 100000) {
      System.out.printf("\nEl número tiene %d cifras.",cifras);
      }
    
    }else {
    
      if ( num < 10 ) {
      cifras = 1;
      }
    
      if (( num >= 10 ) && ( num < 100 )) {
      cifras = 2;
      }
    
      if (( num >= 100 ) && ( num < 1000 )) {
      cifras = 3;
      }
    
      if (( num >= 1000 ) && ( num < 10000 )) {
      cifras = 4;
      }
    
      if ( num >= 10000 && num < 100000) {
      cifras = 5;
      }
    
      if ( num > 100000 ) {
      System.out.println("\nEl número introducido tiene más de 5 cifras.");
      }
    
    
      if (num < 100000) {
      System.out.printf("\nEl número tiene %d cifras.",cifras);
      }
    
    
    }
    

    
  }
}
