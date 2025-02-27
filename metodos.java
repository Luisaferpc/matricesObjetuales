import java.util.Scanner;

public class metodos{
public Producto[][] llenarMatriz(int dimension)
{
    Producto[][] matriz = new Producto[dimension][dimension];
    for (int i = 0; i < matriz.length; i++)
    {
        for (int j = 0; j < matriz.length; j++)
        {
            matriz[i][j] = new Producto();
        }
    }
    return matriz;
}
public void mostrarMatriz(Producto[][] matriz)
{
    for (int i = 0; i < matriz.length; i++)
    {
        for (int j = 0; j < matriz.length; j++)
        {
            System.out.println("Nombre: " + matriz[i][j].GetNombre());
            System.out.println("Precio: " + matriz[i][j].GetPrecio());
            System.out.println("Cantidad: " + matriz[i][j].GetCantidad());
        }
    }System.out.println("");
}
public String llenarProducto(Producto[][] matriz){
    Scanner sc = new Scanner(System.in);
    String nombre = "";
    double precio = 0;
    int cantidad = 0;
    System.out.println("Ingrese el nombre del producto");
    nombre = sc.nextLine();
    System.out.println("Ingrese el precio del producto");
    precio = sc.nextDouble();
    System.out.println("Ingrese la cantidad del producto");
    cantidad = sc.nextInt();
    return nombre;
}
public void buscarProducto(String nombre, Producto[][] matriz)
{
    for (int i = 0; i < matriz.length; i++)
    {
        for (int j = 0; j < matriz.length; j++)
        {
            if (matriz[i][j].GetNombre().equalsIgnoreCase(nombre))
            {
                System.out.println("Nombre: " + matriz[i][j].GetNombre());
                System.out.println("Precio: " + matriz[i][j].GetPrecio());
                System.out.println("Cantidad: " + matriz[i][j].GetCantidad());
            
            }
        }  
    }
}
}
