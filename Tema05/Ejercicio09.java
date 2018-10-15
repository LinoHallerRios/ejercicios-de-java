/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio09 {

  public static void main(String[] args) {
    
    int num;
    int n=1;
    String numero;
  
    System.out.printf("\n Introduzca un número: ");
    numero = System.console().readLine();
    num = Integer.parseInt(numero);
      
    while (num > 10) {
      num = num / 10;
      n++;
    }
      
    System.out.printf("\nel número tiene %d cifras",n);
  
  
  }
}
