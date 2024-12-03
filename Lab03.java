//Pranav Kanumuri 
import java.util.Scanner;
public class Lab03 {
	public static final int Value=99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		
		System.out.println("Enter the total number of packages ordered: ");
		
		int Package=key.nextInt();
				
		if(Package < 0)
		{
			System.out.println("Invalid Value for package count!Exiting program");
			System.exit(0);
		}
		double BeforeDiscount= Package*Value;
		
		Double Discount=0.0;
		
		if(Package >=10 && Package < 20)
		{
			Discount=0.2;
		}else if(Package >= 20 && Package <50)
		{
			Discount=0.3;
		}else if(Package >= 50 && Package < 100) {
			Discount=0.4;
		}else {
			Discount=0.5;
		}
		double DiscountAmount=Discount*BeforeDiscount;
		double BillAfterDiscount= BeforeDiscount-DiscountAmount;
		
		System.out.println("Total Bill Amount(before discount)= $"+BeforeDiscount);
		System.out.println("Amount of discount= $"+DiscountAmount);
		System.out.println("Total Bill Amount(after discount)= $"+BillAfterDiscount);
	


	}

}
