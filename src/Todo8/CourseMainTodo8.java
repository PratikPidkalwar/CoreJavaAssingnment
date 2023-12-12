//TODO 8:
//		Create a file course_data.txt and fill the information into that file as per the format given below:
//		<ID>:<Title>:<Provier>:<Duration>:<Fees>
//		
//		E.g.
//		101:Core Java:Udemy:50:5500
//		
//		Write a program that reads the data from this file line by line, converts that data available in that line into
//		Course object and directly prints that object.



package Todo8;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Todo9.Course;

public class CourseMainTodo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="./src/Todo8/course.txt";
		
		try(FileReader fr=new FileReader(filePath);
				BufferedReader br=new BufferedReader(fr)) {
			while(true) {
			String line=br.readLine();		
			
			if(line==null)
				break;
			String[] str=line.split(":");
			int courseID=Integer.parseInt(str[0]);
			String title=str[1];
			String provider=str[2];
			int duration=Integer.parseInt(str[3]);
			int fees=Integer.parseInt(str[4]);
						
			Course[] arr=new Course[5];
			int index=0;
			
				arr[index]=new Course(courseID,title,duration,provider,fees);
				System.out.println(arr[index].toString());
					index++;
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
