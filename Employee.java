
public class Employee 
{
	int employeeID;
	String firstName;
	String lastName;
	byte age;
	String title;
	private double salary;
	String status;
	
	public Employee(int employeeID) 
	{
		this.employeeID = employeeID;
	}
	public int getEmployeeID() 
	{
		return employeeID;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public byte getAge() 
	{
		return age;
	}
	
	public void setAge(byte age) 
	{
		this.age = age;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		String replace = "";
		if(status.equalsIgnoreCase("p")) 
		{
			replace = status.replaceAll("p", "Part-time");
		}
		else if(status.equalsIgnoreCase("f")) 
		{
			replace = status.replaceAll("f", "Full-time");
		}
		else if(status.equalsIgnoreCase("s")) 
		{
			replace = status.replaceAll("s", "Salary");
		}
		else if(status.equalsIgnoreCase("c")) 
		{
			replace = status.replaceAll("c", "Comission");
		}
		else {replace = "undefined";}
		this.status = replace;
	}

	private void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	public void printEmployee() 
	{
		System.out.print(this.employeeID + "\t  " + this.firstName + "\t\t" + this.lastName + "\t\t" + this.age + "\t  " + this.title + "\t " + this.status + "\t  " + this.salary + "\n\n");
	}
}
