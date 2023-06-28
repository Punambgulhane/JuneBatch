package Package;

public class Calculation {
	
	public int sum(int a,int b)
	{
		int c= a+b;
		System.out.println("Sum ="+c);
		return c;
	}
	public int sub(int a,int b)
	{
		int c= a-b;
		System.out.println("Sub ="+c);
		return c;
	}
	public int mul(int a,int b)
	{
		int c= a*b;
		System.out.println("mul ="+c);
		return c;
	}
	public int div(int a,int b)
	{
		int c= a/b;
		System.out.println("div ="+c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
	      int o1= cal.sum(10,2);
	      int o2= cal.sum(o1,2);
	      int o3= cal.sub(o2,2);
	      int o4= cal.mul(o3,2);
	      cal.div(o4, 2);
	}

}
