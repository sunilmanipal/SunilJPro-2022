package Classandobjshankar;

import accessspecifier.ac3;

public class Greeting {
	public void go()
	{
		System.out.println("Welcome to the Classes and Objects");
	}
	public static void main(String[] args) {
		Greeting g = new Greeting();
		g.go();
		ac3 t = new ac3();
		t.setName("Karthik the Great");
		System.out.println(t.getName());
		System.out.println(g.hashCode());
		System.out.println(g.getClass().getName());
		System.out.println(g.toString());
		Greeting g1 = new Greeting();
		System.out.println(g1.hashCode());
		System.out.println(g.equals(g1));
		Greeting g2;
		g2 = g1;
		System.out.println(g2.equals(g1));
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
       
	}

}
