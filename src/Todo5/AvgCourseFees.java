package Todo5;

public class AvgCourseFees implements CourseInfoProcessor {
int count;
float avg;
	@Override
	public float processCourseInfo(Course[] data, CourseInfo ci) {
		for(Course Coursetype:data) {
			if((Coursetype.getProvider().equals(ci.getProviderName()))&& Coursetype.getDuration()== ci.getDuration()) {
				count++;
				avg+=Coursetype.getFees();

		 }
		}
		return (avg/count);
	
		
	}

}
