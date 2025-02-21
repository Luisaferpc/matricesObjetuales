import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0, dimension = 0;
        System.out.println("Ingrese la dimension de la matriz");
        dimension = sc.nextInt();
        System.out.println("ingrese el punto que desea visualizar");
        opcion = sc.nextInt();
        metodos m = new metodos();
        switch (opcion) {
            case 1:
                
                break;

            default:
                System.out.println("pagina en mantenimiento");
                break;
        }
    }
}
