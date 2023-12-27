package b_conditions_and_Loops;
import java.util.Scanner;

public class b1_switchCase {

	public static void main(String[] args) {
		
//		when we have multiple condition and if we have to execute a result based upon
//		a passed condition, then we use Switch Case.  this is an alternative for if elseIf condition
		
//		syntax
//			switch (Variable) {
//			case <condition 1>:	statement1;
//				break;    //the break command at the end of each case will move out of this loop ONLY IF THE CONDITION PASS
//				
//			case <condition 2>:  statement2;    //this way we can add n numbers of case
//				break;
//			default:  statement    //(when no any condition match the default statement will execute)
//			}

		Scanner input = new Scanner (System.in);
		System.out.print("enter a numerical value of a day in a week  "); int a =input.nextInt();
		input.close();
		
		switch(a) {
		case 1:  System.out.println("You entered Sunday");
			break;
			
		case 2: System.out.println("you entered Monday");
			break;
			
		case 3: System.out.println("you entered Tuesday");
			break;
			
		case 4: System.out.println("you entered wednsday");
			break;
			
		case 5: System.out.println("you entered thursday");
			break;
			
		case 6: System.out.println("you entered friday");
			break;
			
		case 7: System.out.println("you entered Saturday");
			break;
			
		default: System.out.println("Invalid entry");
		
		}
		
	}

}
