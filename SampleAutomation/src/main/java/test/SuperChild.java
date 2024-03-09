package test;

public class SuperChild extends SuperParent {
	
	
	public void method1(int a)
	{
		super.a=a;
		super.method();
	}
	public SuperChild()
	{
		//super();
		System.out.println("to know parent constructor got called or not");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperParent obj = new SuperChild();
		obj.method();
		SuperChild obj1 = new SuperChild();
		obj1.method1(0);
	}

}
