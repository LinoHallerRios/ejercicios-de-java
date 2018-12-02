/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio23 {

  public static void main(String[] args) {
    
    int[][] num = new int[6][10];
    int numMax = 0;
    int numMin = 1000;
    boolean repetido = false;
 
    for (int i = 0; i < 5; i++) {
      
      for (int j = 0; j < 9; j++) {
        
        if (i == 0 && j == 0) {
        
          num[i][j] = (int)(Math.random() * 1001);
        
        }
        
        if (j == 0 && i != 0) {
          
          num[i][j] = (int)(Math.random() * 1001);
        
          while (repetido = false) { 
            
            if (num[i][j] != num[i-1][9]) {
            
              repetido = true;
            
            }
          }
        
        } else {
          
            num[i][j] = (int)(Math.random() * 1001);
            
           while (repetido = false) {
            
            if (num[i][j] != num[i][j-1]) {
            
              repetido = true;
            
            }
          }
        
        }
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

