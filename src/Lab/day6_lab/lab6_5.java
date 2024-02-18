package Lab.day6_lab;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lab6_5 {
    /*
        LAB 6.5 (Optional)
        Allow user to input a sentence
        Count the words and group them
        Ex: Hello, tui ten teo, ban co phai ten teo khong?
        Output: -->
        Hello: 1
        tui: 1
        teo: 2
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        countWords(sentence);
        scanner.close();
    }

    public static void countWords(String sentence) {

        String cleanedSentence = sentence.replaceAll("[,.?!]", "");
        String[] arrWords = cleanedSentence.split("\\s+");

        System.out.printf("%s\n", Arrays.toString(arrWords));

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : arrWords) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

       /* wordCount.forEach((key, value) -> {
            String msg = key + ": " + value;
            System.out.println(msg);
        });*/


    }
}
