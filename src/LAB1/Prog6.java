package LAB1;

public class Prog6 {
	
	public static void main(String[] args) {
		String[] arg = {"horse","horse","dog","cat","horse","dog","horse","dog","elephant"};
		int count;
		String array[] = new String[10];
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
