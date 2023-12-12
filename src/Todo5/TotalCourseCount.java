package Todo5;

public class TotalCourseCount implements CourseInfoProcessor {
	int count;
	@Override
	public float processCourseInfo(Course[] data, CourseInfo ci) {
		//int size=data.length;
//		int count=0;
		for(Course Coursetype:data) {
			if((Coursetype.getProvider().equals(ci.getProviderName()))&& Coursetype.getDuration()== ci.getDuration()) {
			count++;
		 }
		}
		return count;
	}

}
