package Lab.lab2_123;

import java.util.Scanner;

public class Lab2OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plase enter number: ");
        int num = scanner.nextInt();
        if (num%2 == 0 ) {
            System.out.println("number is even!");
        }else {
            System.out.println("num is odd!");
        }
    }
}
