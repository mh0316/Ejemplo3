import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in) ;
        int a;
        int b;
        System.out.println("Ingrese el primer número: ");
        a = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        b = leer.nextInt();
        System.out.println("Los números son: "+a+" y "+b);
    }
}