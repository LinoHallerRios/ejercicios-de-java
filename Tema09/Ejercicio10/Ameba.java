package ejercicio10;

/**
 *
 * @author Lino Haller Rios
 */
public class Ameba {

    private int peso;

    public Ameba() {
        this.peso = 3;
    }

    public String toString() {
        return "Soy una ameba y peso " + this.peso + " microgramos";
    }

    public Ameba come(int m) {
        this.peso += m - 1;
        return null;
    }

    public void come(Ameba m) {
        this.peso += m.peso - 1;
        m.peso = 0;
    }

}
