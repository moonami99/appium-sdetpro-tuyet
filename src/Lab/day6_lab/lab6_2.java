package Lab.day6_lab;

import java.util.Scanner;

public class lab6_2 {
    /*
    LAB 6.2
    String myPassword = "password123";
    Allow user to input maximum 3 times
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "password123";
        boolean isCorrect = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("password correct!");
                isCorrect = true;
                break; // Thoát khỏi vòng lặp nếu mật khẩu đúng
            } else {
                System.out.printf("Password incorrect, %s entries left.", (3-attempt));
            }
        }

        if (!isCorrect) {
            System.out.println("You have entered the wrong password 3 times.");
        }

        scanner.close();
    }
}
