import java.util.Scanner;
import java.lang.Math;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO : Promt the user for their name
        System.out.println("You're Jane's friend!");
        System.out.print("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //Prompting the user to input a floating number can be found in method below

        //what should print out AFTER they input spice
        //System.out.println("Well " + name + ", the spice value resulted in " + calculateSpiceValue());
    }

    //Method to calculate the spice value
    //private static double calculateSpiceValue()
    {
       //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter a floating-point number:");
        //double spice = scanner.nextDouble();

        //COME BACK TO THIS SECTION
        //math to calculate the new spice value
        //double equation = Math.pow((4/3),2)*(Math.pow(2,Math.sqrt(5))/Math.pow(spice,3));
        //return equation;


    }


    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();



        // TODO: Calculate and output the wall's area
        double wallArea = wallHeight*wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
         final double GALLON_COVERAGE = 350.0; // Gallon covers 350 square feet
        double paintNeeded = wallArea/GALLON_COVERAGE;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        int cansNeeded = (int) Math.ceil(paintNeeded);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");

    }
}
