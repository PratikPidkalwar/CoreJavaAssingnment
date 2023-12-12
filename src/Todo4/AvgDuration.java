package Todo4;

public class AvgDuration extends CourseDataCalculator {

	public float doCalculation(Course[] allCourses) {
		int totalDuration=0;
		int size=allCourses.length;
		for(int duration=1;duration<size;duration++) {
			totalDuration = totalDuration + allCourses[duration].getDuration();
		}
		int avgD=totalDuration/size;
		return avgD;
	
	}

}
