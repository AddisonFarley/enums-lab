//Addison Farley
//SDEV 219
//enums lab

package directions;
import java.util.*;
public class DirectionsDriver
{
    public static void main(String[] args)
    {
        Directions driver1Direction = Directions.NORTH;
        Directions driver2Direction = Directions.WEST;

        //printing out the direction of our driver
        System.out.println("Driver 1 is going " + driver1Direction);
        System.out.println("Driver 2 is going " + driver2Direction);
        System.out.println();

        //a driver changes direction
        driver2Direction = Directions.SOUTH;
        System.out.println("Driver 1 is going " + driver1Direction);
        System.out.println("Driver 2 is going " + driver2Direction);

        //is the driver heading north or south
        if(driver2Direction == Directions.NORTH || driver2Direction == Directions.SOUTH)
        {
            System.out.println("Driver 2 is heading north or south!");
        }
        System.out.println();

        //print out all four cardinal directions
        Directions[] allDirections = Directions.values();

        for (int i = 0; i < allDirections.length; i++) {
            Directions oneDirection = allDirections[i];
            System.out.println("A direction: " + oneDirection);
        }

        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a direction (seen above)");
        String userInput = console.nextLine();

        //convert to the enum using valueOf()
        Directions direction = Directions.valueOf(userInput);
        System.out.println("You entered " + direction);
    }
}
