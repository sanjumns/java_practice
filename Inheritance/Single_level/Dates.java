class Date1 
{
	String a="23/06/1990";
}
class Date2 extends Date1
{
	String b="23/04/2024";
	void disp()
	{
		System.out.println("Date of birth-"+a +" and current date is "+b);
	}
}
class Dates
{
	public static void main(String[] args) 
	{
		Date2 d=new Date2();
		d.disp();
		System.out.println("Successful");
	}
}
