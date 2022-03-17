package accessmodifier;

class use {

	final int a = 4;
	final String name = "Sunil";
	
	 void sayHello()
	{
		System.out.println("Hello1");
	}
	 
}
public class useFinal {
	void sayHello()
	{
		System.out.println("Hello2");
	}
	
	public static void main(String[] args) {
		useFinal uf = new useFinal();
		uf.sayHello();
			
		use u = new use();
		u.sayHello();
		
	}

}
