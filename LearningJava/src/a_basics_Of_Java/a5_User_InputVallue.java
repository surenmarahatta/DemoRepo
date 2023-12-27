package a_basics_Of_Java;

import java.util.Scanner;  //this is to import Java utility package (called java.util.scanner), which allow user to input value

public class a5_User_InputVallue {

	public static void main(String[] args) {

//		User Input value of String, Int or Float :
//		we have a java package called (java.util.scanner) which allow user to input value. and we have input this package at line# 3.
//		initially this package was designed to allow user to input value of String, but later this feature is available for 
//		Int and Float too.
//		
//		then start first line of code by below
//		Scanner input=new Scanner (System.in), 
//		then keep in mind the syntax which ask value wiith user which are as below
//		
//		for String
//		string a=input.next();
//				
//		for int
//		int b = input.nextInt();
//				
//		for Float
//		float c = input.nextFloat();

		Scanner input = new Scanner (System.in);
		
		System.out.print("What is your name? ");  //Note that, here is no println only print, because i dont want this code to push cursor in next line
		String name = input.next();
		System.out.print("what is your age? ");
		int age = input.nextInt();
		System.out.print("what is your weight? ");
		float weight = input.nextFloat();
		System.err.println(".....................");
		System.out.println("Mr. "+name+" is "+age+ " and his weight is " + weight);
		System.out.println("your weight to age ratio is "+weight/age);
	}

}
