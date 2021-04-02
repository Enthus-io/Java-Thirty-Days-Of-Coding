import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner mScanner = new Scanner(System.in);
        int returnDay = mScanner.nextInt();
        int returnMonth = mScanner.nextInt();
        int returnYear = mScanner.nextInt();

        int dueDay = mScanner.nextInt();
        int dueMonth = mScanner.nextInt();
        int dueYear = mScanner.nextInt();
        mScanner.close();

        int fine = 0;

        if (returnDay > dueDay && returnMonth == dueMonth && returnYear == dueYear) {
            fine = 15 * (returnDay - dueDay);
        } else if (returnMonth > dueMonth && returnYear == dueYear) {
            fine = 500 * (returnMonth - dueMonth);
        } else if (returnYear > dueYear) {
            fine = 10000;
        }

        System.out.println(fine);
    }
}
