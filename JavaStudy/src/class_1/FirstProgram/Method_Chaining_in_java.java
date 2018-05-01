package class_1.FirstProgram;
// program to demonstrate method chaining in java

class Method_Chaining_in_java
{
	public static void main(String args[])
	{
		String s="Java ";
		
		String JavaMethodChaining = s.concat("is boring").toUpperCase().replace("BORING", "interesting").toLowerCase();
		
		System.out.println("Prinitng only concat part - " + s.concat("is boring"));
		System.out.println("Printing uppercase conversion of concat result - "+ s.concat("is boring").toUpperCase());
		System.out.println("Printing result after replacing the uppercase converted - " +s.concat("is boring").toUpperCase().replace("BORING", "interesting"));
		System.out.println("The final result of method chaining is " + JavaMethodChaining);
	}
}

