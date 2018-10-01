/**
* Lectura de datos desde teclado
*
* Conversor de Kb a Mb.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio11{
  public static void main(String[] args){
    
    String kb;
    int mb;
    
    System.out.printf("\nIntroduce una cantidad de Kb: ");
    kb = System.console().readLine();
    
    mb = Integer.parseInt(kb) / 1024;
    
    System.out.printf("\nLos %d Kb serán",Integer.parseInt(kb));
    System.out.printf(" %d Mb",mb);
    
    
    
  }

}
