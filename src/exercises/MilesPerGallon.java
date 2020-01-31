package exercises;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles driven:");
        float miles = input.nextFloat();
        System.out.println("Please enter the number of gallons of gas you consumed:");
        float gallons = input.nextFloat();
        float milesPerGallon = miles / gallons;
        System.out.println("You averaged " + milesPerGallon + " miles-per-gallon.");
    }
}
