public class Ejercicio03{
  public static void main(String[] args){
    
    String pesetas;
    Double euro;
    
    System.out.printf("\nIntroduce una cantidad de pesetas: ");
    pesetas = System.console().readLine();
    
    euro = Integer.parseInt(pesetas) / 166.386;
    
    System.out.printf("\nLos %d euros serán",Integer.parseInt(pesetas));
    System.out.printf(" %.3f euro",euro);
    
    
    
  }

}
