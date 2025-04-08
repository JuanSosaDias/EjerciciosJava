import java.util.Scanner;

public class AreaTri {
    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        System.out.println("Ingrese la base de su Triangulo: ");
        
        int h = scanner.nextInt();
        System.out.println("Ingrese la altura de su Triangulo: ");

        int area = (b*h)/2 ;

        return area;

    }    
}
