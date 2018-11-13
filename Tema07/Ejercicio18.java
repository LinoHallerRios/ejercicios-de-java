/**
 * 7.Arrays
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    
    int[][] num = new int[3][6];
    
      num[0][1] = 30;
      num[0][2] = 2;
      num[0][5] = 5;
      num[1][0] = 75;
      num[1][4] = 0;
      num[2][2] = -2;
      num[2][3] = 9;
      num[2][5] = 11;
      
      System.out.printf("\n");
      
      for (int j = 0; j < 6; j++) {
      
        System.out.printf("%5s",num[0][j]);
        
      }
      
      System.out.printf("\n");

       for (int j = 0; j < 6; j++) {
      
        System.out.printf("%5s",num[1][j]);
        
      }
      
      System.out.printf("\n");
      
      for (int j = 0; j < 6; j++) {
      
        System.out.printf("%5s",num[2][j]);
        
      } 
      
      System.out.printf("\n");
  
  }
}
