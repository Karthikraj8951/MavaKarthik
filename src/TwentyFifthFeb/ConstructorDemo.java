package TwentyFifthFeb;

public class ConstructorDemo {
	
	int x;
	int y;
	
	ConstructorDemo() // default constructor
	{
		x=10;
		y=20;
	}
	
	ConstructorDemo(int a, int b)     //parameterized constructor
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo cm1= new  ConstructorDemo();                // Invokes default constructor
		cm1.display();
		
		ConstructorDemo cm2= new ConstructorDemo(100,200);
		cm2.display();  

	}

}
