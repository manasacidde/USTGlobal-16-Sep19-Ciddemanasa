
public class TestA {
	public static int add(int a, int b)
	{
		System.out.println("add(int a, int b method)");
		return a+b;
	}
	public static long add(long a, int b)
	{
		System.out.println("add(long a, int b method)");
		return a+b;
	}
	public static void add(int a, byte b)
	{
		System.out.println("add(int a, byte b method)");

	}
	public int multiply(int a, int b)
	{System.out.println("multiply(int a,int b)");
	return a+b;
	}
	public long multiply(long a, int b)
	{System.out.println("multiply(long a,int b)");
	return a+b;
	}
	public static void main(String[] args) {
		System.out.println("string[] method");
		main(10);
		add(10, 20);
		add(10, 5);
		add(50, 10);
		TestA t = new TestA();
		t.multiply(10, 20);
		t.multiply(50, 10);	
	}
	public static void main(int a) {
		System.out.println("main(int a) method");	
	}
}
