package a_basics_Of_Java;

public class a4_String {

	public static void main(String[] args) {
		// String are use to store multiple characters within the variable
		//for example "test", or "this is a test"
		
		//below is the basic example
		String Fn= "Surendra";
		String Ln= "Marahatta";
		String Fname =Fn.toUpperCase();  //.toUpperCase convert teh string Fn to upper case
		String Lname =Ln.toUpperCase();
		System.out.println("my full name is"+" "+ Fname + " " + Lname);

		
		// there are following methods of string which we can use for different purpose
		
		//charAt():  To find the character at specific position.  remamber the count start with 0, not 1
		System.err.println("............................");  
		System.out.println("this will find the character at porition 3 in the fname which is- " + "'"+Fname.charAt(3)+"'");
		System.out.println ("this will find character at portion 3, 5, 7 in the last name, which "
				+ "are- " + Lname.charAt(3) +", "+ Lname.charAt(5) +" and " + Lname.charAt(7));
		
		//concat():  to concate multiple strings
		System.err.println("............................");
		String Prefix = "Mr.";
		String City = "Tampa, Fl";
		System.out.println("my name is: " + Fname.concat(" ").concat(Lname));
		System.out.println("my full name is: " + Prefix.concat(" ").concat(Fname).concat(" ").concat(Lname));
		System.out.println("my full name is: " + Prefix.concat(" ").concat(Fname).concat(" ").concat(Lname).concat(" from ").concat(City));
		System.err.println("hmm, so simple,  keep adding .concat() to add anything you want. supply any value you want within the ()");
		System.err.println("but there should be some value within (), if you dont have anything just put double-quote");
		
	/*
		-Learn some other methods in String from 
		(https://javaguide.technologychannel.org/introduction-and-basics/string-in-java/) 
		which includes 
		string length, 
		toUpperCase, 
		toLowerCase etc.
		
		 */
		 
		 
	}

}
