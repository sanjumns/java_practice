class Trapezoidd
{
	void area()
	{
		final double half=0.5;
		double a=55.3;
		double b=84.6;
		double h=11.2;
		double res=half*(a+b)*h;
		System.out.println(res);
	}
		
	public static void main(String[] args) 
	{
		new Trapezoidd().area();	
	}
}
