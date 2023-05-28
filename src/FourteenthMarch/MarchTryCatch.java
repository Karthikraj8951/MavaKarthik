package FourteenthMarch;

public class MarchTryCatch {

	public static void main(String[] args) {
		
		/*int a = 100;
		
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Entered in to catch block");
		}
		
		String s=null;
		
		String x="abc";
		
		int arr[]=new int[5];
	}*/
		
		//String s=null;
		String s="welcome";
		try {
			System.out.println(s.length()); //throws NullpointerException
			}
		catch(Exception e) {
			System.out.println("Entered in to catch block");
		}
		}

}
