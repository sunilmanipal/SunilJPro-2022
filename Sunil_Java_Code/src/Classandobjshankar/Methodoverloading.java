package Classandobjshankar;

public class Methodoverloading {
	//method overloading

	public int sum(int x,int y,int z)
	{
		return x+y+z;
	}
	public double sum(double p, double q, double r)
	{
		return p+q+r;
	}
	public String sum(String a,String b, String c)
	{
		return a+b+c;
	}
	

	public static void main(String[] args) {
		Methodoverloading ml = new Methodoverloading();
		System.out.println("Sum of Integers is:"+ml.sum(1,2,3));
		System.out.println("Sum of Double is:"+ml.sum(2.3,3.4,4.5));
		System.out.println("Sum of Strings is:"+ ml.sum("San","tho","sh"));
		
	}

}
