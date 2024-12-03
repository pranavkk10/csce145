//Pranav Kanumuri
import java.util.Scanner;
public class Homework4 {
	public static final double Pi=3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		
		int Radius=0;
		//Sets the radius at 0
		boolean Amount=false;
		
		int Circles=0;
		//Sets the amount of circles at 0
		do {
			System.out.println("How many circles do you want to store?");
			
			Circles=key.nextInt();
			
			if(Circles<0)
			{
				System.out.println("Invalid amount entered. Please try again");
				System.out.println();
				
			}
			else if(Circles==0) {
				System.out.println("Cannot sort an empty list. Please try again");
				System.out.println();
			}
			else if(Circles>0)
			{
				Amount=true;
			}
			
		} while (Amount==false);
		
		double[]CirclesArray= new double[Circles];
		//Name of Array
		for(int i=0;i<CirclesArray.length;i++)
		{
			System.out.println("Enter the radius of the circle at index "+i+":");
			double radius=key.nextDouble();
			double radiusCalculations=Pi*(radius*radius);
			CirclesArray[i]=radiusCalculations;
		}
		
		System.out.println();
		System.out.println("Do you want your list sorted from smalles -> largest(1),or largest -> smallest(2)?(Enter a number)");
		
		int userResponse=key.nextInt();
		if(userResponse==1)
		{
			for(int i=0;i<CirclesArray.length;i++)
			{
				int minIndex=i;
				//This is the index with the smallest value
				double smallestRadius=CirclesArray[i];
				//This will then set the radius of whatever circle that is at index(0)
				for(int j=i+1;j<CirclesArray.length;j++)
				{
					if(CirclesArray[i]<smallestRadius)
					{
						smallestRadius=CirclesArray[j];
						minIndex=j;
					}
				}
				if(CirclesArray[i]>smallestRadius)
				{
					double temp=CirclesArray[i];
					CirclesArray[i]=CirclesArray[minIndex];
					CirclesArray[minIndex]=temp;
				}
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("List of area of circles provided(duplicates not included)");
			double[]uniqueValuesArray=new double[Circles];
			
			int[]count=new int[CirclesArray.length];
			
			for(int i=0;i<CirclesArray.length;i++)
			{
				count[i]=1;
				
				for(int j=0;j<CirclesArray.length;j++)
				{
					if(CirclesArray[i]==CirclesArray[j])
					{
						count[i]++;
						count[j]=0;
					}
				}
			}
			
			for(int i=0;i<count.length;i++) 
			{
				if(count[i]==1) {
					uniqueValuesArray[Radius]=CirclesArray[i];
					Radius++;
				}
			}
			System.out.println("Unique Values of Array Entered");
			
			for(int k=0;k<Radius;k++)
			{
				System.out.print(uniqueValuesArray[k]);
				
				if(k<Radius) {
					System.out.println(",");
				}
			}
			if(userResponse==2)
			{
				for(int i=0;i<CirclesArray.length;i++)
				{
					int maxIndex=i;
					double largestRadius=CirclesArray[i];
					
					for(int j=i+1;j<CirclesArray.length;j++)
					{
						if(CirclesArray[j]>largestRadius)
						{
							largestRadius=CirclesArray[j];
							maxIndex=j;
						}
						
						if(CirclesArray[i]<largestRadius)
						{
							double temp=CirclesArray[i];
							CirclesArray[i]=CirclesArray[maxIndex];
							
							CirclesArray[maxIndex]=temp;
						}
					}
				}
				
				double[]uniqueValuesArray1=new double[Circles];
				
				for(int i=0;i<CirclesArray.length;i++) {
					boolean notUnique=false;
					
					for(int j=0;j<Radius;j++)
					{
						if(uniqueValuesArray[j]==CirclesArray[i])
						{
							notUnique=true;
							break;
						}
					}
					if(notUnique==false)
					{
						uniqueValuesArray[Radius]=CirclesArray[i];
						Radius++;
					}
				}
				double[]newCirclesArray=new double[Radius];
				
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("List of area of circles provided(duplicates not included)");
				
				for(int i=0;i<Radius;i++)
				{
					newCirclesArray[i]=uniqueValuesArray[i];
				}
				System.out.println();
				
				for(int i=0;i<CirclesArray.length;i++)
				{
					System.out.print(newCirclesArray[i]+"");
				}
				System.out.println();
				System.out.println();
				System.out.println("System sorting over. Exiting Program");
				System.exit(0);
				
				
			}
			else if(userResponse!=1 && userResponse !=2)
			{
				System.out.println();
				
				System.out.println("Inavlid number entered. Please pick between options (1,2). Exiting Program");
				
				System.exit(0);
			}
			
			}

	}

}
