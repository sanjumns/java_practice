class Trapezoid 
{
	static double area()
	{
		final double half=0.5;
		double a=30.5;
		double b=40.5;
		double h=11.3;
		double result=half*(a+b)*h;
		return result;
	}
	public static void main(String[] args) 
	{
		double x=area();
		System.out.println(x);
	}
}
