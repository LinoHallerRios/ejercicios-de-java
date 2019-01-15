package Ejercicio03;

/**
 *
 * @author Lino
 */
public class Canario extends Ave {

    private String nombre, color;
    private int edad;

    public Canario(String s, String n) {
        super(s);
        this.nombre = n;
    }

    void setColor(String c) {
        this.color = c;
    }

    void setEdad(int e) {
        this.edad = e;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void cantar() {
        System.out.println("PIO PIO");
    }

    public void batirAlas() {
        System.out.println("WUF WUF");
    }

}
