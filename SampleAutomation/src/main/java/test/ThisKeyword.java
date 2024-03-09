package test;

public class ThisKeyword {

	
	
	String val;
	int a;
	String b;
	public void method(String val)
	{
		this.val=val;
		System.out.println("This is non static method");
		
		
	}
	public void method1()
	{
		
		System.out.println("this is second method");
		this.method("dhara");
		
	}
	
	//Constructor
	public ThisKeyword()
	{
		this(1);
		System.out.println("this is constructor");
	}
	
	public ThisKeyword(int a)

	{
		this("manikutty");
		this.a=a;
	
		System.out.println("this is second keyword");
		
	}
	
	public ThisKeyword(String b)
	{
		this.b=b;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj =new ThisKeyword();
		obj.method1();
	
		

	}

}
