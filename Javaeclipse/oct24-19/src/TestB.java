
public class TestB {
	static int a;
	int b;
	{
		a=10;
		b=20;
		System.out.println("non static block1");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		TestB b = new TestB();
		TestB b1 = new TestB();

		System.out.println("main ended");		
	}
	{
		System.out.println("nan static block2");
	}
}
