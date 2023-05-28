package TwelthMarchPractise;

public class ABC {
	protected int data = 10;
	protected void m1() {
		System.out.println(data);
	}
}
	

class A1 {
	void k1() {
		System.out.println("This is k1 method from A1 Class");
	}
}

interface B1 {
	void P2(); 
}

interface B2 {
	void P3();
}


public class HybridInheritance extends A1 implements B1, B2 {

	
	public void P2() {
		System.out.println("this P2 method is Patriotic method");
	}
	
	public void P3() {
		System.out.println("THis sis RajRoyals Methodology!!");
	}
	
	
	public static void main(String[] args) 
	
	{ ABC Karz = new ABC();
	Karz.m1();
	}
	
	{	
		HybridInheritance mi = new HybridInheritance();
mi.k1();
mi.P2(); 
mi.P3();

	}

}
