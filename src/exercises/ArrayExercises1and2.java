package exercises;

public class ArrayExercises1and2 {

    public static void main(String[] args){

        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < 6; i++){
//            System.out.println(someInts[i]);
            if (someInts[i] % 2 == 0){
                System.out.println(someInts[i]);
            }

        }
    }
}
