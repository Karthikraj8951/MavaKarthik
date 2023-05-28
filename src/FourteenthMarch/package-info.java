package FourteenthMarch;


public static void main(String[] args) {
	
	int a= 100;
	
	try {
		System.out.println(a/0); }
	catch(ArithmeticException e) {
		System.out.println("Entered in to catch block");
	}
	
	
}
}