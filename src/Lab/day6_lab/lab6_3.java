package Lab.day6_lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab6_3 {
    public static void main(String[] args) {
        /*
        LAB 6.3
        String myStr = "100 minutes";
        NOT using REGEX, extract digit character from that String
        Expected output: "100".
        EX: "12345nabc678" -> "12345678"
        * */

        String myStr = "12345nabc678";
        System.out.printf(myStr);

        //in ra kiểu chuỗi
        System.out.printf("\n");

        StringBuilder digits = new StringBuilder();

        for (char ch: myStr.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        String extractedDigits = digits.toString();
        System.out.println(extractedDigits);


         /*
       //in ra kiểu mảng
        char[] charArray = myStr.toCharArray();
        List<Integer> digits1 = new ArrayList<>();
        System.out.printf(Arrays.toString(charArray));
        for (char ch:charArray) {
            if (Character.isDigit(ch)) {
                digits1.add(Integer.parseInt(String.valueOf(ch)));
            }
        }
        System.out.printf("\n");
        System.out.printf(digits1.toString());
        */

    }
}
