//Pranav Kanumuri 
import java.util.Scanner;
import java.util.Random;

public class Homework2 {
	public static final int Max=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		
		System.out.println("Welcome to choose your own Adventure Game");
		System.out.println("You are walking on the way back to school and you suddenly get transported to a mysterious forest");
		System.out.println("What should you do?");
		System.out.println("1.Explore the forest");
		System.out.println("2.Stay put");
		//This stores the value that user chooses
		int Choice1=key.nextInt();
		
		if(Choice1==1)
		{
			System.out.println("You start to roam around the forest");
			System.out.println("You see an abandoned house");
			System.out.println("What should you do?\n1.Go explore the house\n2.Ignore the house and keep on exploring");
			
			int Choice2=key.nextInt();

			if(Choice2==1)
			{
				System.out.println("You go into the house");
				System.out.println("You find three items which one will you choose?\n"
						+ "1.A mystery box\n2.A remote with a big red button\n3.A map of the forest");
				
				int Choice3=key.nextInt();
				
				if(Choice3==1) {
					System.out.println("You chose mysterybox, but it released a toxic gas that leaves you paralyzed forever");
					System.exit(0);
				}
				else if(Choice3==2) 
				{
					System.out.println("You chose the remote with a big red button and you click the button and miraculously you get transported back to house");
					System.exit(0);
					}
				else if(Choice3==3)
				{
					System.out.println("You chose a map of the forest now you are able to navigate out of the forest");	
					System.out.println("You succesfully navigate yourself out of the forest and now you are safe from any danger");
					System.exit(0);
				}
			}
			if(Choice2==2) {
				System.out.println("You ignore the house and continue to explore, but unfortunately you run into a creature that eats you");
				System.exit(0);
			}
			

		}
		
		 if(Choice1==2)
		{
			System.out.println("You decide it's best to stay put");
			System.out.println("Out of the corner of your eye you see an creature approach you");
			System.out.println("What should you do?\n1.Run away\n2.Stay where you are");
		}
		int Choice4=key.nextInt();
		
		if(Choice4==2)
		{
			System.out.println("Unfortunately the creature was hungry and ate you");
			System.exit(0);
		}
		else if(Choice4==1)
		{
			System.out.println("You run away as fast you can from the creature and while running you spot a building that looks like a safehouse");
			System.out.println("You run to the building and suddenly you hear an automated voice");
			System.out.println("Welcome to Rick's safe house. Please state your age: ");
			int age=key.nextInt();
			//This is a numeric comparison that allows if your 15 or older to access to the safe house 
			if(age<15)
			{
				System.out.println("Sorry you are to young to access this building");
				System.out.println("Unfortunately while you were doing this the creature catches up and eats you");
				System.exit(0);
			}
			else 
			{
				System.out.println("You are able to enter this building now please enter the password on the keypad");
				//This creates a random number generator which is used to solve the pass code 
				Random r=new Random();
				
				int secretNumber=r.nextInt(Max);		
				
				System.out.println("Enter a passcoded between the values 0 and 99. Can you guess it?");
				
				boolean correctGuess=false;
				
				while(correctGuess==false)
				{
					System.out.println("Enter your guess: ");
					int guess=key.nextInt();
					
					if(guess>99 || guess<0) 
					{
						System.out.println("Invalid value entered!");
						System.exit(0);
					}
					if(guess<secretNumber)
					{
						System.out.println("Your guess is too low! Pick a larger value!");
					}
					else if(guess>secretNumber)
					{
						System.out.println("Your guess is too high! Pick a smaller value!");
					}
					else if(guess==secretNumber)
					{
						System.out.println("Your guess is correct!!!");
						correctGuess=true;
					}
					else
					{
						System.out.println("Invalid value entered");
					}
				}
				System.out.println("You enter the safe room and escape the creature!");
								

			}//This is a bunch of else if statements that contains choices the user can make and the choice's results 
			System.out.println("You explore the safe house and find 3 things\n1.A remote with a button\n2.A mysterious blue door that needs a passcode to open\n3.A mysterious red door that you can open freely\n4.Don't touch anything and stay put");
			int Choice5=key.nextInt();
			
			if(Choice5==1)
			{
				System.out.println("You click the button, but unfortunately that activates the booby traps");
				System.exit(0);
			}

			if(Choice5==2)
			{
				//This my String Comparison 
				System.out.println("An automated voice comes on");
				String response = key.next();

				if(response.equalsIgnoreCase("answer")) 
				{
					System.out.println("If you want to enter this door please answer this problem: 10+11");
					int answer=key.nextInt();
					
					int Passcode=21;
					
					if(answer==Passcode) 
					{
						System.out.println("You go through the blue door and it magically transports you back to your house");
						System.exit(0);
						
					}
					else
					{
						System.out.println("Wrong!!! You must be punished");
						System.out.println("The booby traps activate");
						System.exit(0);
					}
					
				}
				else {
					System.out.println("Invalid Response. Try again");
				}
				
				
				}
			else if(Choice5==3)
			{
				System.out.println("You go through the red door and it takes you outside, but unfortunately the creature is waiting for you outside the door and you get eaten");
				System.exit(0);
			}
			else if(Choice5==4)
			{
				System.out.println("You decide to be cautious and not touch anything, but unfortunately for you after waiting for 10 minutues\n a 70 foot creature was taking a stroll "
						+ "and stomps on the safe house ");
				System.exit(0);
			}

		}
		
		

	}

}
