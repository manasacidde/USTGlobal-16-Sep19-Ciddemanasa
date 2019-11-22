
public class Person {
	String name;
	int age;
	Person(String pname,int page)
	{
		name=pname;
		age=page;
	}
	void show()
	{
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		Person p=new Person("manasa",21);
		p.show();
		
		Person p1=new Person("navya",20);
		p1.show();
		
		
		
	}
}
