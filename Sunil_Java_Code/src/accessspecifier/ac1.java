package accessspecifier;

public class ac1 {
	
	int x, y;
	public void add (int a, int b)
	{ x=a; y =b;
	  	  System.out.println(x+y);
	}
	public static void main(String[] args) {
	  ac1 as = new ac1();
	  as.add(2, 3);
      
	}

}
