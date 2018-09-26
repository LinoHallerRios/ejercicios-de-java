public class Ejercicio12{
  public static void main(String[] args){
    
    String notaDeseada;
    String examen1;
    double examen2;

    
    System.out.printf("\nIntroduce la nota del primer examen: ");
    examen1 = System.console().readLine();
    
    System.out.printf("\n¿Qué nota quieres sacar en el trimestre? ");
    notaDeseada = System.console().readLine();
    
    examen2 = ((Double.parseDouble(examen1) * 0.4 ) - Double.parseDouble(notaDeseada)) / -0.6;
    
    System.out.printf("\nPara tener un %.2f",Double.parseDouble(notaDeseada));
    System.out.printf(" en el primer trimestre necesitas sacar un");
    System.out.printf(" %.2f en el segundo examen",examen2);
    
    
  }

}
