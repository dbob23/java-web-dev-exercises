package exercises;

import java.util.ArrayList;

public class ArrayListExercises1 {
    public static void main(String[] args){

        ArrayList<Integer> someNums = new ArrayList<>();
        someNums.add(2);
        someNums.add(4);
        someNums.add(4);
        someNums.add(3);
        someNums.add(1);
        someNums.add(5);
        someNums.add(4);
        someNums.add(6);
        someNums.add(7);
        someNums.add(9);

//        System.out.println(someNums);
        System.out.println(findSumOfEvens(someNums));

}
    public static Integer findSumOfEvens (ArrayList<Integer> numbers) {

        Integer sumOfEvens = 0;
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            }

        }
        return sumOfEvens;

    }

    }
