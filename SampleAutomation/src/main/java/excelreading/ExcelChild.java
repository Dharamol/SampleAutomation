package excelreading;
import java.io.IOException;
public class ExcelChild {

	
	



		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			String o =ExcelRead1.getStringData(1,0);
			System.out.println(o);
			String i=ExcelRead1.getIntegerData(1,1);
			System.out.println(i);
			
		}
}
