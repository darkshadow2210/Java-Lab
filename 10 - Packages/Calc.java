import calculator.DoubleCalculator;

public class Calc
{
	public static void main(String args[])
	{
		DoubleCalculator c1=new DoubleCalculator();
		double r;
		r= c1.add(10.0,20.0);
		System.out.println("sum = "+r);
		r= c1.sub(10.0,20.0);
		System.out.println("diff = "+r);
		r= c1.mul(10.0,20.0);
		System.out.println("product = "+r);
		r= c1.div(10.0,20.0);
		System.out.println("division = " +r);
	}
}
