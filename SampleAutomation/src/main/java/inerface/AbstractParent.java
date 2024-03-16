package inerface;

public abstract class AbstractParent {

	public abstract void display(int a); //abstract
	
	public AbstractParent() //constructor
	{
		System.out.println("Constructor calling from parent");
	}
	public abstract void screeen(); //abstract
	public void error()    //non static
	{
		System.out.println("error");
	}
	public static void  report()//static

	{
		System.out.println("report from parent class");
	}

}
