/**
 * 4. Sentencia condicional ( if y switch )
 *
 * @author Lino Haller Ríos
 */
public class Ejercicio24 {

  public static void main(String[] args) {
    
    String cargoEmpleado;
    String diasViaje;
    String estadoCivil;
    double sueldo = 0;
    double cargoEmpleado1;
    double diasViaje1;
    double estadoCivil1;
    double dietas;
    double sueldoTotal;
    double iprf = 0;
    double iprfTotal;
    
    System.out.printf("\n1 - Programador junior");
    System.out.printf("\n2 - Prog. senior");
    System.out.printf("\n3 - Jefe de proyecto");
    System.out.printf("\nIntroduzca el cargo del empleado (1 - 3): ");
    cargoEmpleado = System.console().readLine();
    
    
    System.out.printf("\n¿Cuántos días ha estado de viaje visitando clientes? ");
    diasViaje = System.console().readLine();
    diasViaje1 = Integer.parseInt(diasViaje);

    System.out.printf("\nIntroduzca su estado civil (1 - Soltero, 2 - Casado): ");
    estadoCivil = System.console().readLine();
    
    dietas = diasViaje1 * 30;
    
    
    
    switch ("cargoEmpleado") {
    
      case "1":
        
        sueldo = 950;
        break;
    
      case "2":
        
        sueldo = 1200;
        break;
        
      case "3":
        
        sueldo = 1600;
        break;
    
    }
    
    if (estadoCivil.equals("1")) {
    
      iprf = 0.25;
    
    }
    
     if (estadoCivil.equals("2")) {
    
      iprf = 0.2;
    
    }
    
    sueldoTotal = sueldo + dietas;
    
    iprfTotal = sueldo * iprf;
    
    double sueldoNeto = sueldoTotal - iprfTotal;
    
    System.out.printf("\nSueldo base: %.2f",sueldo);
    System.out.printf("\nDietas (%s viajes): %2.f",diasViaje,dietas);
    System.out.printf("\n--------------------------");
    System.out.printf("\nSueldo bruto: %.2f",sueldo);
    System.out.printf("\nRetención IPRF: %.2f",iprfTotal);
    System.out.printf("\n--------------------------");
    System.out.printf("\nSueldo neto: %2.f",sueldoNeto);


  }
}
