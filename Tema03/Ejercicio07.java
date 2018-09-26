public class Ejercicio07 {
  public static void main(String[] args){
    
    String baseImponible;
    double iva;
    double total;
    System.out.printf("\n Introduce el valor de la factura : ");
    baseImponible = System.console().readLine();
    
    
    iva= Double.parseDouble(baseImponible) * 0.21;
    total= Double.parseDouble(baseImponible) + iva;
   
    
    
    System.out.printf("\nLa factura sin iva asciende a: %s ",baseImponible);
    System.out.printf("\nEl IVA será: %.2f euros",iva);
    System.out.printf("\nY el total es : %.2f euros",total);
    
    

  }

}
