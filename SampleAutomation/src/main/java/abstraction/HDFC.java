package abstraction;

public class HDFC implements RBI {
	public void rd(double amount,int duration)
	{
		System.out.println("Total amount: "+amount*(1+interestRate*duration));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj = new HDFC();
		obj.rd(1000,9);
	}
}
