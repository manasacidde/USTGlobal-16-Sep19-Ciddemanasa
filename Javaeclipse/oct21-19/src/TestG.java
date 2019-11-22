
public class TestG {
	public static void main(String[] args) {

		FirstGen f = new FirstGen();
		f.call();
		f.msg();

		SecondGen s = new SecondGen();
		s.call();
		s.msg();
		s.game();

		ThirdGen t = new ThirdGen();
		t.call();
		t.msg();
		t.game();
		t.camera();

	}
}