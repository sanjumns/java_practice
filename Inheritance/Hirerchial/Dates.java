class Date1 
{
	static String a="01/01/2024";
}
class Date2 extends Date1
{
	static String b="01/06/2024";
	static void disp()
	{
		System.out.println(a+" "+b);
	}
}
class Date3 extends Date1
{
	static String c="01/12/2024";
	static void disp()
	{
		System.out.println(a+" "+c);
	}
}
class Dates
{
	public static void main(String[] args) 
	{
		Date2.disp();
		Date3.disp();
		System.out.println("Main ends here");
	}
}
