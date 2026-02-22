class GradeManager{
	private String studentName;
	private String studentId;
	private double[][] subjectGrades = new double[3][3];
	private String[] subjectNames;

	GradeManager(String studentName,String studentId,String[] subjectNames){
		this.studentName = studentName;
		this.studentId = studentId;
		this.subjectNames = subjectNames;
	}
	// void setSubjectGrades(){
	// 	subjectGrades[0][0] = 1;
    //     subjectGrades[0][1] = 80;
    //     subjectGrades[0][2] = 40;

    //     subjectGrades[1][0] = 2;
    //     subjectGrades[1][1] = 76;
    //     subjectGrades[1][2] = 92;

    //     subjectGrades[2][0] = 3;
    //     subjectGrades[2][1] = 70;
    //     subjectGrades[2][2] = 95;
	// }
	void addGrade(String name, double[] grades){
		for(int i=0;i<subjectGrades.length;i++){
			if(subjectNames[i].equals(name)){
				for(int j=0;j<subjectGrades[i].length;j++){
					subjectGrades[i][j] = grades[j];
				}
			}
		}
	}

	double getSubjectAverage(String name){
		double sum=0;
		int colSize = 0;
		int rowSize = subjectGrades.length;
		for(int i=0;i<rowSize;i++){
			colSize = subjectGrades[i].length;
			if(subjectNames[i].equals(name)){
				for(int j=0;j<colSize;j++){
					sum += subjectGrades[i][j];
				}
			}

		}
	return sum/colSize;
	}
	double getOverallAverage(){
		double sum = 0;
		for(int i=0;i<subjectGrades.length;i++){
			for(int j=0;j<subjectGrades[i].length;j++){
				sum += subjectGrades[i][j];
			}
		}
		return sum/(subjectGrades.length * subjectGrades[0].length);
	}
	char getLetterGrade(double average){
		if (average >= 90) return 'A';
		else if (average >= 80) return 'B';
		else if (average >= 70) return 'C';
		else if (average >= 60) return 'D';
		else return 'F';
	}
	String getBestSubject(){
		double arr[] = {getSubjectAverage("M"),getSubjectAverage("P"),getSubjectAverage("B")};
		if(arr[0] > arr[1] && arr[0] > arr[2]){
			return "Math";
		}
		else if(arr[1] > arr[0] && arr[1] > arr[2]){
			return "Physics";
		}
		else if(arr[2] > arr[0] && arr[2] > arr[1]){
			return "Biology";
		}
		else 
			return "error";
	}
	String getWorstSubject(){
		double arr[] = {getSubjectAverage("M"),getSubjectAverage("P"),getSubjectAverage("B")};
		if(arr[0] < arr[1] && arr[0] < arr[2]){
			return "Math";
		}
		else if(arr[1] < arr[0] && arr[1] < arr[2]){
			return "Physics";
		}
		else if(arr[2] < arr[0] && arr[2] < arr[1]){
			return "Biology";
		}
		else 
			return "error";
	}
	boolean isPassing(){
		if(getOverallAverage()>60){
			return true;
		}
		return false;
	}
	void getReport(){
		 System.out.printf("\n----- %s -----",this.studentName);
		System.out.printf("\nMath Average:    %.2f\n",  getSubjectAverage("M"));
		System.out.printf("Physics Average: %.2f\n", getSubjectAverage("P"));
		System.out.printf("Biology Average: %.2f\n\n", getSubjectAverage("B"));
		System.out.printf("Overall Average: %.2f\n\n", getOverallAverage());
		
		System.out.println("Grade Obtained: "+ getLetterGrade(getOverallAverage()));

		System.out.println("\nBest Subject: "+ getBestSubject());
		System.out.println("Worst Subject: "+ getWorstSubject());
		System.out.println("\nIs Passing: "+ isPassing());
	}

}
class Main{
	public static void main(String[] args){
		String[] arr = {"M","P","B"};
		GradeManager std1 = new GradeManager("kamran","123",arr);
		std1.addGrade("M", new double[]{92.4,99.1,93.9});
		std1.addGrade("P", new double[]{95.5,89.3,88.7});
		std1.addGrade("B", new double[]{70.6,76.2,83.7});
		std1.getReport();

		System.out.println("\nx-x-x-x-x-x-x-x-x-x-x-x-x");
		GradeManager std2 = new GradeManager("Ali","123",arr);
		std2.addGrade("M", new double[]{9.4,9.1,9.9});
		std2.addGrade("P", new double[]{90.5,8.3,8.7});
		std2.addGrade("B", new double[]{70.6,6.2,8.7});
		std2.getReport();
		
	}
}