/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio21 {

  public static void main(String[] args) 
    throws InterruptedException {
    
    int[][] num = new int[5][6];
    
      // Introduzco los datos
    
      for (int i = 0; i < 4; i++) {
      
        for (int j = 0; j < 5; j++) {
          
          num[i][j] = (int)(Math.random() * 100 + 100);
        
        }
      }
      
      // La suma para las filas
      
      for (int i = 0; i < 4; i++) {
        
        for (int j = 0; j < 5; j++) {
      
          num[i][5] += num[i][j];
        
        }

      }
      
      // La suma para las columnas
      
      for (int j = 0; j < 5; j++) {
          
          num[4][j] = 0;
          
        for (int i = 0; i < 4; i++) {
      
          num[4][j] += num[i][j] ;
        
        }

      }
      
      num[4][5] = num[0][5] + num[1][5] + num[2][5] + num[3][5];
      
      System.out.printf("\n");
      
      // Salida por pantalla
      
      for (int i = 0; i < 5; i++) {
      
        for (int j = 0; j < 6; j++) {
          
          if (i == 4) {
            Thread.sleep(500);
            System.out.printf(" %10s",num[i][j]);
          
          } else {
          
            System.out.printf(" %10s",num[i][j]);
          
          }
        
        }
        
        System.out.printf("\n");
        
      }
      

  }
}
