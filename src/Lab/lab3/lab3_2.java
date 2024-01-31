package Lab.lab3;

public class lab3_2 {
    public static void main(String[] args) {
        /*Lab 3.2:
        Finding maximum value/minimum value from an integer array
        int[] intArr = {1, 2, 3, 4, 5};

        Minimum: 1
        Maximum: 5*/


        int[] intArr = {4, 2, 5, 3, 1};
        int min = intArr[0];
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (min > intArr[i]) {
                min = intArr[i];
            }
            if (max < intArr[i]) {
                max = intArr[i];
            }
        }
        System.out.printf("min = " + min);
        System.out.printf("\nmax = " + max);
    }

}
