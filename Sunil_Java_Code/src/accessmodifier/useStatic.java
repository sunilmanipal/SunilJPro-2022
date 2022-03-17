package accessmodifier;

public class useStatic {
	
	static int a = 3;
	  static int b;
	 
	 static {
		 System.out.println("Welcome to Multiple static Block");
	 }
	 static void meth(int x) {
	    System.out.println("x = " + x);
	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	  }
	 
	   
	  static {
	    System.out.println("This block executes before public static void main");
	    b = a * 4;
	  }
	   
	  public static void main(String args[]) {
	    meth(42);
	    useStatic.a = 5;
	    System.out.println(a);
	  }

}
