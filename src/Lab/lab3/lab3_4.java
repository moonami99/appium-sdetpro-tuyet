package Lab.lab3;

public class lab3_4 {
    public static void main(String[] args) {
        /*
    Lab 3.4(optional):
    Merge 2 SORTED integer array into one SORTED array

    Array 01: {1, 12, 16, 28, 34}
    Array 02: {1, 13, 16, 27, 99}
        1,1,12,13,16
        34,28,16,27,99

    Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}*/

        int[] arr1 = {1, 12, 16, 28, 34};
        int[] arr2 = {1, 13, 16, 27, 99};
        int c;
        int[] arr = new int[arr1.length+arr2.length] ;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    c = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = c;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf(" " + arr1[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf(" " + arr2[i]);
        }

    }



}
