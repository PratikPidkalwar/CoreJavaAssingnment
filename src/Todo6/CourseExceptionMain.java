package Todo6;

public class CourseExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String position="CDAC";
        try {
			CourseCollection.getCourse(position);
		} catch (ProviderNotFound e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());	
		}
	}

}
