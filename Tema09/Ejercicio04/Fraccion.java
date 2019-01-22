package ejercicio04;

/**
 *
 * @author Lino Haller Ríos
 */
public class Fraccion {

    private int numerador, denominador;

    public Fraccion(int n, int d) {
        this.denominador = d;
        this.numerador = n;
    }

    public Fraccion invierte() {
        return new Fraccion(this.denominador, this.numerador);
    }

    public Fraccion multiplica(int n) {
        return new Fraccion(this.numerador * n, this.denominador);
    }

    public Fraccion divide(int n) {
        return new Fraccion(this.numerador, this.denominador * n);
    }

    public Fraccion simplifica() {
        int a, b;
        if (this.numerador > this.denominador) {
            a = this.numerador;
            b = this.denominador;
        } else {
            b = this.numerador;
            a = this.denominador;
        }

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return new Fraccion(this.numerador / a, this.denominador / a);
    }

    int getNumerador() {
        return this.numerador;
    }

    int getDenominador() {
        return this.denominador;
    }

}
