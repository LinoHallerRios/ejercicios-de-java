/**
 * 4. Sentencia condicional ( if y switch )
 *
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio17 {

  public static void main(String[] args) {
    
    
    String numero;
    int n;
  

    
    
    System.out.printf("\n\nIntroduce un número entero: ");
    numero = System.console().readLine();
    
    n = Integer.parseInt(numero) % 10;
    
    
    System.out.printf("\n\nLa última cifra del número es: %d",n);
    


   
  
  }
}
