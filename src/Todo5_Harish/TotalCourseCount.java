package Todo5_Harish;

public class TotalCourseCount implements CourseInfoProcessor {
	int count;
	@Override
	public float processCourseInfo(Course[] CArr, CourseInfo cf) {
		// TODO Auto-generated method stub
		//CourseInfo info=new CourseInfo();
		for(int i=0;i<CArr.length;i++) {
			CourseInfo info=new CourseInfo(CArr[i].getProvider(),CArr[i].getDuration());

			if(info.equals(cf)) {
				count++;
			}
		}
		return count;
	}

}
