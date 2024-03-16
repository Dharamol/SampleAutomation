package collection;

import java.util.*;



public class ArrayListclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("plant");
		obj.add("flower");
		obj.add("buds");
		obj.add("fruits");
		obj.add("leaf");
		 System.out.println(obj.get(3));
		// Iterator<String> a =obj.iterator();
//		 while (a.hasNext())
//		 {
//			 System.out.println(a.next());
//		 }
		 for(String tree:obj)
		 {
			 System.out.println(tree);
		 }
		 
		String q =obj.get(1);
		 System.out.println(q);
		 obj.set(0, "root");
		 System.out.println(obj);
		 
		Collections.sort(obj);
		System.out.println(obj);
	}

}
