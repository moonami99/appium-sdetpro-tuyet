package Lab.lab3;


public class lab3_3 {
    public static void main(String[] args) {
        /*Lab 3.3:
        Sort an integer array from min to max

        Input: {12, 34, 1, 16, 28}
        Expected output: {1, 12, 16, 28, 34}
        */

        int[] intArr= {12, 34, 1, 16, 28};
        int c;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr.length; j++) {
                if (intArr[i] < intArr[j]) {
                    // hoan doi vi tri
                    c= intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = c;
                }
            }
        }

        System.out.printf("\n");
        for (int i = 0; i < intArr.length ; i++) {
            System.out.printf(" " + intArr[i]);
        }

    }
}
