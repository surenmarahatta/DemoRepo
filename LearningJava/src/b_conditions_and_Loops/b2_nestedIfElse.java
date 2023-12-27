package b_conditions_and_Loops;

public class b2_nestedIfElse {

	public static void main(String[] args) {
		
		// Nested Loop"
		//condition inside a condition (like subquery in sql).  Inner loop will execute first then outer loop
		//if age >=21 and gender ="male", then you are eligible to marry
		
		for (int b=1; b<=7; b++) {
			System.out.println();
			System.err.println("BELOW IS THE MULTIPICATION TABLE OF " + b);
			for (int a=1; a<=10; a++) {
				System.out.println(b+" X "+a+" = "+ a*b);
			}
		}
		
	}

}
