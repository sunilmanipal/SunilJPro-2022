package accessspecifier;

public class ac4 {
	
	protected int deptno;
	protected String dname;
	
	void assign1(int c, String d)
		{
		deptno = c;
		dname = d;
		}
	void display()
	{
		System.out.println("Department Number"+deptno);
		System.out.println("Department Name"+dname);
	}

}
