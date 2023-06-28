package Package;

public class Assignment3 {
   
	 public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum ="+c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Sub ="+c);
		return c;
	}
	public int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Mul ="+c);
		return c;
	}
	public int div (int a, int b)
	{
		int c= a/b;
		System.out.println("Div ="+c);
		return c;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 ref=new Assignment3();
		int a1=ref.mul(10,2);
		int a2=ref.sub(a1,2);
		int a3=ref.sum(a2,2);
		int a4=ref.sub(a3,2);
		int a5=ref.div(a4, 2);
		System.out.println("final output="+a5);
	}
   
}
