import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String question) {
        System.out.println(question + "\nInput: ");
        return scanner.nextLine();
    }

    public static int readInt (String question, int min, int max) {
        while (true) {
            try {
                System.out.println(question);
                System.out.print("Number (" + min + " - " + max + "): ");

                int userInt = scanner.nextInt(); //checking for type exception risk

                // make sure to clear System.in using the line after taking in any data that is not a string

                if (userInt >= min && userInt <= max ) { // checking for wild range
                     return userInt;
            }
                // these lines will not run if a valid input is given
                System.out.println("Number must be in the range (" + min + " ' " + max + ")" );

        } catch (InputMismatchException e) {
                System.out.println("You must enter a whole number, try again... ");
                scanner.nextLine();

            } catch (exception e) {
                System.out.println("An error unknown occurred");
                System.out.println(e + "\n" + e.getMessage());

            }

        }
    }
}


