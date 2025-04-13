class AgeException extends Exception
{
	AgeException(String s)
	{
		super(s);
	}	
}
public class CustomException
{
	static void validate(int age) throws AgeException
	{
		if(age<18)
			throw new AgeException("cant vote");
		else
			System.out.println("can be voted");
	}
	public static void main(String args[]) throws AgeException
	{
		validate(5);
		
	}
}
