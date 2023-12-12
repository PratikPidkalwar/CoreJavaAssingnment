package Todo10;

import java.util.HashMap;
import java.util.Map;

public class CourseDataCollection {
	private static Map<Integer, Course> allAvailableCourses=new HashMap<>();
	static {
		Course c1=new Course(1,"JAVA",200,"Uncadamy",1000);
		Course c2=new Course(2,"javascipt",300,"function",500);
		Course c3=new Course(3,"Html",100,"Html.point",500);
		Course c4=new Course(4,"css",50,"Css.point",400);
		
		allAvailableCourses.put(1, c1);
		allAvailableCourses.put(2, c2);
		allAvailableCourses.put(3, c3);
		allAvailableCourses.put(4, c4);
		
	}
}
