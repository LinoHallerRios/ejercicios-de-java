/**
 * 4. Sentencia condicional ( if y switch )
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio23 {

  public static void main(String[] args) {
    
    double baseImponible;
    double total;
    double descuento = 0;
    double iva = 0;
    String ivaOp;
    String promocion;
    
    
    
    System.out.print("Introduce la base imponible de la factura: ");
    baseImponible = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    ivaOp = System.console().readLine();
    
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    promocion = System.console().readLine();
    
  
   
    if (ivaOp.equals("general")){
    
      iva = baseImponible * 0.21;
    
    }

    if (ivaOp.equals("reducido")){
    
      iva = baseImponible * 0.10;
    
    }
    
    if (ivaOp.equals("superreducido")){
    
      iva = baseImponible * 0.4;
    
    }
    
    if (promocion.equals("nopro")){
  
      descuento = 0;
    
    }
    
    if (promocion.equals("mitad")){
  
      descuento = (baseImponible + iva)/2;
    
    }

    if (promocion.equals("meno5")){
  
      descuento = (baseImponible + iva) - 5;
    
    }
    
    if (promocion.equals("5porc")){
  
      descuento = (baseImponible + iva) * 0.5 ;
    
    }
    
    total = (baseImponible + iva) - descuento;
    
    
    System.out.printf("\nBase imponible: %.2f\n", baseImponible);
    System.out.printf("IVA : %.2f\n",iva);
    System.out.printf("Precio con IVA: %.2f\n", (baseImponible + iva));
    System.out.printf("Cód. promo(%s): -%.2f\n", promocion, descuento);
    System.out.printf("TOTAL: %.2f", total);
    


  }
}
