package com.ustglobal.objectclass;

public class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	public boolean equals(Object obj) {
		if(this==obj)
		{
			return true;
		}
		Employee e = (Employee)obj;
		if(this.id==e.id) {
			if(this.name.equals(e.name)) {
				return true;
			}
			else {
				return false;
			}
			
		}
		else {
			return false;
		}
	}

}
