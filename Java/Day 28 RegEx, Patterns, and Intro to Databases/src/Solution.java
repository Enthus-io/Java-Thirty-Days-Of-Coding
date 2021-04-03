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

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Pattern p = Pattern.compile(".*@gmail.com");
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            Matcher m = p.matcher(emailID);
            if (m.find()) {
                list.add(firstName);
            }
        }

        Collections.sort(list);

        for (String name : list) {
            System.out.println(name);
        }

        scanner.close();
    }
}
