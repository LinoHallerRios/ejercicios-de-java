/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio35 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura del reloj de arena: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int base = (altura / 2) + 1; 
    int espacios = 0;
    int espaciosCentro = altura-2;
    int mitad = (int)(altura / 2) + 1;
    
    System.out.println();
    
    if ((altura >= 3) && (altura % 2 == 1)) {

      while (altura > 0) {
        
        // Espacios
        for (int e=0; e != espacios; e++) {

          System.out.print(" ");

        }
        
         System.out.print("*");
        
        for (int a = 0; a < espaciosCentro; a++) {
      
          System.out.print(" ");
      
        }
        
        if (altura == mitad) {
        
        } else {
        
          System.out.print("*");
        }
       
        System.out.println();
      
        altura--;
      
        if (altura < mitad) {
          espaciosCentro +=2;
          espacios -= 1;
          
        } else {
          espaciosCentro-=2;
          espacios += 1;
          
        }

      }
    
    } else {
    
      System.out.printf("\nLa altura introducida no es valida, debe ser un número impar >= 3");
    
    }
    
  }
}
