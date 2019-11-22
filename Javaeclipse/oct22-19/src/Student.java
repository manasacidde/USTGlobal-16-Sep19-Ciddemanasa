
public class Student {
String name;
int id;
String dept;
long mobno;
double percentage;
Student(String name,int id,String dept,long mobno,double percentage){
	this.name=name;
	this.id=id;
	this.dept=dept;
	this.mobno=mobno;
	this.percentage=percentage;
}
void show() {
	System.out.println("student name is "+name);
	System.out.println("student id is"+id);
	System.out.println("student dept is "+dept);
	System.out.println("student mobileno is "+mobno);
	System.out.println("student percentage is "+percentage);
}
public static void main(String[] args) {
	Student s = new Student("manasa",1,"ece",801921,82.4);
	s.show();
	Student s1 = new Student("navya",2,"cse",801923,81.4);
	s1.show();
	Student s2 = new Student("srujana",3,"ece",801924,80.4);
	s2.show();
	Student s3 = new Student("uma",4,"cse",801925,79.4);
	s3.show();
	Student s4 = new Student("swetha",5,"ece",801926,78);
	s4.show();
	Student s5 = new Student("usha",6,"civil",801927,82);
	s5.show();
	Student s6 = new Student("manikanta",7,"ece",801928,89);
	s6.show();
	Student s7 = new Student("roopa",8,"civil",801929,87);
	s7.show();
	Student s8 = new Student("malathi",9,"cse",801930,80);
	s8.show();
}
}
