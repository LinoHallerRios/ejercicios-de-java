/**
* Sentencia condicional ( if y switch )
*
* Programa en que dado un número del 1 a 7 escriba el 
* correspondiente nombre del día de la semana.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio03{
  public static void main(String[] args){
    
    String numero;
    int diaNumero;
    
    System.out.printf("\nIntroduce un número del 1 al 7: ");
    numero = System.console().readLine();
    
    diaNumero = Integer.parseInt(numero);
    
    if ((diaNumero == 1)){
      
      System.out.printf("\nEl 1 corresponde al Lunes.");
      
    }
    
    if ((diaNumero == 2)){
      
      System.out.printf("\nEl 2 corresponde al Martes.");
      
    }
    
    if ((diaNumero == 3)){
      
      System.out.printf("\n¡El 3 corresponde al Miercoles.");
      
    }
    
    if ((diaNumero == 4)){
      
      System.out.printf("\nEl 4 corresponde al Jueves.");
      
    }
    
    if ((diaNumero == 5)){
      
      System.out.printf("\nEl 5 corresponde al Viernes.");
      
    }
    
    if ((diaNumero == 6)){
      
      System.out.printf("\nEl 6 corresponde al Sábado.");
      
    }
    
    if ((diaNumero == 7)){
      
      System.out.printf("\nEl 7 corresponde al Domingo.");
      
    }
    
    if ((diaNumero < 1) || (diaNumero > 7)){
      
      System.out.printf("\nEl número introducido no es correcto.");
      
    }
    
  }

}
