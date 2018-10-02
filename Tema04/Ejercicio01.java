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
    
    diaSemana = diaSemana.toUpperCase();
    
    switch (diaSemana) {
    
      case "LUNES":
        System.out.printf("\nEl %s tienes EED a primera hora.",diaSemana);
        break;
    
      case "MARTES":
        System.out.printf("\nEl %s tienes SINF a primera hora.",diaSemana);
        break;
        
      case "MIERCOLES":
        System.out.printf("\nEl %s tienes PRO a primera hora.",diaSemana);
        break;
        
      case "MIÉRCOLES":
        System.out.printf("\nEl %s tienes PRO a primera hora.",diaSemana);
        break;
        
      case "JUEVES":
        System.out.printf("\nEl %s tienes PRO a primera hora.",diaSemana);
        break;
        
      case "VIERNES":
        System.out.printf("\nEl %s tienes SINF a primera hora.",diaSemana);
        break;
    
    }
    
    
    
  }

}
