
public class Employee2 {
	String name;
	int id;
	long aadhar;
	Employee2(String name,int id,long aadhar){
		this.name=name;
		this.id=id;
		this.aadhar=aadhar;
	}
	Employee2(String name,int id){
		this.name=name;
		this.id=id;
	}
	Employee2(int id,String name){
		this.name=name;
		this.id=id;
	}
	void show() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(aadhar);
	}
	void display() {
		System.out.println("hi "+name+" welcome to ust");
	}
	public static void main(String[] args) {
		Employee2 e = new Employee2("manasa",1,71820798);
		e.show();
		e.display();
		Employee2 e1 = new Employee2("navya",2);
		e1.show();
		e1.display();
		Employee2 e2 = new Employee2(3,"cream");
		e2.show();
		e2.display();
		
		
	}

}
