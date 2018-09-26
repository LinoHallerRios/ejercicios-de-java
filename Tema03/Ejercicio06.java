public class Ejercicio06{
  public static void main(String[] args){
    
    double area;
    String base;
    String altura;
    
    System.out.printf("\nIntroduce la base para un triángulo: ");
    base = System.console().readLine();
    
    System.out.printf("\nIntroduce la altura para un triángulo: ");
    altura = System.console().readLine();
    
    area = (Double.parseDouble(base) * Double.parseDouble(altura))/ 2;
    
    System.out.printf("\nEl area será: %.2f ",area);
    
  }

}
