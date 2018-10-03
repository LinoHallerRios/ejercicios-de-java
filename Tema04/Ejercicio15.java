/**
* Sentencia condicional ( if y switch )
*
* Pirámides.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio15{
  public static void main(String[] args){
    
    String caracter;
    String direccion;
    
    System.out.printf("\nEste programa hace una pirámide");
    System.out.printf(" según las opciones elegidas.");
    System.out.printf("\nPorfavor, introduzca un carácter: ");
    caracter = System.console().readLine();
    
    System.out.printf("\n¿Hacia donde apuntará la piramide?");
    System.out.printf(" (Introduzca el número).");
    System.out.printf("\n\n1) Arriba");
    System.out.printf("\n2) Abajo");
    System.out.printf("\n3) Derecha");
    System.out.printf("\n4) Izquierda\n\n");
    direccion = System.console().readLine();
    
    switch (direccion) {
      
      case "1":
        
        System.out.printf("\n");
        System.out.printf("\n        %s",caracter);
        System.out.printf("\n       %s %s",caracter,caracter);
        System.out.printf("\n      %s %s %s",caracter,caracter,caracter);
        System.out.printf("\n     %s %s %s %s",caracter,caracter,caracter,caracter);
        System.out.printf("\n    %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n   %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n  %s %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n %s %s %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n%s %s %s %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
        
        break;
      
      case "2":
        
        System.out.printf("\n %s %s %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n  %s %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n   %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n    %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n     %s %s %s %s",caracter,caracter,caracter,caracter);
        System.out.printf("\n      %s %s %s",caracter,caracter,caracter);
        System.out.printf("\n       %s %s",caracter,caracter);
        System.out.printf("\n        %s",caracter);
        
        break;
      
      case "3":
      
        System.out.printf("\n   %s",caracter);
        System.out.printf("\n   %s %s",caracter,caracter);
        System.out.printf("\n   %s %s %s",caracter,caracter,caracter);
        System.out.printf("\n   %s %s %s %s",caracter,caracter,caracter,caracter);
        System.out.printf("\n   %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n   %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n   %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n   %s %s %s %s",caracter,caracter,caracter,caracter);
        System.out.printf("\n   %s %s %s",caracter,caracter,caracter);
        System.out.printf("\n   %s %s",caracter,caracter);
        System.out.printf("\n   %s",caracter);
        
        break;
        
      case "4":
      
        System.out.printf("\n               %s",caracter);
        System.out.printf("\n             %s %s",caracter,caracter);
        System.out.printf("\n           %s %s %s",caracter,caracter,caracter);
        System.out.printf("\n         %s %s %s %s",caracter,caracter,caracter,caracter);
        System.out.printf("\n       %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n     %s %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n       %s %s %s %s %s",caracter,caracter,caracter,caracter,caracter);
        System.out.printf("\n         %s %s %s %s",caracter,caracter,caracter,caracter);
        System.out.printf("\n           %s %s %s",caracter,caracter,caracter);
        System.out.printf("\n             %s %s",caracter,caracter);
        System.out.printf("\n               %s",caracter);
        
        break;
    
    
    
    }
    

  }

}
