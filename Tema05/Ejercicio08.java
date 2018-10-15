/**
 * 5. Bucles
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio08 {

  public static void main(String[] args) {
    
    int num;
    int aux=0;
    int multiplicacion;
    String numero;
  
   
      
      System.out.printf("\n Introduzca un número: ");
      numero = System.console().readLine();
      num = Integer.parseInt(numero);
      
      while (aux <= 10) {
      
        multiplicacion = num * aux;
        System.out.printf("\n %d x %d = %d",num,aux,multiplicacion);
        aux++;
      
      }
      


  }
}
