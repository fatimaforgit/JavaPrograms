class Example_InstanceOf 
{
	public static void main(String[] args) 
	{
		String name = "James";
		boolean result = name instanceof String ; // checking if 'name' is an object of 'String' type

		System.out.println("Is 'name' is an instance/object of 'String'  ? ");
		System.out.println( result ); // expected answer is 'true'
	}
}