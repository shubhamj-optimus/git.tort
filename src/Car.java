
public class Car {
	String model;
	int price;
	 static int wheels=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1= new Car();
		c1.model="Mercedez";
		c1.price=5654141;
		
		Car c2= new Car();
		c2.model="maruti";
		c2.price=55554;
		
		System.out.println(c1.model);
		System.out.println(c2.model);
		
	}

}
