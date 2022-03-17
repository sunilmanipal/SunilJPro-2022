package ShankarSimpleja;

public class Third3 {

	public static void main(String[] args) {
		int marks[] = {56,78,98,65,45};
		int i,sum=0;
		double average =0.0;
		for(i=0;i<5;i++)
		{
			sum+=marks[i];
		}
		average = sum /5;
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+average);

	}

}
