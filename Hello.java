import java.util.*;
import java.io.*;

public class Hello {
    private static final String[] units = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine"
    };
    private static final String[] twoDigits = {
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };
    private static final String[] tenMultiples = {
            "",
            "",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };
    private static final String[] placeValues = {
            " ",
            " thousand",
            " million",
            " billion",
            " trillion",
            "quadrillions",
            "quintillions"

    };

    private static String Convert(String s) {
        int number = Integer.parseInt(s);
        String word = "";
        int num = number % 100;

        if (num < 10) {
            word = word + units[num];
        } else if (num < 20) {
            word = word + twoDigits[num % 10];
        } else {
            word = tenMultiples[num / 10] + units[num % 10];
        }

        word = (number / 100 > 0) ? units[number / 100] + " hundred" + word : word;
        return word;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for n");
        String s = sc.nextLine();
        int count = 0;
        String word = "";

        if (s.length() % 3 == 0) {
            for (int i = s.length() - 1; i > 0; i = i - 3) {
                String s1 = s.substring(i - 2, i + 1);
                String w = Convert(s1) + placeValues[count];
                word = w + word;
                count++;

            }
            System.out.print(word);

        }

        if (s.length() % 3 == 1) {
            for (int i = s.length() - 1; i > 0; i = i - 3) {
                String s1 = s.substring(i - 2, i + 1);
                String w = Convert(s1) + placeValues[count];
                word = w + word;
                count++;

            }
            int i = Integer.parseInt(s.substring(0, 1));
            word = units[i] + placeValues[count] + word;
            System.out.print(word);

        }
        if (s.length() % 3 == 2) {
            for (int i = s.length() - 1; i > 2; i = i - 3) {
                String s1 = s.substring(i - 2, i + 1);
                String w = Convert(s1) + placeValues[count];
                word = w + word;
                count++;

            }
            String f = s.substring(0, 2);
            word = Convert(f) + placeValues[count] + word;
            System.out.print(word);

        }
        // Convert(112);

    }
}
