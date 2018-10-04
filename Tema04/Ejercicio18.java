/**
 * 4. Sentencia condicional ( if y switch )
 *
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    
    
    String numero;
    int primeraCifra;
    int num;
    
    System.out.printf("\nPor favor, introduzca un número entero de máximo 5 cifras: ");
    numero = System.console().readLine();
    
    num = Integer.parseInt(numero);
    
    if (num < 10) {
      
      primeraCifra = num;
      System.out.printf("\nLa primera cifra es %d ",primeraCifra);

    }
  
    if ((num >= 10) && (num < 100)) {
      
      primeraCifra = num / 10;
      System.out.printf("\nLa primera cifra es %d ",primeraCifra);

    }
    
    if ((num >= 100) && (num < 1000)) {
      
      primeraCifra = num / 100;
      System.out.printf("\nLa primera cifra es %d ",primeraCifra);
      
    }
    
    if ((num >= 1000) && (num < 10000)) {
      
      primeraCifra = num / 1000;
      System.out.printf("\nLa primera cifra es %d ",primeraCifra);

    }
  
    if (num > 10000) {
      
      primeraCifra = num / 10000;
      System.out.printf("\nLa primera cifra es %d ",primeraCifra);
      
    }
  
  }
}
