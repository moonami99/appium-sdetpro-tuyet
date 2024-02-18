package Lab.day6_lab;

import java.util.*;


public class lab6_1 {
    public static void main(String[] args) {

        /*
        LAB 6.1
        Given input string: "2hrs and 5 minutes"
        Please calculate how many minutes in total
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time series (ex, '2hrs and 5 minutes'): ");
        String input = scanner.nextLine();

        int totalMinutes = calculateTotalMinutes(input);
        System.out.println("Total minutes: " + totalMinutes);

        scanner.close();
    }


    public static int calculateTotalMinutes(String inputString) {
        int hours = 0;
        int mins = 0;

        String[] temp = inputString.split("\\s");

        for (int i = 0; i < temp.length - 1; i++) {
            if (temp[i].contains("hrs")) {
                hours = Integer.parseInt(temp[i].replaceAll("[^0-9]", ""));
            } else if (temp[i + 1].equals("minutes")) {
                mins = Integer.parseInt(temp[i]);
            }
        }


        return hours * 60 + mins;
    }

}
