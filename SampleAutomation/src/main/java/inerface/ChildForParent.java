package inerface;

public  class ChildForParent implements InterfaceParent,InterfaceParent1 {
	public void method() {
		System.out.println("First method calling from first parent");
	}
	public void method1(int val)
	{
		System.out.println(val);
	}
	public void method3()
	{
		System.out.println("first parent");
	}
	
	public  void method4()
	{
		System.out.println("hi");
	}
	
	public void parMethod()
	{
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		ChildForParent obj = new ChildForParent();
		obj.parMethod();
		obj.method4();
		obj.method3();
		obj.method1(a);
		obj.method();

	}
	

}
