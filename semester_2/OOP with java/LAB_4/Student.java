class Student{

	private String name;
	private int studentId;
	private double gpa;

	public Student(){
		this.name = "Unknown";
		this.studentId = 0;
		this.gpa = 0.0;
	}
	public Student(String name,int studentId,double gpa){
		this.name = name;
		this.studentId = studentId;
		this.gpa = gpa;
	}
	String getName(){
		return this.name;
	}
	int getStudentId(){
		return this.studentId;
	}
	double getGpa(){
		return this.gpa;
	}
	void setName(String name){
		this.name= name;
	}
	void setStudentId(int studentId){
		this.studentId= studentId;
	} 
	void setGpa(double gpa){
		this.gpa = gpa;
	}
	void displayInfo(){
		System.out.println("Student Information:");
		System.out.println("Name: " + name);
		System.out.println("Student Id: " + studentId);
		System.out.println("GPA: " + gpa +"\n");
	}
	public static void main(){
		Student s1= new Student();
		Student s2 = new Student("kamran",1,3.2);
		s1.displayInfo();
		s2.displayInfo();

		s1.setName("Jane Smith");
        s1.setStudentId(12346);
        s1.setGpa(3.90);
        s1.displayInfo();
		
	}
}
