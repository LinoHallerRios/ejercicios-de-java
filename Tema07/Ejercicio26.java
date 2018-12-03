/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio26 {

  public static void main(String[] args) {
    
    String[] num = {"0","8","7","6","5","4","3","2","1"};
    String[] letra = {"X","A","B","C","D","E","F","G","H"};
    String[][] tablero = new String[10][10];
    String posicionActual;
    int contJ = 1;
    int contJd = 1;
    
    for (int i = 0; i < 10;i++) {
    
      for (int j = 0; j<10;j++) {
    
        tablero[i][j] = "X";
    
      }
    }
    
    for (int i = 1; i < 9;i++) {
    
      for (int j = 1;j < 9;j++) {
    
        tablero[i][j] = letra[j] + num[i];
    
      }
    }
    
    System.out.printf("\n");
    
    for (int i = 1; i < 9;i++) {
    
      for (int j = 1; j < 9;j++) {
    
        System.out.printf("%5s",tablero[i][j]);
    
      }
      
      System.out.printf("\n");
    }
    
    System.out.printf("\n");
    System.out.printf("\n  Introduzca la posición del alfil: ");
    String  posicion = System.console().readLine();
    
    System.out.printf("\n  El álfil puede moverse a las siguientes posiciones:\n\n ");
    
    for (int i = 1; i < 9;i++) {
    
      for (int j = 1;j<9;j++) {
    
        if (tablero[i][j].equals (posicion) ) {
        
          for (int n = i + 1; n < 9; n++) {
          
            if (tablero[n][j+contJ].equals ("X")) {
              
            } else {
              System.out.printf(" %s",tablero[n][j+contJ]);
              contJ++;
              
            }
            
            if (tablero[n][j-contJd].equals ("X")) {
            
            } else {
              System.out.printf(" %s",tablero[n][j-contJd]);
              contJd++;
              
            }
 
          }
          contJ = 1;
          contJd = 1;
          
          for (int n = i - 1; n > -1; n--) {
               
              if (tablero[n][j+contJ].equals ("X")) {
              
            } else {
              System.out.printf(" %s",tablero[n][j+contJ]);
              contJ++;
              
            }
            
            if (tablero[n][j-contJd].equals ("X")) {
            
            } else {
              System.out.printf(" %s",tablero[n][j-contJd]);
              contJd++;
              
            }
          }
          
        } 
    
      }
    }

  }
}
