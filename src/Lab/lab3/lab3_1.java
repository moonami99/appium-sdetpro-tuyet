package Lab.lab3;

public class lab3_1 {
    public static void main(String[] args) {
        /*Count how many odd, even number(s) in an integer array
        int[] intArr = {1, 2, 3, 4, 5};

        Even numders: 2
        Odd numbers: 3*/


        int[] intArr = {1, 2, 3, 4, 5};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                countEven++;
            } else countOdd++;
        }
        System.out.printf("Even" + countEven);
        System.out.printf("\nOdd" + countOdd);
    }
}
