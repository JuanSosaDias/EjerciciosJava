import java.util.Scanner;

class AreaTriEqui {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 

        System.out.println("Enter the length of the side:");
        int side = s.nextInt();

        System.out.println("Enter the length of the height:");
        int height = s.nextInt();

        double area = (side * height) / 2;
        System.out.println("El area es: " + area);

        s.close();
    }
}
