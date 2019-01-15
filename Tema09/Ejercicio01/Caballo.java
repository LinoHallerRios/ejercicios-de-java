
/**
 *
 * @author Lino Haller Ríos
 */
public class Caballo {

    private String nombre, color, raza;
    private int edad;

    Caballo(String n, String c, String r, int e) {
        this.nombre = n;
        this.color = c;
        this.edad = e;
        this.raza = r;
        
    }

    public String getNombre() {
        return this.nombre;
    }

    public void cabalgar() {
        System.out.println("Tocoto tocoto");
    }

    public void relinchar() {
        System.out.println("Hiiiiiiiiiiii");
    }

    public void bufar() {
        System.out.println("PRRRRRR");

    }
}
