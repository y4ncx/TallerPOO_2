public class Estudiante {
    private String nombre;
    private int edad;

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor por defecto que llama al constructor con dos parametros
    public Estudiante() {
        this("Nombre por defecto", 0);
    }

    // Metodo para imprimir
    public void imprimirDetalles() {
        System.out.println("Nombre del Estudiante: " + nombre);
        System.out.println("Edad del Estudiante: " + edad);
    }

    public static void main(String[] args) {
        // Para crear un estudiante usando el constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        estudiante1.imprimirDetalles();

        // Para crear un estudiante usando el constructor con parámetros
        Estudiante estudiante2 = new Estudiante("Rabi", 18);
        estudiante2.imprimirDetalles();
    }
}
