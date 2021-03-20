import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int base = 2;
        int currentConsecutives = 0;
        int maxConsecutives = 0;

        while(n > 0){
            int remainder = n % base;

            if(remainder == 1) {
                currentConsecutives += remainder;

                if(currentConsecutives > maxConsecutives)
                    maxConsecutives = currentConsecutives;
            }
            else
                currentConsecutives = 0;

            n /= base;
        }

        System.out.println(maxConsecutives);

        scanner.close();
    }
}
