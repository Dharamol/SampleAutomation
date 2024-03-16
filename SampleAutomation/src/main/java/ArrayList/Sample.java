package ArrayList;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
			ArrayList<String> obj1=new ArrayList<String>();
			obj1.add("pink");
			obj1.add("white");
			
			ArrayList<String> obj2=new ArrayList<String>();
			obj2.add("yellow");
			obj2.add("red");
			 obj1.addAll(obj2);
			 System.out.println(obj1);
	}

}
