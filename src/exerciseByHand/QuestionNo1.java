package exerciseByHand;

import java.util.Scanner;

public class QuestionNo1 {
	
	public static void main (String[] args)
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age:");
		String Age = sc.nextLine();
		age=Integer.parseInt(Age);
		
		// using jf .... else
		String socialSecurityStatus1;
        if(age > 65)
        	 socialSecurityStatus1 = "eligible";
        
        else 
        	 socialSecurityStatus1 = "ineligible";
        
        System.out.println("your Social Security Status is "+ socialSecurityStatus1);
        
        //using ternary operator
        String socialSecurityStatus2;
        socialSecurityStatus2 = (age>65)? "eligible" : "ineligible";
        System.out.println("your Social Security Status is "+ socialSecurityStatus2);

	}
	

}
