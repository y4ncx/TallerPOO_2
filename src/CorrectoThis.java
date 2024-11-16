public class CorrectoThis {
    private String nombre;

    // Constructor
    public CorrectoThis(String nombre) {
        this.nombre = nombre;
    }


    public static void MostrarNombre(String nombre) {
        System.out.println("El nombre es = " + nombre);  // Se corrige el error del uso incorrecto del "This."
    }

    public static void main(String[] args) {
        CorrectoThis estudiante = new CorrectoThis("Miguel");


        MostrarNombre(estudiante.nombre); // Se imprime de forma correcta
    }
}