package TwentyFifthFeb;

public class studentVariable {
	
	//1st approach
	int sid;
	String sname;
	char grade;
	
	studentVariable(int id, String name, char K) //Constructor Example 
	{
	sid=id;
	sname=name;
	grade=K;
	
	}
	void display()
	{
		System.out.println(sid+"  "+sname+"  "+grade);
	}

}
