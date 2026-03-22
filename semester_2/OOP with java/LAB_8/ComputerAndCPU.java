class CPU{
	String model;
	CPU(String model){
		this.model = model;
	}
	String getModel(){
		return model;
	}
}

class Computer{
	String brand;
	CPU cpu;
	Computer(String brand, String model){
		this.brand = brand;
		this.cpu = new CPU(model);
	}
	String getComputerInfo(){
		return this.brand + " " + cpu.getModel();
	}
	void start(){
		System.out.println("Computer Started with CPU "+cpu.model);
	}
}

class Main{
	public static void main(String[] args){
		Computer computer = new Computer("HP","Intel Corei8");
		System.out.print("\n\n");
		System.out.println(computer.getComputerInfo());
		computer.start();
	} 
}