//Addison Farley
//SDEV 219
//enums lab


package driver;

import user.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    private Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        Main program = new Main();

        Title[] titles = Title.values();

        String title = program.promptForString("Enter a title from: " +
                Arrays.toString(titles));
        String fName = program.promptForString("Enter first name");
        String lName = program.promptForString("Enter first name");
        String nickName = program.promptForString("Enter nickname");

        Person user = new Person(Title.valueOf(title), fName, lName, nickName);

        System.out.println("Thanks for playing - " + user.toString());
    }

    private String promptForString(String prompt)
    {
        System.out.println(prompt);
        return console.nextLine();
    }
}

