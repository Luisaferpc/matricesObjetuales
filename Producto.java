public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    public Producto()
    {}
    public String GetNombre()
    {
        return nombre;
    }
    public void SetNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public double GetPrecio()
    {
        return precio;
    }
    public void SetPrecio(double precio)
    {
        this.precio = precio;
    }
    public int GetCantidad()
    {
        return cantidad;
    }
    public void SetCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }
}
