package labLevel3;


import java.util.Scanner;

public class QuestionNo3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		String input_string = sc.nextLine();
		int count=1,c=0;
		for(int i=input_string.length();i>1;i--)
			count=count*i;
			
		System.out.println(count);
		String[] b = new String[count];
		int n=0;
		while(n<= input_string.length()) {
			if(n ==0) {
				System.out.println("[]");
				n++;
			}
			
			for(int j =0; j<input_string.length(); j++) {
				if(n+j <input_string.length()+1) {
					//b[c]=input_string.substring(j, n+j);
					c++;
					System.out.println(input_string.substring(j, n+j));
				}
				
			}
			
			n++;
		}
		System.out.println(c);
		//removedublicate(b,b.length);
		for(int i=0;i<b.length;i++)
		{
				System.out.print(b[i]+"  ");	
		}
		
		sc.close();
	}
	
	public static void removedublicate(String[] arg, int b ) {
		
		int count,c=1;
		for(int i=2;i<b;i++)
			c=c*i;
		String array[] = new String[c];
		int a=0;
		for(int i=0;i<arg.length;i++)
		{
			count=0;
			for (int j=0;j<i;j++)
			{
				if(arg[i]==arg[j])
				count++;
			}
			if(count==0)
			{
				array[a]=arg[i];
				a++;
			}	
			
		}
		
		
		for(int i=0;i<a;i++)
		{
				System.out.print(array[i]+"  ");	
		}
		
		
		
	}


}

	


