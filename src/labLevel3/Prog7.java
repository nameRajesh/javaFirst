package labLevel3;

import java.util.Scanner;

public class Prog7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the table name: ");
		String table_name = sc.nextLine();
		System.out.print("\nEnter number of column names: ");
		String column_string = sc.nextLine();
		int column_number = Integer.parseInt(column_string);
		String array[] = new String[column_number];
		
		for (int i=1; i<=column_number; i++)
		{
			System.out.print("Enter column name:");
			
			array[i-1]=sc.nextLine();
			
		}
		System.out.print("\nEnter salary values: ");
		double salary = sc.nextDouble();
		
		System.out.print("\nSELECT ");
		for(int i=0; i< array.length;i++)
		{
			System.out.print(" "+array[i]);
			if(i!=array.length-1)
				System.out.print(",");
		}
		System.out.println("\nFROM " + table_name);
		System.out.println("WHERE salary>" +salary);
		
		sc.close();
		
	}

}
