class Ellipse
{
	static void area()
	{
		final double pi=3.142;
		double a=3.85;
		double b=6.58;
		double area=pi*a*b;
		System.out.println("Area of Ellipse having radius "+a+" and "+b);
		System.out.println("="+area);
	}
	public static void main(String[] args) 
	{
		area();
	}
}
