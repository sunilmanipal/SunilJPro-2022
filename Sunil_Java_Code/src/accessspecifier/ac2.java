package accessspecifier;

public class ac2 {
	
	public int prod(int x, int y)
	{
	return x*y;	
	}
		
		public static void main(String[] args) {
			ac2 ase = new ac2();
			int q= ase.prod(4,5);
			System.out.println("The Product is "+q);
	        ac1 r = new ac1();
	        r.x=5;
	        r.y=10;
	        r.add(r.x, r.y);
	        System.out.println(ase.prod(r.x, r.y));
	        System.out.println(r.x);
	        System.out.println(r.y);
		}


}
