package ClassandObject;

public class classobj2 {

	public static void main(String[] args) {
		classobj1 co = new classobj1(); //knows something and does something
		co.n1=85; //define the value
		co.n2=5; //define the value
		co.testcase1(); //This is to execute the method present in the class
		System.out.println(co.res); //fetch the added result
	}

}
