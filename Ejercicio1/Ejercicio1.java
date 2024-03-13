package Ejercicio1;

class Punto3D {
    private int x;
    private int y;
    private int z;

    public Punto3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Punto3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}


