package exception;

public class ExceptionSample {

	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		double c;
	//	System.out.println("hi");
		try
		{
			c=a/b;
		}
	catch(ArithmeticException variable)
	{
		System.out.println("Exception occured, please skip"+variable);
		}
		
		//System.out.println(c);
//		finally
//	
//		{
//			System.out.println("Exceptions checked");
//		}
	System.out.println("Result");
		// TODO Auto-generated method stub

	
	}
}
