/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio22 {

  public static void main(String[] args) {
    
    int[][] num = new int[6][10];
    int numMax = 0;
    int numMin = 1000;
 
    for (int i = 0; i < 5; i++) {
      
      for (int j = 0; j < 9; j++) {
          
        num[i][j] = (int)(Math.random() * 1001);
        
      }
    }
  
    for (int i = 0; i < 5; i++) {
      
      for (int j = 0; j < 9; j++) {
          
        if (num[i][j] < numMin) {
        
          numMin = num[i][j];
        
        }
        
        if (num[i][j] > numMax) {
        
          numMax = num[i][j];
        
        }
        
      }
    }
    
    for (int i = 0; i < 5; i++) {
      
      for (int j = 0; j < 9; j++) {
          
        if (num[i][j] == numMin) {
        
          System.out.printf("\nEl mínimo es %s y está en la posición [%d][%d]",num[i][j],i,j);
        
        }
        
        if (num[i][j] == numMax) {
        
          System.out.printf("\nEl máximo es %s y está en la posición [%d][%d]",num[i][j],i,j);
        
        }
  
      }
    }
    


  }
}

