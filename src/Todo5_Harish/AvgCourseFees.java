package Todo5_Harish;

public class AvgCourseFees implements CourseInfoProcessor {
	
	@Override
	public float processCourseInfo(Course[] CArr, CourseInfo cf) {
		// TODO Auto-generated method stub
		int count=0;
		float Total=0;
		for(int i=0;i<CArr.length;i++) {
			CourseInfo info=new CourseInfo(CArr[i].getProvider(),CArr[i].getDuration());
			if(info.equals(cf)) {
				Total+=CArr[i].getFees();
				count++;
			}
		}
		return (Total/count);
	}

}
