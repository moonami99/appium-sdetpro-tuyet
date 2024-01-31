package Lab.lab4;


import lesson_1.Create_Function;

import java.util.*;

public class lab4 {
    public static void main(String[] args) {

        /*
        ## Lab 4: Create a simple menu with 4 options:

* Generate an ArrayList with random numbers(not fixed numbers) those are less than 1000
* After that, have a menu (You can use while loop) to have below options

```
=====MENU======
1. Print all numbers
2. Print maximum value
3. Print minimum value
4. Search number
```

## Explaination
* Option 01: We print all the numbers that we have in the array list
* Option 02: We need to find out the maximum number from array list and print out that value
* Option 03: We need to find out the minimum number from array list and print out that value
* Option 04: We allow user to input a number to search, if that number is existing in arraylist, we print the number and its index. Otherwise, print that number is not in the list

## Suggestion
* If you can, create methods to support the logic!
         */


        printMenu();
        int userOption = getUserOption();
        final List<Integer> listArrRan = createListInt();
       // List<Integer> test = new ArrayList<>(Arrays.asList(1,20,15,79,45,50));
        switch (userOption){
            case 1:
                System.out.printf("List int Random: "  + listArrRan);
                break;
            case 2:
                System.out.printf("List int Random: "+ listArrRan+ "\nMax number: "+ findMaxArray(listArrRan));
                break;
            case 3:
                System.out.printf("Min Nnumber = " + findMinArray(listArrRan));
                break;
            case 4:
                //System.out.printf(listArrRan.toString());
                findNumArray(getUserOption(), listArrRan);
                break;
        }



    }

    public static void printMenu() {
        System.out.printf("=====MENU======\n" +
                "1. Print all numbers\n" +
                "2. Print maximum value\n" +
                "3. Print minimum value\n" +
                "4. Search number\n");
    }
    public static int getUserOption(){

        System.out.printf("Please input your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static List<Integer> createListInt(){
        //create size of array <20
        //int ransize = new Random().nextInt(20);

        int ransize = 0;
        while (ransize ==0){
            ransize = new Random().nextInt(20);
        }
        int rannum;
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < ransize; i++) {
            rannum = new Random().nextInt(1000);
            myList.add(rannum);
        }

        return myList;
    }
    public static int findMaxArray (List<Integer> arrayInt){

        arrayInt.sort(null);

     /*   int numMax = arrayInt.get(0);
        for (int value : arrayInt) {
            if (value > numMax) {
                numMax = value;
            }
        }*/
        return arrayInt.get(arrayInt.size()-1);
    }
    public static int findMinArray (List<Integer> arrayInt){
        arrayInt.sort(null);
        return arrayInt.get(0);
    }
    public static void findNumArray (int num, List<Integer> arrayInt){

       if (!arrayInt.contains(num)){
           System.out.printf("number is not in the list");
       }else {
           for (int i = 0; i < arrayInt.size(); i++) {
               if (arrayInt.get(i) == num) {
                   System.out.printf("\nnumber: " + num + "\nindex:" + (i + 1));
                   break;
               }
           }
       }

    }

}
