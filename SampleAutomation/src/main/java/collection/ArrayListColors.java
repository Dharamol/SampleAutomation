package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListColors {

	public static void main(String[] args) {

ArrayList<String> obj = new ArrayList<String>();
obj.add("plant");
obj.add("flower");
obj.add("buds");
obj.add("fruits");
obj.add("leaf");
 System.out.println(obj.get(3));
 Iterator<String> a =obj.iterator();
 while (a.hasNext())
 {
	 System.out.println(a.next());
 }
 



	}

}
