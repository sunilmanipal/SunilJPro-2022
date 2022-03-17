package BasicProgramFirst;

public class Seventh7 {

	public static void main(String[] args) {
		int a=4;
		int b=4;
		//a = a+b; //same thing can be done in different way 
		//a+=b; //this is same as adding a and b as above line
		//if i want to add some number to a then
		//a+=2;
		//a+=1;
		//a++; //is the post increment of the value
		//++a; //is the pre increment of the value;
		//a=++b;  //it will increment the value and print 
		
		a=b++; //it will first assign the value to the varibale and then increment the value 
		
		System.out.println(a);
	}

}
