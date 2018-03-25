/*
 * @project Week7
 * @author  Osbardo Rodriguez
 * Date:    3/27/18
 */
package Week7;

/*
 * Import the Random java package.
 */
import java.util.Random;
/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

/**
 * Define class Main.
 */
public class Main {

    public static void main(String[] args) {

        // Instantiate the Scanner
        Scanner input = new Scanner( System.in );
        System.out.print( "How many dice do you want to simulate (1-6)?: " );
        int diceQuantity = input.nextInt();

	    System.out.print( "How many sides will each die have (1-10)?: " );
	    int diceSides = input.nextInt();

	    System.out.print( "How many rolls do you want to simulate (1-10000000)?: ");
	    int rollsSimulated = input.nextInt();
    }
}
