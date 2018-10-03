/**
 * 4. Sentencia condicional ( if y switch )
 *
 * Horóscopo
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    
    String dia;
    String mes;
    int dia1;
    
    System.out.printf("\nEste programa es un Horóscopo. ");
    System.out.printf("\nPor favor, introduzca su día de nacimiento: ");
    dia = System.console().readLine();
    
    System.out.printf("\nAhora el mes de nacimiento: ");
    mes = System.console().readLine();
    
    mes = mes.toUpperCase();
    dia1 = Integer.parseInt(dia);
    
    if (mes.equals("ENERO") ){
      
        
        if( dia1 <= 19){
        
          System.out.printf("\nEres Capricornio. ");
        
        }
        
        if( dia1 >= 20){
        
          System.out.printf("\nEres Acuario. ");
        
        }
    }
    
    
    
    if (mes.equals("FEBRERO") ){
      
        
        if( dia1 <= 18){
        
          System.out.printf("\nEres Acuario.");
        
        }
        
        if( dia1 >= 19){
        
          System.out.printf("\nEres Piscis.");
        
        }
    }
    
    if (mes.equals("MARZO") ){
      
        
        if( dia1 <= 20){
        
          System.out.printf("\nEres Piscis.");
        
        }
        
        if( dia1 >= 21){
        
          System.out.printf("\nEres Aries.");
        
        }
    }
    
    if (mes.equals("Abril") ){
      
        
        if( dia1 <= 19){
        
          System.out.printf("\nEres Aries.");
        
        }
        
        if( dia1 >= 20){
        
          System.out.printf("\nEres Tauro.");
        
        }
    }
    
    if (mes.equals("Mayo") ){
      
        
        if( dia1 <= 20){
        
          System.out.printf("\nEres Tauro.");
        
        }
        
        if( dia1 >= 21){
        
          System.out.printf("\nEres Géminis.");
        
        }
    }
    
    if (mes.equals("JUNIO") ){
      
        
        if( dia1 <= 20){
        
          System.out.printf("\nEres Géminis.");
        
        }
        
        if( dia1 >= 21){
        
          System.out.printf("\nEres Cancer.");
        
        }
    }
    
    if (mes.equals("JULIO") ){
      
        
        if( dia1 <= 22){
        
          System.out.printf("\nEres Cancer.");
        
        }
        
        if( dia1 >= 23){
        
          System.out.printf("\nEres Leo.");
        
        }
    }
    
    if (mes.equals("AGOSTO") ){
      
        
        if( dia1 <= 22){
        
          System.out.printf("\nEres Leo.");
        
        }
        
        if( dia1 >= 23){
        
          System.out.printf("\nEres Virgo.");
        
        }
    }
    
    if (mes.equals("SEPTIEMBRE") ){
      
        
        if( dia1 <= 22){
        
          System.out.printf("\nEres Virgo.");
        
        }
        
        if( dia1 >= 23){
        
          System.out.printf("\nEres Libra.");
        
        }
    }
    
    if (mes.equals("OCTUBRE") ){
      
        
        if( dia1 <= 22){
        
          System.out.printf("\nEres Libra.");
        
        }
        
        if( dia1 >= 23){
        
          System.out.printf("\nEres Escorpio.");
        
        }
    }
    
    if (mes.equals("NOVIEMBRE") ){
      
        
        if( dia1 <= 21){
        
          System.out.printf("\nEres Escorpio.");
        
        }
        
        if( dia1 >= 22){
        
          System.out.printf("\nEres Sagitario.");
        
        }
    }
    
    if (mes.equals("DICIEMBRE") ){
      
        if( dia1 >= 21){
        
          System.out.printf("\nEres Sagitario.");
        
        }
        
        if( dia1 >= 22){
        
          System.out.printf("\nEres Capricornio. ");
        
        }
    }
    
    

  }
}
