public class Ejercicio10{
  public static void main(String[] args){
    
    String mb;
    int kb;
    
    System.out.printf("\nIntroduce una cantidad de Mb: ");
    mb = System.console().readLine();
    
    kb = Integer.parseInt(mb) * 1024;
    
    System.out.printf("\nLos %d Mb serán",Integer.parseInt(mb));
    System.out.printf(" %d Kb",kb);
    
    
    
  }

}
