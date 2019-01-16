package Ejercicio05;

/**
 *
 * @author Lino Haller Ríos
 */
public class Pizza {

    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    private final String tipo;
    private final String size;
    private String estado;

    public Pizza(String t, String s) {
        this.tipo = t;
        this.size = s;
        this.estado = "pedido";
        Pizza.totalPedidas++;
    }

    void setEstado(String e) {
        this.estado = e;
    }

    public String toString() {
        return "pizza " + this.tipo + " " + this.size + ", " + this.estado;
    }

    String getTipo() {
        return this.tipo;
    }

    String getSize() {
        return this.size;
    }

    String getEstado() {
        return this.estado;
    }

    public Pizza sirve() {
        if (this.estado.equals("servido")) {
            System.out.println("esa pizza ya se ha servido");
        } else {
            this.setEstado("servido");
            Pizza.totalServidas++;
        }
        return null;
    }

    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

}
