package Constructor;

public class constructorexp {
	
	int i;
	int j;
	int res;
	public constructorexp()
	{
		i=6;
		j=6;
		res = i+j;
		System.out.println(res);
	}
	
	//This is example of constructor overloading
	//i can have two constructor but with different variables
	public constructorexp(int k, int a, int output)
	{
		i=k;
		j=a;
	output = k+a;
		System.out.println(output);
	}

}
