import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String input;
        String oldLetters;
        String evenLetters;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int j = 0; j < n; j++) {
            oldLetters = "";
            evenLetters = "";
            input = scanner.nextLine();

            for (int i = 0; i < input.length(); i++) {
                if ((i & 1) == 0) {
                    evenLetters += input.charAt(i);
                } else {
                    oldLetters += input.charAt(i);
                }
            }

            System.out.println(evenLetters + " " + oldLetters);
        }

    }
}
