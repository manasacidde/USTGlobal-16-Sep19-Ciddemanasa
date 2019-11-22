
public class Employee1 {
	String name;
	int id;

	Employee1(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	void show()
	{
		System.out.println(name);
		System.out.println(id);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("hello "+name+" welcome to ust");
	}

	public static void main(String[] args) {

		Employee1 e1= new Employee1("manasa",1);
		e1.show();
		Employee1 e2= new Employee1("navya",2);
		e2.show();
		Employee1 e3= new Employee1("cream",3);
		e3.show();

}
}