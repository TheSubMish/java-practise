import java.util.Scanner;
import java.util.Arrays;

public class ArraysMethods {
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

        int position = Arrays.binarySearch(a,3);
        System.out.println("Position of 3: " + position); // binary search

        // int [] b = {1,2,3,4,5};
        int [] b = Arrays.copyOf(a, a.length); // copy of array a
        
        boolean flag = Arrays.equals(a, b);
        System.out.println("Arrays are equal: " + flag); // checking if two arrays are equal

        Arrays.sort(b);

        // for each loop
        for (int i:a) {
            System.out.print(i + " "); // output
        }
        System.out.println();
        // multi-dimensional arrays
        // int[][] b = new int[3][4]; // declatation and instantiation

        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b[i].length; j++) {
        //         b[i][j] = (i+1) * (j+1); // initialization
        //     }
        // }

        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b[i].length; j++) {
        //         System.out.print(b[i][j] + " "); // output
        //     }
        //     System.out.println();
        // }

        sc.close(); // close scanner
    }

}
