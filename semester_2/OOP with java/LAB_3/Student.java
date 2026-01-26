class Student{
	private int id;
	private String name;
	private int age;
	private double cgpa;

	void setId(int id){
		this.id = id;
	}

	int getId(){
		return id;
	}

	void setName(String name){
		this.name = name;
	}

	String getName(){
		return name;
	}

	void setAge(int age){
		if(age >=15 && age <=60){
			this.age = age;
		}
		else 
			System.out.print("Invalid age entered");
	}

	int getAge(){
		return age;
	}
	boolean isOkay = false;
	void setCgpa(double cgpa){
		
		if(cgpa >=0.0 && cgpa <=4.0){
			this.cgpa = cgpa;
			isOkay = true;
		}
		else 
			System.out.println("Invalid cgpa entered");
		
	}

	double getCgpa(){
		return cgpa;
	}

	void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		if(isOkay==true){
			System.out.println(cgpa);
	}

	}

	public static void main(String[] args){
		Student std = new Student();
		std.setId(123);
		std.setName("Kamran");
		std.setAge(20);
		std.setCgpa(7.0);
		
		std.display();

	
	}
}