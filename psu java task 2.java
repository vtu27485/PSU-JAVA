import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = sc.nextInt();

        if (index >= 0 && index < n) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Invalid Index");
        }

        sc.close();
    }
}


/*
OUTPUT:
Array: [10, 20, 30, 40, 50]
Target Index: 2
Element at index 2 is: 30
*/
