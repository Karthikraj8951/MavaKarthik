package TwentyFifthFeb;

public class MethodOverloading {
	
	void add (int a, int b)
	{
		System.out.println(a+b);
	}
	void add (int a, double b)
	{
System.out.println(a+b);
}
	public void main(int x)
	{
		System.out.println(x);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a+b-c);
	}
	public void main(int x, int y) //2
	{
		System.out.print(x+y);
	}
	
	public static void main(String[] args)
	{
		 MethodOverloading mo=new MethodOverloading();
		 mo.add(10.5, 20.5);	 
	}
	
	
	}
