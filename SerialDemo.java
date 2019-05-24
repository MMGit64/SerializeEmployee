import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class SerialDemo{
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "Jacob Peters";
		e.age = 39;
		e.address = "445 Mount Eden Road, Mount Eden, Auckland";
		e.Occupation = "Risk Analyst";
		e.jobNumber = 23984;
		
		try {
			
			FileOutputStream fos = new FileOutputStream("/tmp/employee.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.close();
			fos.close();
			System.out.printf("Serialized data is the following: /tmp/employee.ser");
		}
		catch (IOException e1){
			e1.printStackTrace();
		}
		
	}
}