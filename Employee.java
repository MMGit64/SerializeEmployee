
public class Employee implements java.io.Serializable{
	
	public String name;
	public int age;
	public String address;
	public String Occupation;
	public int jobNumber;
	
	public Employee(String name, int age, String address, String Occupation, int JobNumber){
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.Occupation = Occupation;
		this.jobNumber = JobNumber;
	}
}
