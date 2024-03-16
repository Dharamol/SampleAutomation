package Sample;

public class MultipleCatch {
	
	
	public static void method1(int a,String b)
	{
		
		 a=10;
		 b=null;
		
		 try {
			int c =a/0;
		int d=	b.length();
			System.out.println(d);
			
	}
		 catch(ArithmeticException ref)
		 {
			 System.out.println("Excetion occured");
		 }
		 catch(StringIndexOutOfBoundsException ref1)
		 {
			 System.out.println("String exception");
		 }
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleCatch.method1(1, null);
	}

}
