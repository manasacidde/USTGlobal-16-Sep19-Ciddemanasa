
public class TestB {
	static int a=25;
	int x;
	public static void add()
	{
		final int a=10;
		int b=10;
		System.out.println(a);
		System.out.println(b);

	}
	public static void main(String[] args) {
		add();	
		System.out.println(a);
		TestB t = new TestB();
		System.out.println(t.x);
	}

}
