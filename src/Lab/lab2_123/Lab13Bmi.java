package Lab.lab2_123;

import java.util.Scanner;

public class Lab13Bmi {
    public static void main(String[] args) {
        //Get from input
        Scanner scaner = new Scanner(System.in);
        System.out.println("please enter your height(m): ");
        float height = scaner.nextFloat();

        System.out.println("please enter your weight(kg): ");
        float weight = scaner.nextFloat();

        float BIM = weight/(height*2);
        System.out.printf("your BIM = %s\n", BIM);
        if (BIM < 18.5) {
            System.out.println("Underweight");
            System.out.println("\nYou should increase weight");
        }else if (BIM >= 18.5 && BIM <= 24.9){
            System.out.println("Normal weight");
            System.out.println("\nyou should keep your weight");
        } else if (BIM >=25 && BIM <= 29.9) {
            System.out.println("Overweight");
            System.out.println("\nYou should decrease weight");
        }else {
            System.out.println("Obesity");
            System.out.println("\nYou should decrease weight");
        }
    }
}
