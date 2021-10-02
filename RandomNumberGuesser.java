import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuesser {
	public static void main(String[] args) 
	{
		
		int res = 0;
		//Initiate do loop
		do 
		{
			//Create a new object of type Scanner
			//that reads from the keyboard
			Scanner keyboard = new Scanner(System.in);
			
			//Initialize required variables
			int randNum, nextGuess, highGuess = 100, lowGuess = 0;
			
			//Create a new RNG object
			RNG newRng = new RNG();
			
			//Call rand() method to generate random number
			randNum = RNG.rand();
			
			
			//Call resetCount to reset the number of guess to 1
			RNG.resetCount();
			
			//Prompt user to enter first guess number
			System.out.print("Enter your first guess");
			
			//Read in the line that the user types
			nextGuess = keyboard.nextInt();
		
			//Initiate a while loop when nextGuess is not equal to randNum
			while (nextGuess != randNum)
			{
				//Initiate a while loop when nextGuess is greater than highGuess
				while (nextGuess > highGuess)
				{
					//Initiate do-while loop
					do
					{
						System.out.print("Highest number is 100! Try again!");
						nextGuess = keyboard.nextInt();
						
						//while nextGuess is greater than highGuess
					} while (nextGuess > highGuess);
				}
				
				//Initiate an if-statement for if nextGuess is greater than randNum
				if (nextGuess > randNum) 
				{
					//Set highGuess equal to nextGuess
					highGuess = nextGuess;
					
					//Call getCount method to print number of guesses
					System.out.print("Number of guesses is "+RNG.getCount());
					
					System.out.print("\nYour guess is too high\n");
					
					//Call inputValidation from RNG class to print your next 
					//  guess must be between lowGuess and highGuess
					RNG.inputValidation(nextGuess, lowGuess, highGuess);
					
					//Read in the line that the user types
					nextGuess = keyboard.nextInt();
					
					//Initiate a while loop when nextGuess is greater than highGuess
					while (nextGuess > highGuess)
						
						//Initiate a do-while loop
						do 
						{
							System.out.print("Guess must be between "+lowGuess+" and "
											+highGuess);
							nextGuess = keyboard.nextInt();
							
							//While nextGuess is greater than highGuess
						} while (nextGuess > highGuess);
			
				}
				
				//Initiate a while loop when nextGuess is lesser than lowGuess
				while (nextGuess < lowGuess)
				{
					//Initiate do-while loop
					do
					{
						System.out.print("Lowest number is 0! Try again!");
						nextGuess = keyboard.nextInt();
						
						//While nextGuess is lesser than lowGuess
					} while (nextGuess < lowGuess);
				}
				
				//Initiate and If-statement for if nextGuess is lesser than randNum
				if (nextGuess < randNum)
				{
					//Set lowGuess equal to nextGuess
					lowGuess = nextGuess;
					
					//Call getCount method to print number of guesses
					System.out.print("Number of guesses is "+RNG.getCount());
					System.out.print("\nYour guess is too low\n");
					
					//Call inputValidation from RNG class to print your next 
					// guess must be between lowGuess and highGuess
					RNG.inputValidation(nextGuess, lowGuess, highGuess);
					nextGuess = keyboard.nextInt();
					
					//Initiate a while loop when nextGuess is lesser than lowGuess
					while (nextGuess < lowGuess)
						//Initiate a do-while loop
						do
						{
							System.out.print("Guess must be between "+lowGuess+" and "
											+highGuess);
							nextGuess = keyboard.nextInt();
							
							//While nextGuess is lesser than lowGuess
						} while (nextGuess < lowGuess);
				}
					
			}
			
			//Initiate an if-statement for if nextGuess is equal to randNum
			if (nextGuess == randNum)
			{
				System.out.print("Congratulations, you guessed correctly");
				System.out.print("\nTry again? (Type 1 for yes"
						+ " or 0 for no)");
				
				//Read in the line that the user type
				res = keyboard.nextInt();
				
				//Initiate nested if-statement for if res is greater than 1 or lesser than 0
				if (res > 1 || res < 0)
				{
					do {
					System.out.print("Response must be 1 or 0!");
					res = keyboard.nextInt();
					} while (res < 0 || res > 1);
				}
				
				//Initiate another nested if-statement for if res is equal to 0
				if (res == 0)
				{
					System.out.print("\n\nThanks For Playing!\n");
					
					//Print programmer’s name
					System.out.print("Programmer: Sokha Heng\n\n\n");
					
					//Call exit method to end
					System.exit(0);
				}
			}
		
	
			//While res is equal to 1
		} while (res == 1);
		
		//Call main method to restart the program.
			main(args);
			
			
		}
	}
