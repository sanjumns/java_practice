class Sector 
{
	static void area()
	{
		final double half=0.5;
		double r=15.5;
		double t=45;
		double area=half*r*r*t;
		System.out.println("Area of Sector having radius "+r+" and Angle "+t);
		System.out.println("="+area);
	}
	public static void main(String[] args) 
	{
		area();
	}
}
