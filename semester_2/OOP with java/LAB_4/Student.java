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

	// Task 4

	double processGPAs(double[] gpas){
		double highestGpa = 1;
		for(double i : gpas){
			if(i>4.0){
				break;
			}
			else if(i<1.0){
				continue;
			}
			else if(i>highestGpa){
				highestGpa = i;
			}
		}
		return highestGpa;
	}
	double calculateAverage(double[] grades){
		double sum = 0;
		int length = grades.length;
		for(double i : grades){
			sum+=i;
		}
		return sum/length;
	}
	boolean findGradeInArray(char[] grades, char target){
		for(char i : grades){
			if(i==target){
				return true;
			}
		}
	return false;
	}
	int[] modifyArray(int[] numbers){
		for(int i : numbers){
			i = i*2;
		}
	return numbers;
	}

	// Task 5

	int calculateTotal(int a, int b){
		return a+b;
	}
	double calculateTotal(double a,double b){
		return a+b;
	}
	int calculateTotal(int a, int b, int c){
		return a+b+c;
	}
	int process2DArray(int[][] matrix){
		int max = matrix[0][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(matrix[i][j]>max){
					max = matrix[i][j];
				}
			}
		}
		return max;
	}
	int[][] getStudentGrades2D(){
		int[][] grades = {{10,20,30,40},{50,60,70,80},{90,100,10,20}};
		return grades;
	}
	void displayGradeTable(int[][] grades){
		System.out.println("Grade Table: ");
		for(int i=0;i<3;i++){
			System.out.printf("Student %d: ",i+1);
			for(int j=0;j<4;j++){
				System.out.print(grades[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	double calculateRowAverage(int[][] grades, int row){
		int sum = 0;
		for(int i=0;i<4;i++){
			sum += grades[row][i];
		}
		return sum/4.0;
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
        /*
        Student s1 = new Student("Kamran Gul", 12345, 3.75);
        System.out.println("Formatted Name: " + s1.formatName());
        System.out.println("Initials: " + s1.getInitials());
        System.out.println("Valid Name: " + s1.validateName());
        String[] info = s1.getStudentInfoArray();
        for (String data : info) {
            System.out.println(data);
        }
        s1.displayFormattedInfo();
        */

        // Task 4
    	/*
    	Student s1 = new Student("John Doe", 12345, 3.75);
        
        double[] gpas = {3.5, 2.8, 3.9, 0.5};

        double highest = s1.processGPAs(gpas);
        System.out.println("Highest GPA: " + highest);
        
        double[] grades = {85.0, 90.0, 78.0, 92.0};
        double avg = s1.calculateAverage(grades);
        System.out.println("Average: " + avg);
        
        char[] gradeList = {'A', 'B', 'C', 'A', 'B'};
        boolean found = s1.findGradeInArray(gradeList, 'A');
        System.out.println("Grade A found: " + found);
        
        int[] nums = {1, 2, 3, 4, 5};
        s1.modifyArray(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
		*/

		// Task 5
    	
        Student s1 = new Student("John Doe", 12345, 3.75);
        
        // Method overloading
        System.out.println("Sum (int): " + s1.calculateTotal(5, 3));
        System.out.println("Sum (double): " + s1.calculateTotal(5.5, 3.2));
        System.out.println("Sum (3 ints): " + s1.calculateTotal(5, 3, 2));
        
        // 2D Array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int max = s1.process2DArray(matrix);
        System.out.println("Max value: " + max);
        
        int[][] grades = s1.getStudentGrades2D();
        s1.displayGradeTable(grades);
        
        double rowAvg = s1.calculateRowAverage(grades, 0);
        System.out.println("Row 0 average: " + rowAvg);
    }

    }
