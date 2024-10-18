// imports

import java.util.Scanner;
import javax.swing.*; // this import is related to creating the GUI for the program



// main class that will run
public class passava {
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

        // this will create a JFRAME object
        JFrame jframe = new JFrame("Passava");

        // this will close the window on close...
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the size of the window to a correct size
        jframe.setSize(400,400);


        JLabel welcome_msg = new JLabel("Welome to Passava " + fname + "!");

        jframe.getContentPane().add(welcome_msg);

        jframe.setVisible(true);






    }
}
