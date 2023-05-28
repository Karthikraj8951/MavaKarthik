package TwentyFifthFeb;

public class StaticExample {
	
	static int a = 10; //static variable
	int b=20; //Non static variable
	
	static void m1()  //static method
	{
		System.out.println("this is m1 - static method");
	}
	
	void m2() //Non-static
	{
		System.out.println("this is m2 - Non-static method"); }
	
	void m3() // Non-static method can be accessed in static and non static method both
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		}
	
	public static void main(String[] args) {
		//static methods can access only static stuff
		//System.out.println(a);
		// m1();
		
		//System.out.println(b); //incorrect, bcoz b is non-static variable
		//m2(); //incorrect, bcoz m2() is non-static method
		
		//static methods can also access non static stuff but through object
		/*StaticExample SE=new StaticExample();
		System.out.println(SE.b);   //non static variable through object
		SE.m2();*/
		
		StaticExample OFS= new StaticExample();
		OFS.m3();
		
		
		
		
		
		
	}

}
