/**
* Lectura de datos desde teclado
*
* Programa que calcula el área de un rectángulo.
* 
* @author Lino Haller Ríos
*/
public class Ejercicio05{
  public static void main(String[] args){
    
    double area;
    String base;
    String altura;
    
    System.out.printf("\nIntroduce la base para un rectángulo: ");
    base = System.console().readLine();
    
    System.out.printf("\nIntroduce la altura para un rectángulo: ");
    altura = System.console().readLine();
    
    area = Double.parseDouble(base) * Double.parseDouble(altura);
    
    System.out.printf("\nEl area será: %.2f ",area);
    
  }

}
