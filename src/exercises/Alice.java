package exercises;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        String text = new String();
        String term = new String();
        String textLowerCase = new String ();
        String termLowerCase = new String ();

        text = "  Alice was beginning to get very tired of sitting by her sister on the bank, \n and of having nothing to do: once or twice she had peeped into the book her \n sister was reading, but it had no pictures or conversations in it, 'and what is \n the use of a book,' thought Alice 'without pictures or conversation?'\n";
        System.out.println("Please enter a term to search for in the text: ");
        Scanner input = new Scanner(System.in);
        term = input.nextLine();
        int termLength = term.length();
        textLowerCase = text.toLowerCase();
        termLowerCase = term.toLowerCase();
        int termIndex = textLowerCase.indexOf(termLowerCase);

        if (textLowerCase.contains(termLowerCase)) {
            System.out.println("Yes, '" + term + "' is found in the text. \nIt is found at index " + termIndex + ".\n" + "The word '" + term + "' is " + termLength + " letters long.");
        } else {
            System.out.println("No, " + term + " is not found in the text.");
        }

        int textLength = text.length();
        String firstString = text.substring(0, termIndex);
        String secondString = text.substring((termIndex + termLength + 1), textLength);
        String newText = firstString.concat(secondString);

        System.out.println(newText);
//        System.out.println(termLowerCase.contains(termLowerCase));

    }




}
