package TwentyFifthFeb;

class A {       //Parent
	int a;
	void display() {
		System.out.println(a);
	}
	
		class B extends A   {// B is child, A is parent class
			int b;
			void print()
		{
			System.out.println(b);
		}
		}

public class InheritanceExample {
	
	public void main(String[] args) {
		
		A aobj =new A();
		aobj.a=100;
		aobj.display();
		
		B bobj =new B();
		bobj.a=10;
		bobj.b=20;
		
		bobj.display();  //A
		bobj.print();    //B
		
		}

	}

}
