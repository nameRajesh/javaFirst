package LAB1;

public class Prog2 {
	public static void main(String[] args){
		
		float x=1.27f, y=3.881f, z=9.6f;
		
		// answer for 1a
		int cast = (int)(x+y+z);
		System.out.println("result after casting is :" + cast);
		
		// answer for 1b
		int round = (int) Math.round(x+y+z);
		System.out.println("result after rounding is :" + round);
	}

}
