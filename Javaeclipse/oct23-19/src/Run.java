
public interface Run {
	void add();
	public default void display() {
		System.out.println("display of run");
	}

}
