class Satellite 
{
	void give_forecast()
	{
		System.out.println("Rain Posible today");
	}
}
class Ventusky
{
	public static void main(String[] args) 
	{
		System.out.println("**********Main Starts***********");
		Satellite s=new Satellite();
		Customer.need_forecast(s);
		Customer1.need_forecast(s);
		System.out.println("**********Main Ends***********");
	}	
}
class Customer
{
	static void need_forecast(Satellite d)
	{
		System.out.println("Customer 1: ");
		d.give_forecast();
	}
}
class Customer1
{
	static void need_forecast(Satellite d)
	{
		System.out.println("Customer 2: ");
		d.give_forecast();
	}
}