import java.io.*;
import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int e = sc.nextInt();

            if (!isPrime(e)) System.out.println("Not prime");
            else System.out.println("Prime");
        }
    }

    public static boolean isPrime(int n) {

        if ((n > 2 && n % 2 == 0) || n == 1) {
            return false;
        }

        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
