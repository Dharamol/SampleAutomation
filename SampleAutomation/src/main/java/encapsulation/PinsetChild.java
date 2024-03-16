package encapsulation;

public class PinsetChild {

	public static void main(String[] args) {
		PinsetParent obj = new PinsetParent();
		obj.setPin(1001);
		obj.validate();
		} //Encapsulation works based on the Aggregation principle
	}


