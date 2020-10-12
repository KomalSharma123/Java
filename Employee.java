--------------Assignment 2------------
public class Employee {
	String name;
	int age;
	String city;
	public void display()
	{
		 name="Saurabh";
		 age=23;
		 city="Chennai";	 
	}

	public static void main(String[] args)
	{
		Employee obj=new Employee();
		obj.display();
		System.out.println("Output of Obj is"+obj);
		
		Employee obj1=new Employee();
		obj1.display();
		System.out.println("Output of Obj1 is"+obj1);
	}
	}