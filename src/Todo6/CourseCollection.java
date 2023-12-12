package Todo6;

import Todo9.Course;

public class CourseCollection {
	private static Course availableCourses[]=new Course[4];
	
	static {
		availableCourses[0] = new Course(101,"C++",80,"CDAC",10000);
		availableCourses[1] = new Course(102,"Python",85,"Udemy",5000);
		availableCourses[2] = new Course(103,"Java",100,"Coursera",15000);
		availableCourses[3] = new Course(104,"C#",38,"Udemy",5000);
	}
	public static void getCourse(String provider) throws ProviderNotFound {
		//int flag=0;
		int position=-1;
		int index=0;
		int size=availableCourses.length;
		for(int i=0;i<size;i++) {
			String providerName=availableCourses[i].getProvider();
			
			if(providerName.equals(provider)) {
				position= i;
				System.out.println(availableCourses[i].getCourseID() + " = "+availableCourses[i].getTitle() );
			}
		}
		if(position==-1) {
			String error="Provider not Available. Please Valid Provider.";
			ProviderNotFound pnf=new ProviderNotFound(error,provider);
			throw pnf;
		}
		
	}
}
