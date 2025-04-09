import java.util.Scanner;

public class AreaRectangulo {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa el largo del rectangulo: ");
        double largo = s.nextDouble();

        System.out.println("Ingresa el ancho del rectangulo: ");
        double ancho = s.nextDouble();

        s.close();

        double area = largo*ancho;

        System.out.printf("El area es: " + area);
    }
}
