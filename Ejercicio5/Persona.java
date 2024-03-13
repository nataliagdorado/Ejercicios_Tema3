public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private double peso;
    private double altura;

    public enum Sexo {
        HOMBRE,
        MUJER
    }

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
        this.sexo = Sexo.MUJER;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = "";
        this.sexo = sexo;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, Sexo sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = "";
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
