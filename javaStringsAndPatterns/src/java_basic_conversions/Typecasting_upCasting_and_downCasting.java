package java_basic_conversions;

public class Typecasting_upCasting_and_downCasting 
{

	public static void main(String[] args) 
	{
		UpCasting u=new UpCasting();
		DownCasting d = new DownCasting();
		CharToByte c= new CharToByte();
	}

}

class UpCasting
{
	UpCasting()
	{
		char c= 'A';
		int ASCIIValue = c;
		System.out.println(c+"'s ASCII value is " +ASCIIValue);
	}
}

class DownCasting
{

	DownCasting()
	{
		int i=65;
		char c=(char)i;
		System.out.println(i+" is the ASCII value of " +c);
	}
}

class CharToByte
{
	CharToByte()
	{
		char c = 'B';
		byte b= (byte)c;
		System.out.println(b);
	}
}
