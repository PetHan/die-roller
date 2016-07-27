package dice;
import java.util.Random;

public class DieRoller {
	

	
	public static int randInt(int min, int max){ 	// creates a random number between the max 
		Random rand = new Random();					// (number of sides) and min (1)
		
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}
	
	public static int rollD4(int dieNumber, int dieModifier) { 
		int numTotal = 0;							// the total value of the die rolls.
		int latestRoll = 0;							// the most recent roll.
		for(int i = 0; i < dieNumber; i++) {		// calls the number generator a number of times 
			latestRoll = randInt(1, 4);				// signified by the die number.
			System.out.print(latestRoll + ", ");
			DieRollerGUI.textField_record.setText(Integer.toString(latestRoll) + ", ");
			numTotal += latestRoll;
		}
		
		return numTotal  + dieModifier;
	}
	
	public static int rollD6(int dieNumber, int dieModifier) { 
		int numTotal = 0;							// the total value of the die rolls.
		int latestRoll = 0;							// the most recent roll.
		for(int i = 0; i < dieNumber; i++) {		// calls the number generator a number of times 
			latestRoll = randInt(1, 6);				// signified by the die number.
			System.out.print(latestRoll + ", ");
			numTotal += latestRoll;
		}
		
		return numTotal  + dieModifier;
	}
	
	public static int rollD8(int dieNumber, int dieModifier) { 
		int numTotal = 0;							// the total value of the die rolls.
		int latestRoll = 0;							// the most recent roll.
		for(int i = 0; i < dieNumber; i++) {		// calls the number generator a number of times 
			latestRoll = randInt(1, 8);				// signified by the die number.
			System.out.print(latestRoll + ", ");
			numTotal += latestRoll;
		}
		
		return numTotal  + dieModifier;
	}
	
	public static int rollD10(int dieNumber, int dieModifier) {
		int numTotal = 0;							// the total value of the die rolls.
		int latestRoll = 0;							// the most recent roll.
		for(int i = 0; i < dieNumber; i++) {		// calls the number generator a number of times 
			latestRoll = randInt(1, 10);				// signified by the die number.
			System.out.print(latestRoll + ", ");
			numTotal += latestRoll;
		}
		
		return numTotal  + dieModifier;
	}
	
	public static int rollD12(int dieNumber, int dieModifier) {
		int numTotal = 0;							// the total value of the die rolls.
		int latestRoll = 0;							// the most recent roll.
		for(int i = 0; i < dieNumber; i++) {		// calls the number generator a number of times 
			latestRoll = randInt(1, 12);				// signified by the die number.
			System.out.print(latestRoll + ", ");
			numTotal += latestRoll;
		}
		
		return numTotal  + dieModifier;
	}
	
	public static int rollD20(int dieNumber, int dieModifier) { 
		int numTotal = 0;							// the total value of the die rolls.
		int latestRoll = 0;							// the most recent roll.
		for(int i = 0; i < dieNumber; i++) {		// calls the number generator a number of times 
			latestRoll = randInt(1, 20);				// signified by the die number.
			System.out.print(latestRoll + ", ");
			numTotal += latestRoll;
		}
		
		return numTotal  + dieModifier;
	}
	
	public static int rollD100(int dieNumber, int dieModifier) {
		int numTotal = 0;							// the total value of the die rolls.
		int latestRoll = 0;							// the most recent roll.
		for(int i = 0; i < dieNumber; i++) {		// calls the number generator a number of times 
			latestRoll = randInt(1, 100);				// signified by the die number.
			System.out.print(latestRoll + ", ");
			numTotal += latestRoll;
		}
		
		return numTotal  + dieModifier;
	}
	
	public static int rollDX(int dieNumber, int dieModifier, int dX) {
		int numTotal = 0;							// the total value of the die rolls.
		int latestRoll = 0;							// the most recent roll.
		for(int i = 0; i < dieNumber; i++) {		// calls the number generator a number of times 
			latestRoll = randInt(1, dX);				// signified by the die number.
			System.out.print(latestRoll + ", ");
			numTotal += latestRoll;
		}
		
		return numTotal  + dieModifier;
	}
	
	public static void main(String[] args){
		int lastRoll;
		
		lastRoll = rollD6(10, 0);
		System.out.println();
		System.out.println("The last roll was " + lastRoll);
	}
}





