package labLevel3;


import java.util.Scanner;

public class QuestionNo3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		String input_string = sc.nextLine();
		//int n=0;
		System.out.println("Substrings of length 0 \n []");
		//String[] a = new String[input_string.length()]
		for(int i=0; i<input_string.length(); i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.println(input_string.substring(j, j+i));
			}
		}
		sc.close();
	}


}

	


