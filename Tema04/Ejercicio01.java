/**
* Sentencia condicional ( if y switch )
*
* Programa que pida por teclado un día de la semana y que diga qué
* asignatura toca a primera hora ese día.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio01{
  public static void main(String[] args){
    
    String diaSemana;
    int mb;
    
    System.out.printf("\nIntroduce una un día de la semana: ");
    diaSemana = System.console().readLine();
    
    if (diaSemana.equals("Lunes") || diaSemana.equals("lunes")){
      
      System.out.printf("\nEl %s tienes EED a primera hora.",diaSemana);
      
    }
    
    if (diaSemana.equals("Martes") || diaSemana.equals("martes")){
      
      System.out.printf("\nEl %s tienes SINF a primera hora.",diaSemana);
      
    }
    
    if (diaSemana.equals("Miercoles") || diaSemana.equals("miercoles")){
      
      System.out.printf("\nEl %s tienes PRO a primera hora.",diaSemana);
      
    }
    
    if (diaSemana.equals("Jueves") || diaSemana.equals("jueves")){
      
      System.out.printf("\nEl %s tienes PRO a primera hora.",diaSemana);
      
    }
    
    if (diaSemana.equals("Viernes") || diaSemana.equals("viernes")){
      
      System.out.printf("\nEl %s tienes SINF a primera hora.",diaSemana);
      
    }
    
  }

}
