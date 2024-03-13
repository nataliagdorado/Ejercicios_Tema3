package Ejercicio3;

class NumeroRacional {
    private int numerador;
    private int denominador;

    public NumeroRacional() {
        numerador = 0;
        denominador = 1;
    }

    public NumeroRacional(NumeroRacional otro) {
        numerador = otro.numerador;
        denominador = otro.denominador;
    }

    public NumeroRacional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void sumar(NumeroRacional otro) {
        numerador = numerador * otro.denominador + otro.numerador * denominador;
        denominador = denominador * otro.denominador;
        simplificar();
    }

    public void multiplicar(NumeroRacional otro) {
        numerador = numerador * otro.numerador;
        denominador = denominador * otro.denominador;
        simplificar();
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador = numerador / gcd;
        denominador = denominador / gcd;
    }
}
