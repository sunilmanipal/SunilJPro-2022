package Constructor;

class Calc
{
	int num1;
	int num2;
	int result;
	public void perform()
	{
		result = num1 + num2;
	}
}
public class onep {
public static void main(String[] args) {
		
		//first i have to create an obj for the class
		Calc obj = new Calc();
		obj.num1=9;
		obj.num2=5;
		obj.perform();
		System.out.println(obj.result);
		
	}

}
