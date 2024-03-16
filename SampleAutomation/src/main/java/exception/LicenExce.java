package exception;

public class LicenExce {

	
	public void test(int no) throws LicenseException
	{
		if(no<=10)
		{
			throw new LicenseException("not eligible");
		}
		else{
			System.out.println("eligible");
		}
	}
	public static void main(String[] args) throws LicenseException {
		LicenExce obj = new LicenExce();
		obj.test(9);
	}
}
