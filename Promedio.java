public class Promedio {
    public static void main(String[] args) {
        
        int n = 5, result = 0;
        int a[]= new int[5];

        a[0] =110;
        a[1] =230;
        a[2] =3430;
        a[3] =0;
        a[4] =40;

        for (int i=0; i<n; i++) {
            result = result + a[i];
        }

        System.out.println("average of " + (result / 5.0));

    }
}
