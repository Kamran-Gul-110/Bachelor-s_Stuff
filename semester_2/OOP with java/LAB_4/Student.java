public class Student{

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

	// Task 2
	char calculateGrade(){
		if(this.gpa>=3.7) return 'A';
		else if(this.gpa>=3) return 'B';
		else if(this.gpa>=2) return 'C';
		else if(this.gpa>=1) return 'D';
		else return 'F';
	}
	boolean isHonorStudent(){
		 return (this.gpa>=3.5) ? true : false;
	}
	void updateGPA(double newGPA){
		if(newGPA>=0.0 && newGPA<=4.0){
			this.gpa = newGPA;
		}
	}
	String getStatus(){
		if(this.gpa>=3.7) 
			return "Excellent";
		else if(this.gpa>=3) 
			return "Good";
		else if(this.gpa>=2) 
			return "Average";
		else if(this.gpa>=1) 
			return "Need improment";

		return "Fail";

}
	// Task 3
	
	String formatName(){
        int ind = this.name.indexOf(" ");
        String first = name.substring(0,ind);
        String last = name.substring(ind+1,name.length());
        return last + ", " + first;
	}
	String getInitials(){
		int ind = this.name.indexOf(" ");
        String first = name.substring(0,ind);
        String last = name.substring(ind+1,name.length());

        String firstInitial = Character.toString(first.charAt(0));
        String lastInitial = Character.toString(last.charAt(0));

        return firstInitial+lastInitial;
	}
	boolean validateName(){
		int len = this.name.length();
		String n = name.toLowerCase();
		for(int i=0;i<len;i++){
			if (!(((int)n.charAt(i) >= 97 && (int)n.charAt(i) <= 122) || (int)n.charAt(i) == 32)) return false;
		}
		return true;
	}
	String[] getStudentInfoArray(){
		String[] arr = {this.name,Integer.toString(this.studentId),Double.toString(this.gpa)};
		return arr;
	}
	void displayFormattedInfo(){
		System.out.println("======== Formatted Student info ========");
		System.out.printf("Name: %s | Student Id: %d | GPA: %.2f",name,studentId,gpa);
	}
}
class Main {
    public static void main(String[] args) {
    		// Task 2
        /*
        Student s1 = new Student("John Doe", 12345, 3.75);
        Student s2 = new Student("Jane Smith", 12346, 2.50);
        
        System.out.println("Grade: " + s1.calculateGrade());
        System.out.println("Is Honor Student: " + s1.isHonorStudent());
        System.out.println("Status: " + s1.getStatus());
        
        s2.updateGPA(3.90);
        s2.displayInfo();
        */

        // Task 3
        
        Student s1 = new Student("Kamran Gul", 12345, 3.75);
        System.out.println("Formatted Name: " + s1.formatName());
        System.out.println("Initials: " + s1.getInitials());
        System.out.println("Valid Name: " + s1.validateName());
        String[] info = s1.getStudentInfoArray();
        for (String data : info) {
            System.out.println(data);
        }
        s1.displayFormattedInfo();
    }

    }
