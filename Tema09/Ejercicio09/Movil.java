package Ejercicio09;

/**
 *
 * @author Lino
 */
public class Movil extends Terminal2 {

    private String tarifa;
    private double tarificados;

    public Movil(String n, String t) {
        super(n);
        this.tarifa = t;
        this.tarificados = 0;
    }

    public String toString() {
        return "Nº " + this.numero + " - " + this.segundos + "s de conversación" + " - " + "tarificados " + this.tarificados + "€";
    }

    public Movil llama(Movil m, int seg) {
        if (this.tarifa.equals("rata")) {
            this.segundos += seg;
            m.segundos += seg;
            this.tarificados += (seg / 60) * (6 / 100); 
        }
        if (this.tarifa.equals("mono")) {
            this.segundos += seg;
            m.segundos += seg;
            this.tarificados += (seg / 60) * (12 / 100); 
        }
        if (this.tarifa.equals("bisonte")) {
            this.segundos += seg;
            m.segundos += seg;
            this.tarificados += (seg / 60) * (30 / 100); 
        }
        return null;
    }

    
}
