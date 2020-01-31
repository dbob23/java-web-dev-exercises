package exercises;

import java.util.Arrays;

public class ArrayExercises3and4 {

    public static void main(String[] args){
        String str = "I would not, could not, in a box. I would not, could not with a fox. \nI will not eat them in a house. I will not eat them with a mouse.";
        String[] newStr = str.split(" ");
//        System.out.println(Arrays.toString(newStr));

        String[] nextString = str.split("\\.");
        System.out.println(Arrays.toString(nextString));

    }
}
