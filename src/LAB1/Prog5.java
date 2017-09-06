package LAB1;

import java.util.Scanner;

public class Prog5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a string:");
		String a = sc.nextLine();
		
		
		// 2.a reverse the string
		System.out.print("The reverse string is:");
		for(int i=a.length()-1;i>=0;i--)
		{
		 
		 System.out.print(a.charAt(i));
		}
		
		// 2.b find the number of 'x'
		int count =0;
		char b;
		for(int i=1; i<a.length(); i++)
		{
			b = a.charAt(i);
			if (b == 'x')
				count ++;
			
		}
		System.out.println("\n\nThe number of 'x' in the input string is :" + count);
		sc.close();
	}
}
