
public class Employee implements java.io.Serializable{
	
	public String name;
	public int age;
	public String address;
	public String Occupation;
	public int jobNumber;
	
	public void identityCheck(){
		System.out.println("New Employee details include the following information:\n " + "Name:" + name + "\nAge:" 
	+ age + "\nAddress:" + address + "\nOccupation:" + Occupation + "\nJob Number:" + jobNumber);
	}
}
