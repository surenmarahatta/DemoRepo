package b_conditions_and_Loops;

public class b4_ternaryOperator {

	public static void main(String[] args) {
		// this is just a replacement for if else condition .
//		syntax
//		variable = (condition)? expression IF True:  expression if false

		int age=17;
		String output = (age >= 18)?  
				"you are eligible to vote": "you are not eligible to vote";
		System.out.println(output);
		
		
		//above code with if-else condition
		int age2=17;
		if (age2>=18) {
			System.out.println("you are eligible to vote");
		}
		else {
			System.out.println("you are NOT eligible to vote");
		}
	}

}
