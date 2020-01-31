package exercises;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle in question.");
        int length = input.nextInt();
        System.out.println("Please enter the width of the rectangle in question.");
        int width = input.nextInt();
        int area = length * width;
        System.out.println("The area of the rectangle is " + area + " square units.");


    }
}
