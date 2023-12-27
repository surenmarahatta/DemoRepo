package a_basics_Of_Java;

public class a2_operator {

	public static void main(String[] args) {


		/*........
		Operators
		1. Aritimetic Operators  (+, -, *, /, %, ++, --)  //find reminder during division
		2. Assignment operators  (=, +=, -+, .....
		3. Comparision operators  (==,  !=,  <,  >,  >=,  <=)
		4. Logical operators  (&& (and),  || (or),  ! (not))
	......*/
	
		System.out.println("........an IMPORTANT examples of INCRIMENTAL ARITHMATIC operators......");
		int p=22, q=30;
		System.out.println("++p, means, it will first increase the value by one then reassign to variable, hence p=" +(++p));
		System.out.println("q++, means, it will first reassign the value of q then make an incremental, hence still q=" +q++ );
		System.out.println("now q has already increase, so if we simply print q, we will get new/increased value i.e " + q);
		System.err.println();
		
		System.out.println("........examples of comparision operators......");
		int i=22, j=20;
		System.out.println("i is equal to j--"+(i==j));
		System.out.println("is i not equal to j -- "+(i!=j));
		System.out.println("is i less then j -- "+(i<j));
		
		System.out.println();
		System.out.println("........examples of logical operators.........");
		int a = 100, b=200;
		System.out.println(a<b && a==b);
		System.out.println(a<b || a==b);
		System.out.println(!(a>b && a==b));
		System.out.println(!(a<b && a==b));
				
	}

}
