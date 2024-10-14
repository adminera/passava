// imports

import java.util.Scanner;

// main class that will run
public class Main {
    public static void main(String[] args) {
        // prints welcome statements
        System.out.println("Welcome to passava, the only app you need to safely store your passwords!");

        // create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // prompt user for first name
        System.out.println("To start off, what is your first name?: ");

        // takes user input for first name and stores it
        String fname = scanner.nextLine();

        // output the fname
        System.out.print(fname);




    }
}
