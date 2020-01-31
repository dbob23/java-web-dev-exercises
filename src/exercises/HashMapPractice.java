package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args ){

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student's name (or ENTER to finish):");

//        Get student names and Ids
        do {

            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")){
                System.out.println("Id: ");
                Integer studentId = input.nextInt();
                students.put(studentId, newStudent);

//               Read in the newline before looping back
                input.nextLine();
            }
        } while (!newStudent.equals(""));

//        print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getValue() + " (" + student.getKey() + ")");

        }

    }

}