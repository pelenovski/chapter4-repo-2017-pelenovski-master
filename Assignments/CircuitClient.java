package Assignments;



/**
Pane Elenovski
12/5/2017
Circuit Client
Client used to perform actions with Circuit program
 */
import java.util.Scanner;
public class CircuitClient
{

    public static void main(String[] args)
    {
        Circuit line = new Circuit(true,false);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Would you like to alter any switches state? (y or n) ");
        String choice;
        int choice1;
        choice = keyboard.next();
        
        if (choice == "y")
        {
            System.out.print("Which switch would you like to toggle? (1 or 2) ");
            choice1 = keyboard.nextInt();
            if (choice1 == 1)
            {
                line.toggleFirstSwitch();
            }
            else if (choice1 == 2)
            {
                line.toggleSecondSwitch();
            }
            line.getLampState();
            System.out.print(line);
            System.out.print("\nWould you like to toggle another switch? (y or n) ");
            choice = keyboard.next();
        }
        System.out.println(line);
    }
}
