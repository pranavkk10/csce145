//Pranav Kanumuri
import java.util.Scanner;
public class Lab02 {
	
	public static final double Acceleration=9.8;
	public static final double Value=0.5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("The initial velocity of the ball(in meters per second) at point A: ");
		
		double Velocity = key.nextDouble();
		
		System.out.println("How much time(in seconds) does the ball take to reach point B");
		
		double time = key.nextDouble();
		
		double v= Velocity+(Acceleration*time);
		
		double S=(Velocity*time)+Value*Acceleration*Math.pow(time,2);
		
		System.out.println("Final Velocity of the ball=" + v +" m/s" );
		System.out.println("Distance traveled by the ball(S)=" + S +" meters");
		
		
		
		

	}

}
