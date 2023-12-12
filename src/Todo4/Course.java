package Todo4;

public class Course {
	 private int courseID;
	 private String  title;
	 private int duration;
	 private String provider;
	 private int fees;
	 
	 public Course() {
		 
	 }
	public Course(int courseID, String title, int duration, String provider, int fees) {
		
		this.courseID = courseID;
		this.title = title;
		this.duration = duration;
		this.provider = provider;
		this.fees = fees;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
}
