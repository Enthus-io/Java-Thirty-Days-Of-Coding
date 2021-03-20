import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference(){
        int max = -2147483648;
        int min = 2147483647;

        for (int ith: elements) {
            if(ith > max){
                max = ith;
            }

            if(ith < min){
                min = ith;
            }
        }

        maximumDifference = Math.abs(max - min);
    }
}
// End of Difference class

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Difference d = new Difference(arr);
        d.computeDifference();
        System.out.println(d.maximumDifference);

        scanner.close();
    }
}
