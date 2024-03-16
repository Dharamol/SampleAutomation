package encapsulation;

public class PinsetParent {

	private int pin;
	public void setPin(int pin)
	{
	this.pin =pin;	
	System.out.println(pin);
	}
	public void validate()
	{
		switch(pin)
		{
		case 1001:
			System.out.println("Correct one");
			break;
		case 1234:
			System.out.println("Correct one");
			break;
		case 1212:
			System.out.println("correct pin");
			break;
		default:
			System.out.println("Invalid pin");
		}
	}
}
