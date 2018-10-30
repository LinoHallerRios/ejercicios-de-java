/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio42 {

  public static void main(String[] args) {
  
    
    System.out.printf("\nPor favor, introduzca la altura (como mínimo 2): ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int espacios;
    int base = altura;
    
    System.out.println("");
    
    
    for (int h=0; h < altura;h++) {

      for (int a=base; a != 0; a--) {
        
        System.out.print("*");
        base--;
    
      }
      
      

    }

    

  
  }
}
