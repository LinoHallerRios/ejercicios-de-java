/**
* Variables
* 
* Programa en el que se declaran las variables enteras x e y. 
* Se muestra por pantalla el valor de cada variable, la suma, la resta, 
* la división y la multiplicación.
*
* @author Lino Haller Ríos
*/
public class Ejercicio01 {
  public static void main(String[] args){
    int x;
    int y;
    int suma;
    int resta;
    double division;
    int multiplicacion;
    
    y=999;
    x=144;
    
    suma= x + y;
    resta= x - y;
    multiplicacion= x * y;
    division= (double)x / (double)y;
    
    System.out.printf("\n El valor X es %d y el valor de y es %d",x,y);
    System.out.printf("\n La suma de x e y es %d ",suma);
    System.out.printf("\n La resta de x e y es %d ",resta);
    System.out.printf("\n La division de x e y es %3f ",division);
    System.out.printf("\n La multiplicacion de x e y es %d ",multiplicacion);

  }

}
