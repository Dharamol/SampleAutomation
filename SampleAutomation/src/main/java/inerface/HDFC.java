package inerface;

public class HDFC implements bank{
	public void interest(int a)
	{
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		HDFC obj = new HDFC();
		obj.interest(10);
	}
}
