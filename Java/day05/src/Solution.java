import java.util.Scanner;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        while(i < 10) {
            System.out.println(n + " x " + ++i + " = " + (n * i));
        }

        scanner.close();
    }
}
