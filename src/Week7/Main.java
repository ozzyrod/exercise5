/*
 * @project Week7
 * @author  Osbardo Rodriguez
 * Date:    3/27/18
 */
package Week7;

/*
 * Import necessary java packages.
 */
import java.util.Random;
import java.util.Scanner;

/**
 * Define class Main.
 */
public class Main {

	public static void main ( String[] args ) {

		int diceQuantity = dieQuantity(); // Get the amount of die to simulate.
		int diceSides = dieSides(); // Get the number of sides on the die.
		int rollsSimulated = toSimulate(); // Get the number of rolls to simulate.
		int[] combos; // Declare the array for the number of combinations
		int maxComboLimit; // Declare the maximum amount of combinations available

		// Assign the quantity of combinations to max.
		maxComboLimit = diceQuantity * diceSides;

		// Create the array and assign it to a variable
		combos = new int[ maxComboLimit + 1 ];

		// Simulate the rolls and add the data to the array.
		for ( int roll = 1; roll <= rollsSimulated; roll++ ) {
			++combos[ dieTotalRoll( diceQuantity, diceSides ) ];
		}

		// Print out the information header.
		System.out.printf( "%s%12s\n", "Number Rolled", "Frequency" );
		System.out.println( "------------------------" );

		// Print out the data.
		for ( int numberShown = diceQuantity; numberShown < combos.length; numberShown++ ) {
			System.out.printf( "%2d%22d\n", numberShown, combos[ numberShown ] );
		}
	}

	/*
	 * Simulates the individual rolls and returns them.
	 * @param  int dieQuantity The number of die being simulated.
	 * @param  int dieSides The number of sides each die has.
	 * @return int Quantity of die
	 */
	public static int dieTotalRoll( int dieQuantity, int dieSides ) {

		// Instantiate the Randomizer
		Random randomNumbers = new Random();

		int totalRoll = 0;

		for ( int die = 1; die <= dieQuantity; die++ ) {
			totalRoll += randomNumbers.nextInt( dieSides ) + 1;
		}

		return totalRoll;
	}

	/*
	 * Asks the user for the number of die to simulate.
	 * @return int Quantity of die
	 */
	public static int dieQuantity() {

		// Instantiate the Scanner
		Scanner input = new Scanner( System.in );

		// Get the number of die we'll be working with.
		System.out.print( "How many dice do you want to simulate (1-6)?: " );
		int diceQuantity = input.nextInt();

		// Check the user input for the die quantity.
		if ( diceQuantity < 1 || diceQuantity > 6 ) {
			do {
				System.out.println( "Sorry, you need to enter a number between 1 and 6. Please try again." );
				System.out.print( "How many dice do you want to simulate (1-6)?: " );
				diceQuantity = input.nextInt();
			} while ( diceQuantity < 1 || diceQuantity > 6 );
		}

		return diceQuantity;
	}

	/*
	 * Asks the user for the number of sides each die will have.
	 * @return int Sides of die
	 */
	public static int dieSides() {
		// Instantiate the Scanner
		Scanner input = new Scanner( System.in );

		System.out.print( "How many sides will each die have (2-10)?: " );
		int diceSides = input.nextInt();

		// Check the user input for sides on the die.
		if ( diceSides < 2 || diceSides > 10 ) {
			do {
				System.out.println( "Sorry, you need to enter a number between 2 and 10. Please try again." );
				System.out.print( "How many sides will each die have (2-10)?: " );
				diceSides = input.nextInt();
			} while ( diceSides < 2 || diceSides > 10 );
		}

		return diceSides;
	}

	/*
	 * Asks the user for the number of rolls to simulate.
	 * @return int Quantity of die
	 */
	public static int toSimulate() {
		// Instantiate the Scanner
		Scanner input = new Scanner( System.in );

		System.out.print( "How many rolls do you want to simulate (1-10000000)?: " );
		int rollsSimulated = input.nextInt();

		// Check to see if the user entered variable is something we can work with.
		if ( rollsSimulated < 1 || rollsSimulated > 10000000 ) {
			do {
				System.out.println( "Sorry, you need to enter a number between 1 and 10000000. Please try again." );
				System.out.print( "How many rolls do you want to simulate (1-10000000)?: " );
				rollsSimulated = input.nextInt();
			} while ( rollsSimulated < 1 || rollsSimulated > 10000000 );
		}

		return rollsSimulated;
	}
}
