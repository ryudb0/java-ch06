class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white", "auto", 4);
	}
	Car(String color) {
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		this(c.color, c.gearType, c.door);
	}
}

public class Ex6_24 {
	public static void main(String[] args) {
//		Ex6_24
//		Car c1 = new Car();
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;
//		
//		Car c2 = new Car("white", "auto", 2);
//		
//		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
//		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);

		
//		System.out.println("-----------------------------------------");
//		Ex6_25
//		Car c1 = new Car();
//		Car c2  = new Car("blue");
//		
//		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
//		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		
		
		
//		System.out.println("-----------------------------------------");
//		Ex6_26
		Car c1 = new Car();
		Car c2 = new Car(c1);
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		
		c1.door = 100;
		System.out.println("c1.door=100; 수행후" );
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
