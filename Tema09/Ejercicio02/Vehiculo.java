package Ejercicio02;

/**
 *
 * @author Lino
 */
public abstract class Vehiculo {

    private static int vehiculosCreados;
    private static int kilometrosTotales;

    private int kilometrosRecorridos;

    public Vehiculo() {
        this.kilometrosRecorridos = 0;
    }

    public int getKilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }

    public void conducir(int km) {
        this.kilometrosRecorridos += km;
        Vehiculo.kilometrosTotales += km;
    }

}
