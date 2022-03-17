package BasicProgramFirst;

import java.util.Scanner;

public class Eight8 {

	public static void main(String[] args) {
		int i=3;
		
		//Directly pass the value or pass it through Scanner
		
//		System.out.println("Input the Number to find out odd or Even");
//		Scanner in = new Scanner(System.in);
//		int i = in.nextInt();
//		
		
		
		/*	if(i%2==0)
				System.out.println("print even number");
			if(i%2!=0)
				System.out.println("this is odd number");
	*/
		
			/*if(i%2==0)
			System.out.println("this is even number");
			else
				System.out.println("this is odd number");*/
			
		//Even Number are 0, 2, 4, 6, or 8
		//odd number are 1, 3, 5, 7, or 9
		
			if(i==0)
				System.out.println("Nothing");
			else if(i%2==0)
				System.out.println("This is even number");
			else
				System.out.println("This is odd numbers");

	}

}
