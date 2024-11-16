public class ErrorThis {
    private String Nombre;

    public ErrorThis(String Nombre){
        this.Nombre = Nombre;
    }

    public static void MostrarNombre(){
        System.out.println("El Nombre es = " + this.Nombre); // esto acá es la fuente del error
    }


    public static void main(String[] args) {
        ErrorThis estudiante = new ErrorThis("Miguel");
    }

    mostrarnombre(); // error, no se puede acceder al "this."
}