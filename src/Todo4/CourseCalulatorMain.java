package Todo4;

public class CourseCalulatorMain {
	
	public static void main(String args[]) {
		   Course c1=new Course(1,".Net",500,"udemy",10000);
		   Course c2=new Course(2,"Java",100,"Functionup",3000);
		   Course c3=new Course(3,"HTML",200,"onlineHtml",500);
		   Course c4=new Course(4,"Web",1000,"udemy",1500);
		   Course c5=new Course(5,"Javascript",300,"javapoint",700);
		   
		   Course[] CourseList= {c1,c2,c3,c4,c5};
		   
		   CourseDataCalculator duration=new AvgDuration();
		 
		    float a = duration.doCalculation(CourseList);
		   System.out.println("AverageDuration is: "+a);
		   
		   CourseDataCalculator fees = new AvgFees();
		   float b = fees.doCalculation(CourseList);
		   System.out.println("AverageFees is: "+b);
	}	
}
