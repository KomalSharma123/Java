-------------Loan.java---------------
package Letsupgradepackage;

import java.io.InputStream;
import java.util.Scanner;

public class Loan {
	static String Employee_name;
	static int age;
	static int date_of_birth;
	static String month_of_birth;
	static int year_of_birth;
	int monthly_salary;

	public static void main(String[] args) {
		double t=0;
		Scanner sc=new Scanner(System.in);
		Loan.Employee_name="Saurabh";
		System.out.println("Name of Employee is>>>"+Employee_name);
		Loan.age=23;
		System.out.println("Age of Employee is >>>"+age);
		Loan.date_of_birth=23;
		System.out.println("Dateofbirth of Employee is>>>>"+date_of_birth);
		Loan.year_of_birth=1989;
		System.out.println("Yearofbirth of Employee is>>>"+year_of_birth);
		Loan.month_of_birth="March";
		System.out.println("Monthofbirth of Employee is >>>"+month_of_birth);
		
		System.out.println("Enter Monthly_salary");
		  
		double i=sc.nextDouble();
		t=incomeTax(i);
		System.out.println("Income tax amount is>>>> "+t);
		
		}
	static double incomeTax(double i)
	{
		double tax;	
		if(i<=200000)
			tax=0;
		else if(i<=300000)
			tax=0.5*(i-200000);
		else if(i<=500000)
			tax=(0.10*(i-300000))+10000;
		else if(i<=1000000)
			tax=(0.15*(i-500000))+50000;
		else
			tax=(0.20*(i-1000000))+200000;
		return tax;
	 
	}
	


	}


---------------Students.java----------------
package Letsupgradepackage;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		int marks[] = new int[6];
        int i;
        float total=0, avg;
        float percentage;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
       
        avg = total/6;
        System.out.print("The student Grade is: ");
        float total_marks =600 ;
		percentage = (float)((total /total_marks) * 100);
        System.out.println("Percentage ::"+ percentage);
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }


	}


