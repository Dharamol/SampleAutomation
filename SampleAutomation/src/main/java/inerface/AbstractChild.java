package inerface;

public class AbstractChild extends AbstractParent {

	@Override
	public void display(int a) {
		// TODO Auto-generated method stub
System.out.println(a);
	}

	@Override
	public void screeen() {
		// TODO Auto-generated method stub
System.out.println("parent class");
	}
	public AbstractChild()

	{
		System.out.println("child constructor");
	}
	public void childMethod()
	{
		System.out.println("child non static method");
	}
	public static void childMethod1()
	{
		System.out.println("child static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractParent obj = new AbstractChild();
		obj.display(8);  //abstract  method calling
		obj.screeen(); //abstract  method calling
		
		obj.error(); //non static method calling
		AbstractParent.report(); // static method form abstract class
		
//		obj.childMethod();
//		AbstractChild.childMethod1();
;	}

}
