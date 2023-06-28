package Package;

public class Student 
{
	int age,roll_no;
	
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("automation is very easy");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Student a= new Student();
     a.age=25;
     System.out.println(a.age);
     a.roll_no=7;
     System.out.println(a.roll_no);
     a.display1();
     a.display2();
	
	}

}
