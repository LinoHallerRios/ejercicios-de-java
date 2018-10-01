/**
* Sentencia condicional ( if y switch )
*
* Programa que pida una hora por teclado y que muestre luego
* buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
* tramos de 6 a 12, de 13 a 20 y de 21 a 5.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio02{
  public static void main(String[] args){
    
    String hora;
    int horaNumero;
    
    System.out.printf("\nIntroduce una hora sin minutos ni segundos: ");
    hora = System.console().readLine();
    
    horaNumero = Integer.parseInt(hora);
    
    if ((horaNumero >= 6) && (horaNumero <= 12)){
      
      System.out.printf("\n¡Buenos Días!");
      
    }
    
    if ((horaNumero >= 13) && (horaNumero <= 20)){
      
      System.out.printf("\n¡Buenas Tardes!");
      
    }
    
    if ((horaNumero <= 5)){
      
      System.out.printf("\n¡Buenas Noches!");
      
    }
    
    if ((horaNumero >= 21 ) && (horaNumero <= 24)) {
      
      System.out.printf("\n¡Buenas Noches!");
      
    }
    
    if ((horaNumero > 24)){
      
      System.out.printf("\nEsa hora no existe.");
      
    }
    
    
  }

}
