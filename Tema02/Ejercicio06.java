public class Ejercicio06 {
  public static void main(String[] args){
    
    double baseImponible;
    double iva;
    double total;
  
    
    baseImponible= 79;
    iva= baseImponible * 0.21;
    total= baseImponible + iva;
   
    
    System.out.printf("\n He comprado algo ");
    System.out.printf("por %2.0f euros sin iva",baseImponible);
    System.out.printf("\n El IVA será: %.2f euros",iva);
    System.out.printf("\n Y el total es : %.2f euros",total);
    
    

  }

}
