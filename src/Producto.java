import java.util.Scanner;

public class Producto {
    private String Nombre;
    private double Precio;

    public Producto(String Nombre, Double Precio){
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public void MostrarProducto(){
        System.out.println("El Nombre del Producto es = " + Nombre);
        System.out.println("El Precio del Producto es = " + Precio);
    }


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Nombre del producto= ");
        String Nombre = scanner.nextLine();

        System.out.println("Ingrese el Precio del Producto = ");
        Double Precio = scanner.nextDouble();


        Producto producto = new Producto(Nombre, Precio);

        producto.MostrarProducto();

        scanner.close();






    }

}
