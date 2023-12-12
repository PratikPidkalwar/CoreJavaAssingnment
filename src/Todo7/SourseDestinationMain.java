package Todo7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SourseDestinationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFile=String.valueOf(args[0]);
		String destinationFile=String.valueOf(args[1]);
		
		//file write into sourseFile
		try(FileOutputStream fos=new FileOutputStream(sourceFile)) {
			String str="Hello World";
			byte[] arr=str.getBytes();
			fos.write(arr);
			System.out.println("Data write successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//file read into sourse and pass destination
		try(FileInputStream fis=new FileInputStream(sourceFile);
				BufferedInputStream bis=new BufferedInputStream(fis);
				
				FileOutputStream fos=new FileOutputStream( destinationFile);
				//BufferedOutputStream bos=new BufferedOutputStream(fos);
				
) {
			StringBuilder sb=new StringBuilder();
			while(true) {
				int data=bis.read();
				
				if(data==-1)
					break;
				char ch=(char)data;
				//System.out.println(ch);
				sb.append(ch);
			}
			String ch1=sb.toString();
			//System.out.println(ch1);
			byte[] arr=ch1.getBytes();
			fos.write(arr);
			System.out.println("data copied successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
