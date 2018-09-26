public class Ejercicio09{
  public static void main(String[] args){
    
    double volumen;
    String radio;
    String altura1;
    double altura;
    
    System.out.printf("\nIntroduce el radio para un cono: ");
    radio = System.console().readLine();
    
    System.out.printf("\nIntroduce la altura para un cono: ");
    altura1 = System.console().readLine();
    
    altura = Double.parseDouble(altura1);
    volumen = 0.33 * 3.1416 * Double.parseDouble(radio) * Double.parseDouble(radio) * altura;
    
    System.out.printf("\nEl volumen del cono será: %.2f ",volumen);
    
  }

}
