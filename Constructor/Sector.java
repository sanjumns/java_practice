class Sector
{
	static final double pi=3.142;
	double r;
	double t;
	double result;
	Sector(double r, double t)
	{
		result=pi*r*t;
	}
	public static void main(String[] args) 
	{
		Sector s=new Sector(2.3,60);
		System.out.println(s.result);
	}
}
