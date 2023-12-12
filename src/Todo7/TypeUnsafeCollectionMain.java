package Todo7;

import java.util.ArrayList;
import java.util.List;

public class TypeUnsafeCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List countryNames=new ArrayList();
		
		countryNames.add("India");
		countryNames.add("England");
		countryNames.add("South Africa");
		countryNames.add("New Zealand");
		countryNames.add("Sri Lanka");
		countryNames.add(100.45f);
		
		for(Object obj:countryNames) {
			//System.out.println(obj);
			
			String str=(String)obj;
			System.out.println(str);
		}
	}

}
