
public class TestC {
public static void main(String[] args) {
	Person.color="white";
	System.out.println(Person.color);
	Person.sleep();
	Person p = new Person();
	p.name="manasa";
	System.out.println("name is "+p.name);
	p.age=21;
	System.out.println("age is "+p.age);
	p.eat();
	p.walk();
	Person p1 = new Person();
	p1.name="navya";
	System.out.println("name is "+p1.name);
	p1.age=21;
	System.out.println("age is "+p1.age);
	p1.eat();
	p1.walk();
}
}
