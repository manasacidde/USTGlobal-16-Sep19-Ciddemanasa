
public class Bus {
	int seats;
	String color;
	Bus(int seats,String color){
		this.seats=seats;
		this.color=color;
	}
	Bus(){
		this(40);
	}
	Bus(int seats){
		this(seats,"red");
	}
	void show() {
		System.out.println("welcome to red bus seat capacity is "+seats);
		System.out.println(color);
	}
	public static void main(String[] args) {
		Bus b= new Bus();
		b.show();
		Bus b1= new Bus(50);
		b1.show();
		Bus b2= new Bus(70,"blue");
		b2.show();
	}

}
