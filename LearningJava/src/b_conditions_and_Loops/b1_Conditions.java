package b_conditions_and_Loops;


public class b1_Conditions {

	public static void main(String[] args) {


//		following topics will be covered in this section C
//		1. Conditions
//			a. If condition:  if we have to execute statement only when a given condition pass
//				syntas:
//				if(condition) 
//				{ statemetnts; }
////		
//			b. if-else condition
//				syntax
//			if (condition)
//			{Statement;  }
//			else
//			{Statement;  }
//			
//			c. if  Else-if condition
//				syntax  (note that it start with if and ends with else.  we can add as many else if as we want in between)
//			if (condition 1)
//			{Statement 1;  }
//			else if (condition 2)
//			{Statement 2; }
//			else if (condition n)
//			{Statement n;}
//			else [No condition here]
//			{statement final}
			
	
//		below is an example of if condition
		System.err.println("................if condition........................");
		int age = 24;
		System.out.println("your age is: " + age);
		if (age>18 && age<=21) 
		{
			System.out.println("you can smoke but cannot drink");
		}
		
//		below is an example of if-else condition
		System.err.println("................if else condition........................");
				if (age>=21) 
				{
					System.out.println("you can smoke and drink");
				}
				else
				{
				System.out.println("you cannot drink but may or may not smoke ");	
				}
		
//				below is an example of if-else condition
				System.err.println("................if  else if condition........................");
				
				
				if (age<18) {
					System.out.println("you cannot smoke and drink");
				}
				else if (age >= 18 && age<21) {
					System.out.println("you can smoke but cannot drink");
				}
				else  {
					System.out.println("you can smoke and drink");
				}			
			
				
			}
}
