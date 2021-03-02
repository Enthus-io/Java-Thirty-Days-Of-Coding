import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = n; i > 0; i--) {
            System.out.print(arr[i - 1]);

            if(i > 1)
                System.out.print(' ');
        }

        scanner.close();
    }
}
