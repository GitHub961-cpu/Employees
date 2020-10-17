import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{	
		int counter = 0;
		int ID;
		String fName;
		String lName;
		byte age;
		String t;
		String s;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many employees you want to enter? ");
		counter = input.nextInt();
		for(int x = 0; x < counter; x++) 
		{
			System.out.println("Enter employee's ID: ");
			Employee e = new Employee(ID = input.nextInt());
		
			System.out.println("Enter employee's first name: ");
			input.nextLine();
			e.setFirstName(fName = input.nextLine());
		
			System.out.println("Enter employee's last name: ");
			e.setLastName(lName = input.nextLine());
		
			System.out.println("Enter employee's age: ");
			e.setAge(age = input.nextByte());
			input.nextLine();
		
			System.out.println("Enter employee's title: ");
			e.setTitle(t = input.nextLine());
		
			System.out.println("Enter employee's status (enter P, F, S, C): ");
			e.setStatus(s = input.nextLine());
			
			displayMenu();
			e.printEmployee();
		}

	}
	
	public static void displayMenu() 
	{
		printSign(75);
		System.out.println("Employees ");
		printSign(75);
		System.out.print("ID\t First Name\t Last Name\t Age\t Title\t Status\t  Salary\n");
		printSign(75);
	}
	private static void printSign(int sign) 
	{
		for(int i = 1; i <= sign; i++) 
		{
			System.out.print("~");
		}
		System.out.println("\n");
	}
}
