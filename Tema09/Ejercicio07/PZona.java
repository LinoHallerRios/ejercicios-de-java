package Ejercicio07;

/**
 *
 * @author Lino Haller Rios
 */
import java.util.Scanner;

public class PZona {

    public static void main(String[] args) {
        int salir = 0;
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        Scanner sc = new Scanner(System.in);

        while (salir == 0) {
            System.out.println();
            System.out.println("1. Mostrar número de entradas libres\n" + "2. Vender entradas\n" + "3. Salir");
            String opcion = sc.nextLine();
            System.out.println();
            switch (opcion) {
                case "1":
                    System.out.println();
                    System.out.println("Quedan: ");
                    System.out.println(principal.getEntradasPorVender() + " entradas de la zona principal.");
                    System.out.println(compraVenta.getEntradasPorVender() + " entradas de la zona de compra-venta.");
                    System.out.println(vip.getEntradasPorVender() + " entradas de la zona VIP.");
                    break;

                case "2":
                    System.out.println();
                    System.out.println("De que zona quieres comprar entradas: ");
                    System.out.println("1. Principal\n" + "2. Compra-venta\n" + "3. VIP");
                    String opcionZona = sc.nextLine();
                    System.out.print("Cuantas quieres comprar?: ");
                    int cantidadZona = sc.nextInt();

                    if (opcionZona.equals("1")) {
                        principal.vender(cantidadZona);
                    }

                    if (opcionZona.equals("2")) {
                        compraVenta.vender(cantidadZona);
                    }

                    if (opcionZona.equals("3")) {
                        vip.vender(cantidadZona);
                    }
                    break;

                case "3":
                    salir = 1;
                    break;
            }
        }

    }
}
