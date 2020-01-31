package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExercises2and3 {

    public static void main(String[] args) {

        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String noDots = str.replace("\\.", "");

        String noCommaString = noDots.replace(",", "");

        String[] strWords = noCommaString.split(" ");

        ArrayList<String> aListWords = new ArrayList<String>(Arrays.asList(strWords));


//        System.out.println("New list of words is: " + aListWords);
        letterCount(aListWords);
    }


    public static void letterCount(ArrayList<String> wordList) {

        int wordLength = 0;
        Scanner input = new Scanner(System.in);
        int wordCount = 0;

        System.out.println("Please choose a number of letters for our word search: ");

        wordLength = input.nextInt();

        for (String i : wordList) {
            if (i.length() == wordLength) {
                System.out.println(i);
                wordCount ++;
                }
            } System.out.println("There are " + wordCount + " instances of words with " + wordLength + " letters.");
        }
    }





