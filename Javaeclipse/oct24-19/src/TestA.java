
public class TestA {
	static int a;
	static {
		a=10;
		System.out.println("static block1");
	}
	TestA(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		TestA t = new TestA();
		System.out.println(a);
		
		
	}
	static {
		a=20;
		System.out.println("static block2");
	}
	static {
		a=40;
		System.out.println("static block3");
	}


}
