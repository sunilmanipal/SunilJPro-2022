package BasicProgramFirst;

import java.util.Scanner;

public class Thirteen13 {

	public static void main(String[] args) {
		Scanner scn =new  Scanner(System.in);
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}

}
