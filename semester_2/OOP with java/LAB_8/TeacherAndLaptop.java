class Laptop{
	String brand;
	Laptop(String brand){
		this.brand = brand;
	}
	String getBrand(){
		return brand;
	}
}

class Teacher{
	String name;
	Laptop laptop;
	Teacher(String name){
		this.name = name;
	}
	void setLaptop(Laptop laptop){
		this.laptop = laptop;
	}
	void displayInfo(){
		if(laptop==null){
			System.out.println("Name: "+this.name);
			System.out.println("No laptop");
		}
		else{
			System.out.println("Name: "+this.name);
			System.out.println("Brand: "+ laptop.getBrand());
		}
	}
}

class Main{
	public static void main(String[] args){
		Teacher teacher = new Teacher("Saif Hassan");
		Laptop laptop = new Laptop("HP");
		System.out.println("\nMaking Association by setting a laptop for teacher");
		teacher.setLaptop(laptop);
		teacher.displayInfo();
		System.out.println("\nMaking Optional Association by setting a laptop to null");
		teacher.setLaptop(null);
		teacher.displayInfo();
	}
}