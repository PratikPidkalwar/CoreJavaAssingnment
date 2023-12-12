package Todo7;

import java.util.ArrayList;
import java.util.List;

public class TypeSafeCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countryNames=new ArrayList<>();
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("India");
		countryNames.add("India");
		
		countryNames.add("England");
		countryNames.add("South Africa");
		countryNames.add("New Zealand");
		countryNames.add("Sri Lanka");
		
		
		for(String obj:countryNames) {
			System.out.println(obj.toUpperCase());
		}
	}

}
