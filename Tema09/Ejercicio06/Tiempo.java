package ejercicio06;

/**
 *
 * @author Lino Haller Rios
 */
public class Tiempo {

    private int horas, minutos, segundos;

    public Tiempo(int h, int m, int s) {
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }

    public String toString() {
        return this.horas + "h " + this.minutos + "m " + this.segundos + "s.";
    }

    public Tiempo suma(int horas, int minutos, int segundos) {
        int totalSeg = 0;
        int totalMin = 0;
        if ((this.segundos + segundos) == 60) {
            minutos++;
        }
        if ((this.segundos + segundos) < 60) {
            totalSeg = this.segundos + segundos;
        }
        if ((this.segundos + segundos) > 60) {
            int cont = this.segundos + segundos;
            totalSeg = cont - 60;
            minutos++;
        }

        if ((this.minutos + minutos) == 60) {
            horas++;
        }
        if ((this.minutos + minutos) < 60) {
            totalMin = this.minutos + minutos;
        }
        if ((this.minutos + minutos) > 60) {
            int cont = this.minutos + minutos;
            totalMin = cont - 60;
            horas++;
        }
        
        
        return new Tiempo(this.horas + horas, totalMin, totalSeg);
    }

}
