import java.util.Scanner;

public class AreaCirculo {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de su circulo");

        double radio = scanner.nextDouble();
        double area = Math.PI*Math.pow(radio,2);

        System.out.printf("El área del círculo es: %.2f%n", area);

        scanner.close();
    }
}