package exerciseByHand;

import java.util.Scanner;

public class QuestionNo3 {

	public static void main(String[] args) {
		
		
		// Question 3 a
		float r; // radius of circle
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius of circle:");
		r=sc.nextFloat();
		final double pi= Math.PI;
		double A = pi*r*r; //  calculate area if circle
		System.out.println("Area of circle is : " + A);
		
		
		// Question 3 b
		
		int length, breadth;
		System.out.print("enter length and breadth :");
		length = sc.nextInt();
		breadth = sc.nextInt();
		double diag = Math.sqrt((Math.pow(length, 2)+Math.pow(breadth, 2)));
		System.out.println("the length of diagonal is : "+ diag);
		sc.close();
		
	}
	
}
