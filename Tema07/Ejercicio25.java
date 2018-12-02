/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio25 {

  public static void main(String[] args) {
    
    String[] num = {"1","2","3","4","5","6","7","8","9"};
    String[] letra = {"A","B","C","D","E","F","G","H","I"};
    String[][] tablero = new String[9][9];
    String posicionActual;
    int cont = 1;
    
    for (int i = 0; i < 8;i++) {
    
      for (int j = 0;j<8;j++) {
    
        tablero[i][j] = letra[j] + num[i];
    
      }
    }
    
    System.out.printf("\n");
    
    for (int i = 7;i > -1;i--) {
    
      for (int j = 0;j<8;j++) {
    
        System.out.printf(" %s",tablero[i][j]);
    
      }
      
      System.out.printf("\n");
    
    }
    
    System.out.printf("\n");
    System.out.printf("\nIntroduzca la posición del alfil: ");
    String  posicion = System.console().readLine();
    
    System.out.printf("\nEl álfil puede moverse a las siguientes posiciones: ");
    
    for (int i = 0; i < 8;i++) {
    
      for (int j = 0;j<8;j++) {
    
        if (tablero[i][j].equals (posicion) ) {
        
          for (int n = i + 1; n < 8; n++) {

              System.out.printf("\n%s",tablero[n][j+cont]);
              System.out.printf("\n%s",tablero[n][j-cont]);
            
            cont++;
          }
          
          System.out.printf("\n");
          cont = 1;
          
          for (int n = i - 1; n > -1; n--) {
            
              System.out.printf("\n%s",tablero[n][j+cont]);

              System.out.printf("\n%s",tablero[n][j-cont]);
            
            cont++;
          }
          
        } 
    
      }
    }

  }
}
