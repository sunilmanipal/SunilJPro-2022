package Classandobjshankar;

public class emp {
	int empno;
	String name;
	void assign(int x, String y)
	{
		empno=x; name=y;
	}
	void display()
	{
		System.out.println("The employee Number is "+empno);
		System.out.println("The employee Name is "+ name);
	}
	public static void main(String[] args) {
		emp e = new emp();
		e.assign(1001,"Arun Kumar");
		e.display();
		

	}


}
