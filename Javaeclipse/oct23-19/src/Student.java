
public class Student {
	String name;
	int rollno;
	final String cname="Qspiders";
	final int cid=123;
	Student(){
		
	}
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		
	}
	final void printDetails() {
		System.out.println("hi "+name+"welcome to "+cname);
	}
	final void printDetails(String name) {
		System.out.println("hi "+name+ " welcome to "+cname);
	
	}

}
