package Ejercicio2;

public class Main {
        public static void main(String[] args) {
            // Crear una instancia de Fecha con la fecha 20/10/2018
            Fecha fecha = new Fecha(20, 10, 2018);
            System.out.println(fecha);
    
            // Cambiar el año a 2019
            fecha.setAño(2019);
            System.out.println(fecha);
    }
}
