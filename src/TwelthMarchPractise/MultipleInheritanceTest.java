package TwelthMarchPractise;

interface abc {
	int x = 100;
	void k1();
}

interface xyz {
	int y = 200;
	void m2();
}

public class MultipleInheritanceTest implements abc,xyz {

	public void k1() {
		System.out.println(x);
	}
	
	public void m2() {
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		MultipleInheritanceTest Success = new MultipleInheritanceTest();
		Success.k1();
		Success.m2();
	}
}

public class Mult2 extends MultipleInheritanceTest implements abc, xyz {
	
public static void main(String[] args) {
		
	Mult2 Kar = new Mult2();
	
		
	}
	
}
