package exception;

public class ThrowSample {
	public void method()
	{
		String age ="age";
		if(age =="age")
		{
			throw new ArithmeticException("Hi exception");
		}
		else
		{
			System.out.println("Eligible for Higher secondary");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowSample obj = new ThrowSample();
		obj.method();
		
	}
}
