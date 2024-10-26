import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // single dimensional arrays
        int length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        length = sc.nextInt();

        int a[] = new int[length]; // declatation and instantiation

        for (int i = 0; i < a.length; i++) {
            a[i] = i+1; // initialization
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // output
        }


        // multi-dimensional arrays
        int[][] b = new int[3][4]; // declatation and instantiation

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (i+1) * (j+1); // initialization
            }
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " "); // output
            }
            System.out.println();
        }

        sc.close(); // close scanner
    }

}
