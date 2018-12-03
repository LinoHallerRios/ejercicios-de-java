/**
 * 6.Números aleatorios
 * 
 * @author Lino Haller Ríos
 */
public class Ejercicio16 {

  public static void main(String[] args) {

    System.out.printf("\n");
    String dimante;
    String limon;
    String campana;
    String corazon;
    String herradura;
    int num1;
    int num2;
    int num3;
    
    num1 = (int)Math.floor(Math.random()*(5)+(1));
    
    switch (num1) {
    
      case 1 :
        System.out.printf("Diamante");
        break;
      
      case 2 :
        System.out.printf("Limón");
        break;
      
      case 3 :
        System.out.printf("Campana");
        break;
      
      case 4 :
        System.out.printf("Corazón");
        break;
      
      case 5 :
        System.out.printf("Herradura");
        break;
      
    }
    
    num2 = (int)Math.floor(Math.random()*(5)+(1));
    
    switch (num2) {
    
      case 1 :
        System.out.printf(" Diamante");
        break;
      
      case 2 :
        System.out.printf(" Limón");
        break;
      
      case 3 :
        System.out.printf(" Campana");
        break;
      
      case 4 :
        System.out.printf(" Corazón");
        break;
      
      case 5 :
        System.out.printf(" Herradura");
        break;
      
    }
    
    num3 = (int)Math.floor(Math.random()*(5)+(1));
    
    switch (num3) {
    
      case 1 :
        System.out.printf(" Diamante");
        break;
      
      case 2 :
        System.out.printf(" Limón");
        break;
      
      case 3 :
        System.out.printf(" Campana");
        break;
      
      case 4 :
        System.out.printf(" Corazón");
        break;
      
      case 5 :
        System.out.printf(" Herradura");
        break;
      
    }
    
    if (num1 == num2 && num3 == num1) {
    
      System.out.printf("\nEnhorabuena, ha ganado 10 monedas");
    
    }
    
    if ((num1 == num2 || num1 == num3 || num2 == num3) && (num3 != num2 || num1 != num2)) {
    
      System.out.printf("\nBien, ha recuperado su moneda");
    
    }
    
    if (num1 != num2 && num3 != num1 && num2 != num3) {
    
      System.out.printf("\nLo siento, ha perdido");
    
    }
    
  }
}
