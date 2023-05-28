package TwentyFifthFeb;

public class Employeedetails {

		 
		 public static void main(String args[])
		 {
			 MainMethodINsepaateClass emp1=new MainMethodINsepaateClass(); //creating object
			 emp1.EmpID=101;
			 emp1.Ename="David";
			 emp1.salary=25000.00;
			 emp1.deptno=10;
			 emp1.job="Manager";
			 emp1.display();
			 
			 MainMethodINsepaateClass emp2=new MainMethodINsepaateClass();
			 emp2.EmpID=102;
			 emp2.Ename="Buddha";
			 emp2.salary=24000.00;
			 emp2.deptno=11;
			 emp2.job="Manager Manja";
			 emp2.display(); 
			 
		 } 
	}


