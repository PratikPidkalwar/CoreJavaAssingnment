//TODO 9:
//		Write a program that accepts input from user about the number of courses for which the data to be entered.
//		According to that build an array of Course objects with that dimension.
//		
//		Fill the array with Course objects where the information is accepted from user.
//		
//		Serialize the whole array into some file.
//		
//		Write another program to perform de-serialization and display all the course details.



package Todo9;

import java.util.Scanner;

public class CourseMain {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter number of object: ");
		int size=sc.nextInt();
		
		Course[] arr;
		arr = takeInputs(size);
		
		Serialize_Deserialize se = new Serialize_Deserialize();
		
		se.SerializeMethod(arr);
		
		
		se.De_SerializeMethod(size);
		
		
		
		
		
	}
	private static Course[] takeInputs(int size) {
		// TODO Auto-generated method stub
		
		Course[] arr=new Course[size];
		
		int j=0;
		while(j<size) {
			System.out.println("Enter course Id");
			int courseId=sc.nextInt();
			
			System.out.println("Enter Coursetitle: ");
			String coursetitle=sc.next();
			
			System.out.println("Enter duration: ");
			int duration=sc.nextInt();
			
			System.out.println("Enter Provider");
			String provider=sc.next();
			
			System.out.println("Enter Fees: ");
			int fees=sc.nextInt();
		
		
			arr[j] = new Course(courseId,coursetitle,duration,provider,fees);
			j++;
		}
		return arr;
	}
	
}