package arrays;

import java.util.Scanner;

public class LearnScanner {
	
	
	public static void main(String[] args) {
		
		simple();
		
		
	}

	
	
	public static void simple()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter your Name, Age, Address and Sal:");
		
		//sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter AGe");
		int age = sc.nextInt();
		System.out.println("Enter Address");
		String address= sc.nextLine();
		System.out.println("Enter Salary");
		double sal= sc.nextDouble();
		
		System.out.println("Name:"+name);
		System.out.println("AGe:"+age);
		System.out.println("Address:"+address);
		System.out.println("sal:"+sal);
		
	}
	
	
	
	
	public static void array()
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("User should specify no of imputs user want to enter----");
		
		int n= sc.nextInt();
		
		System.out.println("Start ENtring Sting Array Data");
		String[] str = new String[n];
		
		sc.nextLine();
		
		for(int i=0; i< str.length; i++)
			str[i] = sc.nextLine();
		
		
		sc.close();
		
		
		System.out.println("Values Entered-----");
		for (String string : str) {
			System.out.println(string);
		}
		
	}
	
}
