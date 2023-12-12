package Todo9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize_Deserialize {

	
	public void SerializeMethod(Course[] arr) {
		String pathFile= "./src/Todo9/Course99.txt";
		
		try(FileOutputStream fos=new FileOutputStream(pathFile);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
) {
			for(int i=0;i<arr.length;i++) {
			oos.writeObject(arr);
			}
			System.out.println("Successfully Serialize all the Object.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void De_SerializeMethod(int size) {
		String pathFile="./src/Todo9/Course9.txt";
		
		try(FileInputStream fos=new FileInputStream(pathFile);
				ObjectInputStream oos=new ObjectInputStream(fos);
) {
			for(int i=0;i<size;i++) {
			Object obj=oos.readObject();
			Course cc=(Course) obj;
			System.out.println(cc.toString());
			}
			
			System.out.println("\nSuccessfully De_Serialize all the Object.");
		} catch (IOException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ClassCastException e) {
			//e.printStackTrace();
			System.out.println("Deserialized Successfully");
			
		}
		
	}

}
