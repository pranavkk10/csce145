//Pranav Kanumuri
import java.util.Scanner;
public class Lab04 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Books;
		Scanner key=new Scanner(System.in);
		
		System.out.println("How many books did you purchase at BN booksellers this month?: ");
		
		Books=key.nextInt();
		
		String points=" ";
		
		if (Books<0) {
			System.out.print("Invalid value entered! Exiting the program!");
			System.exit(0);
		}
		
		switch(Books) {
		case 0:
			points="You have not earned any points yet. Make a book purchase to start earning points!";
			break;
		case 1:
			points="Congratulations!!! You have earned 5 points!\n"
					+ "You may redeem these points on your next book purchase!";
			break;
		case 2:
			points="Congratulations!!! You have earned 15 points!\n"
					+ "You may redeem these points on your next book purchase!";
			break;
		case 3:
			points="Congratulations!!! You have earned 30 points!\n"
					+ "You may redeem these points on your next book purchase!";
			break;
		default:
			points="Congratulations!!! You have earned 60 points!\n"
				+ "You may redeem these points on your next book purchase!";
			break;
			 
		}
		System.out.println(points);
	}

}
