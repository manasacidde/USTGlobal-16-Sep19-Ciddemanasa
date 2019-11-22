
public class TestE {
	public static void main(String[] args) {
		Student.cname="Jspiders";
		Student s1= new Student();
		s1.name="manasa";
		s1.usn=101;
		System.out.println("college name is "+Student.cname);
		System.out.println("name is "+s1.name);
		System.out.println("ID is "+s1.usn);
		Student s2= new Student();
		s2.name="navya";
		s2.usn=102;
		System.out.println("college name is "+Student.cname);
		System.out.println("name is "+s2.name);
		System.out.println("ID is "+s2.usn);
	}

}
