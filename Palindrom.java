import java.io.*;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class Palindrom {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String ");
        String s = sc.nextLine();

        if (ispalindrom(s)) {
            System.out.println(s + " is a Palindrom");
        }
    }

    static boolean ispalindrom(String s) {
        int r = s.length() - 1;
        int l = 0;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        }
        return true;
    }
}
