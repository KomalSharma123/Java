----------Avengers.java----------
1.create a class avenger with
properties (name,age,power,weapon,planet) and with
functions-getDetails() and displayDetails().
create 5 objects as an array in the main method and call.
package Letsupgradepackage;

import java.util.Scanner;

public class Avenger {

	String name;
	int age;
	String power;
	String weapon;
	String planet;
	
	public void getDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the power");
        power=sc.nextLine();
        System.out.println("Enter the weapon");
        weapon=sc.nextLine();
        System.out.println("Enter the planet");
        planet=sc.nextLine();
        }
	public void displayDetails()
	{
	System.out.println("Name of Avenger"+name);
	System.out.println("Age of Avenger"+age);
	System.out.println("Power of Avenger"+power);
	System.out.println("weapon of Avenger"+weapon);
	System.out.println("Planet of Avenger"+planet);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [] {1, 2, 3, 4, 5};
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
		Avenger obj=new Avenger();
		obj.getDetails();
		obj.displayDetails();
		

	}

}
---------------odd.java---------
Q2.Create an int array with 5 values and print only odd values.
package Letsupgradepackage;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [] {1, 2, 3, 4, 5};   
        
        System.out.println("Elements of given array present on odd position: ");  
        //Loop through the array by incrementing value of i by 2   
        for (int i = 0; i < arr.length; i = i+2) {   
            System.out.println(arr[i]);  

	}

}
}
-------------------Sumofarray.java-----------
Question3-Create an int array of size 5, take all the values from the user, add all the values and print the sum.
package Letsupgradepackage;

import java.util.Scanner;

public class Sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[5];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
	}

}
