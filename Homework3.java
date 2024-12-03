//Pranav Kanumuri 
import java.util.Scanner;
import java.util.Random;
public class Homework3 {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		Random r = new Random();
		
		
		System.out.println("Let's play Rock, Paper, Scissors\n");
		
	
		int Human = 0;
		int Computer = 0;
		String keepgoing = "yes";
		
		
		while (keepgoing.equalsIgnoreCase("yes")) {
			
			for(int round = 1; round <= 3; round++) {
				
				System.out.println("Round " + round + ": What do you choose? ");
				
				String choice = key.nextLine();
				
				if (choice.equalsIgnoreCase("rock")) {
					//This assigns the integers 0,1,2 to rock,paper,and scissors
					int rps = r.nextInt(0,2);
					
					String computer = "";
					
					switch(rps) {
					case 0:
						computer = "rock";
						break;
					case 1:
						computer = "paper";
						break;
					case 2:
						computer = "scissors";
						break;
					}
					//This code helps set what the computer would do if the user chose rock 
					if (computer.equals("rock")) {
						
						System.out.println("The computer picked rock, you tied.\n");
						
						
					} else if (computer.equals("paper")) {
						
						System.out.println("The computer picked paper, the computer wins.\n");
						Computer++;
						
					} else if (computer.equals("scissors")) {
						
						System.out.println("The computer picked scissors, you win!\n");
						Human++;
				
					}
					
					
					
					
					
				} else if (choice.equalsIgnoreCase("Paper")) {
					
					int rps = r.nextInt(0,2);
					
					String computer = "";
					
					switch(rps) {
					case 0:
						computer = "rock";
						break;
					case 1:
						computer = "paper";
						break;
					case 2:
						computer = "scissors";
						break;
					}
					
					if (computer.equals("rock")) {
						
						System.out.println("The computer picked rock, you win!\n");
						Human++;
						
					} else if (computer.equals("paper")) {
						
						System.out.println("The computer picked paper, you tied\n");
						
					} else if (computer.equals("scissors")) {
						
						System.out.println("The computer picked scissors, the computer wins.\n");
						Computer++;

					} 
					
				} else if (choice.equalsIgnoreCase("Scissors")) {
					
					int rps = r.nextInt(0,2);
					
					String computer = "";
					
					switch(rps) {
					case 0:
						computer = "rock";
						break;
					case 1:
						computer = "paper";
						break;
					case 2:
						computer = "scissors";
						break;
					}
					
					if (computer.equals("rock")) {
						
						System.out.println("The computer picked rock, the computer wins.\n");
						Computer++;
						
					} else if (computer.equals("paper")) {
						
						System.out.println("The computer picked paper, you win!\n");
						Human++;
						
					} else if (computer.equals("scissors")) {
						
						System.out.println("The computer picked scissors, you tied.\n");
						
					}
						
				} else {

					System.out.println("Input Invalid, The computer wins.\n");
					Computer++;

				}
				
				if (Human >= 2) {
					break;
				} else if (Computer >= 2) {
					break;
				}

				
			}
			//If the user wins 2 games out of 3 then this will display that the user won 
			if (Human == 2) {

				System.out.println("You win the game!\n");
				
				//If the computer wins 2 games out of 3 then this will display that the computer won 
			} else if (Computer == 2) {

				System.out.println("\nThe computer wins the game.\n");

			} else {
				System.out.println("The game is a draw \n");
			}

			System.out.println("Do you want to play another game of rock, paper, scissors? Type \"yes\" to keep going and \"no\" to stop.");
			String rematch = key.nextLine();
			//This code makes it where if the user wants to play again the game will reset
			if (rematch.equalsIgnoreCase("yes")) {
				keepgoing = "yes";
				Human = 0;
				Computer = 0;
			} else if (rematch.equalsIgnoreCase("no")) {
				keepgoing = "no";
				System.out.println("\nThanks for Playing!");
				
			} else {
				System.out.println("Input invalid, system will exit.");
				System.exit(0);
			}

		
		}

	}

}
