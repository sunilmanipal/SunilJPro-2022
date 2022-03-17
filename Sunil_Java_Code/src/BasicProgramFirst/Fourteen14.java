package BasicProgramFirst;

import java.util.Scanner;

public class Fourteen14 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and column ");
		int row = sc.nextInt();
		int column = sc.nextInt();
		int i,j;
		for( i=1;i<=row;i++)
		{
			for( j=1;j<=column;j++)
			
				if((i==1 || i==column) || (j==1||j==column))
				
				System.out.print("*");
				else
					System.out.print(" ");
				
			
				System.out.println();
		}
	}

}
