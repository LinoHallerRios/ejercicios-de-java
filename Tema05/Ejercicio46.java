/**
 * 5. Bucles
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio46 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura del reloj de arena: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    int base = (altura / 2) + 1; 
    int espacios = 0;
    int linea = altura;
    int mitad = (int)(altura / 2) + 1;
    
    System.out.println();
    
    if ((altura >= 3) && (altura % 2 == 1)) {

      while (altura > 0) {
        
        // Espacios
        for (int e=0; e != espacios; e++) {
        
          System.out.print(" ");
      
        }
        // Asteríscos
        for (int a = 0; a < linea; a++) {
      
          System.out.print("*");
      
        }
    
        System.out.println();
      
        altura--;
      
        if (altura < mitad) {
          linea +=2;
          espacios -= 1;
        } else {
          linea-=2;
          espacios += 1;
        }

      }
    
    } else {
    
      System.out.printf("\nLa altura introducida no es valida, debe ser un número impar >= 3");
    
    }
    
    
  }
}
