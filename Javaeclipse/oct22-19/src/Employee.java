
public class Employee {
	String name;
	int id;

	Employee(String ename,int eid)
	{
		name=ename;
		id=eid;
	}

	void show()
	{
		System.out.println(name);
		System.out.println(id);
	}

	public static void main(String[] args) {

		Employee e1= new Employee("manasa",1);
		e1.show();

		Employee e2= new Employee("navya",2);
		e2.show();
	}
	
}
