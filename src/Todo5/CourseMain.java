package Todo5;

//import Todo4.Course;

public class CourseMain {

	public static void main(String[] args) {
		
		 Course c1=new Course(1,".Net",500,"udemy",10000);
		   Course c2=new Course(2,"Java",100,"Functionup",3000);
		   Course c3=new Course(3,"HTML",200,"onlineHtml",500);
		   Course c4=new Course(4,"Web",1000,"udemy",1500);
		   Course c5=new Course(5,"Javascript",300,"javapoint",700);
		   
		   Course[] course= {c1,c2,c3,c4,c5};
		   
		   CourseInfo cf=new CourseInfo("udemy",500);
		  
		   
		   TotalCourseCount tcc=new TotalCourseCount();
		   //tcc.processCourseInfo(course, cf);
		   
		   AvgCourseFees acf=new AvgCourseFees();
		   
		   System.out.println(tcc.processCourseInfo(course, cf));
		   System.out.println(acf.processCourseInfo(course, cf));
	}

}
