class car{
	private String brand;
	private String model;
	private int year;
	private double price;

	car(String brand, String model, int year, double price){
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	double getPrice(){
		return this.price;
	}
	void display(){
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("Price: " + price);
	}
	public static void main(String[] args){
		car c1 = new car("toyota","A123",2023,45000);
		car c2 = new car("mehran","B456",1999,34000);
		car c3 = new car("bmw","C789",2019,57000);

		c1.display();
		System.out.print("\n");
		c2.display();
		System.out.print("\n");
		c3.display();

		double[] array = {c1.getPrice(), c2.getPrice(), c3.getPrice()};
		
		double exp = array[0];
		int ind = 0;
		for(int i=1; i<array.length;i++){
			if(array[i]>exp){
				exp = array[i];
				ind = i;
			}
		}

		System.out.print("\nThe most expensive car: " + exp);
	}
}