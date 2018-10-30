/**
 * 6.Números aleatorios
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio09 {

  public static void main(String[] args) {
    
    int cont=0;
    int num=0;
    
    while (num != 24) {
      
      num = (int)((Math.random() * 100));
    
      System.out.printf(" %d",num);
      
      cont++;
    
    }
    
    System.out.printf("\n Ha salido %d números hasta llegar al 24.",cont);
    
  }
}
