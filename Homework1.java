//Pranav Kanumuri 
import java.util.Scanner;
public class Homework1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("What's your first name? ");
		
		String first = key.nextLine();
		
		System.out.println("What's your last name? ");
		
		String second=key.nextLine();
		
		System.out.println("What's would be your age at the end of the year(in years)? ");
		//I formatted the question this way so that it would accurately say the birth year of people born in September,October,November, and December
		int age=key.nextInt();
		
		System.out.print("What's your phone number (without dashes and parenthesis)? ");
		
		key.nextLine();
		//I had to add this because my code kept malfunctioning if I didn't have it and all this does is just help space out my code
		
		String phone=key.nextLine();
				
		System.out.print("What's your major? ");
								
		String major=key.nextLine();
		
		System.out.println("What year are you at USC? ");
		
		String year=key.nextLine();
		
		System.out.print("What's the date today(using the format mm/day/yyyy)? ");
		
		String date=key.nextLine();
		
		System.out.println("What's your favorite sports team? ");
		
		String sports=key.nextLine();
		
		System.out.println("What's your favorite food? ");
		
		String food=key.nextLine();
		
		System.out.println("What's your favorite color? ");
		
		String color=key.nextLine();
		//These are the 3 questions I added and the answers are stored through String sports,food, and color
		int BirthYear= 2024 - age;
		
		String Month=date.substring(0,2);
		//This helps capture the characters the user puts for month which then can be stored and be switched with day to make it European format
		String Day=date.substring(3,5);
		
		String Year=date.substring(6,10);
		
		String Areacode=phone.substring(0,3);
		
		String MiddleNumbers=phone.substring(3,6);
		
		String EndNumbers=phone.substring(6,10);	
		
		System.out.println("Here's a quick intro for "+ first+" "+ second + "\nYou were born in the year "+ BirthYear+". In your free time you love to watch "
		+ sports +" and you love to eat "+food+". \nYour favorite color is "+color+". You are a "+year+" at USC majoring in "+major+
		". You can be reached at "+"("+Areacode+")"+MiddleNumbers+"-"+EndNumbers+". \nYou are now officially a gamecock!"+
		"\nLast updated:"+ Day+"."+Month+"."+Year);
		//This combines all my code and prints out a paragraph of whatever is listed in the code 
		
				
	}

}
