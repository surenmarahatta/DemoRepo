package a_basics_Of_Java;
public class a3_typeCasting {

	public static void main(String[] args) {
	
		/* TYPE CASTING
		 this is the process of changing one data type into another. Sometime we write a code to address specific kind of 
		 data in out application, but we might encounter different type of data in real world
		 Hence by converting data from one type to another we can save some memory space in the server or 
		 reduce the risk of data lost.  There are 2 types of casting
		 
		 1. Widening Casting or implicit conversion:  from lower size of data into larger size 
		 for eg, int (4bytes) to float (8 bytes). Since destination datatype has more memory space 
		 then in source it has less chances of data being loss.  So this conversion happen automatically.
		 
		 2. Narrow Casting or explicit conversion:  from Higher size to lower size.
		 for eg float (8 bytes) to short (2 bytes).  Since data transfer from higher memory space to lower
		 there is more chances of data being lost.  So java do not do this process automatically and we 
		 have to trigger this action manually		 
		 */

	
		System.out.println("WIDENING CASTING:  datatype converted from int to double");
		int a =3;
		double d=a;  //no need to specify destination data type, it will convert automatically
		System.out.println(a);
		System.out.println(d);
		System.out.println(".....................");
		
		System.out.println("NARROW CASTING:  datatype converted from double to int");
		double d1=4d;
		int a1=(int)d1;  //need to specify destination data type "(int)d1" manually 
		System.out.println(a1);
		
		//above is an example of converting datatype from int to doouble or Vs. both are numerical values
		//but if we need to convert from number to characters like int/float into string we need to do as below 
		
		System.out.println("...........................");
		
		float p =20.8f;
		System.out.println(p);
		String q=String.valueOf(p);  //here we can see a numerical/float value but it is of datatype sting, not float.
		System.out.println(q);
		
		//we can also convert from datatype string to int.  for this we use (.parseInt)
		//look at the example below
		
		String s = "300";
		int i = Integer.parseInt(s);
		System.out.println("string converted to an int and the int value is:" +" " + i);
		System.err.println("please note string should contain numerical value within double quote for this purpose ");
		
	}

}
