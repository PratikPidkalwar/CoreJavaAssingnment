package Todo4;

public class AvgFees extends CourseDataCalculator {

	
	public float doCalculation(Course[] allCourses) {
		int totalFees=0;
		int size=allCourses.length;
		for(int fees=1;fees<size;fees++) {
			totalFees = totalFees + allCourses[fees].getFees();
		}
		int avgF=totalFees/size;
		return avgF;
	}

}
