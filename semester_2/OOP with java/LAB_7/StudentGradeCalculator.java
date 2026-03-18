class StudentGradeCalculator {
 private String[] studentNames = new String[10];
 private double[] studentGrades = new double[10];
 private String[] subjectNames;
 private double[][] grades = new double[10][10];
 private int studentCount = 0;
 public StudentGradeCalculator(String[] subjectNames) {
 this.subjectNames = subjectNames;
 }
 // Lab 1: Variables & Arrays
 public void addStudent(String name) {
 if (studentCount < 10) {
 studentNames[studentCount] = name;
 studentCount++;
 }
 }
 public void addGrade(int studentIndex, int subjectIndex, double grade) {
 if (studentIndex < studentCount && subjectIndex < subjectNames.length) {
 grades[studentIndex][subjectIndex] = grade;
 }
 }
 public double[] getAllGrades(int studentIndex) {
 double[] studentAllGrades = new double[subjectNames.length];
 for (int i = 0; i < subjectNames.length; i++) {
 studentAllGrades[i] = grades[studentIndex][i];
 }
 return studentAllGrades;
 }
 public double calculateAverage(int studentIndex) {
 double sum = 0;
 for (int i = 0; i < subjectNames.length; i++) {
 sum += grades[studentIndex][i];
 }
 double avg = sum / subjectNames.length;
 studentGrades[studentIndex] = avg; // Store average
 return avg;
 }
 // Lab 1: Type Conversion
 public double convertToPercentage(double grade) {
 return (grade / 4.0) * 100.0;
 }
 public String getGradeAsString(int studentIndex) {
 return String.valueOf(studentGrades[studentIndex]);
 }
 // Lab 2: Methods & Control Structures
 public char getLetterGrade(int studentIndex) {
 int avg = (int) studentGrades[studentIndex] / 10;
 switch (avg) {
 case 10:
 case 9: return 'A';
 case 8: return 'B';
 case 7: return 'C';
 case 6: return 'D';
 default: return 'F';
 }
 }
 public boolean isPassing(int studentIndex) {
 return (studentGrades[studentIndex] >= 60) ? true : false;
 }
 public String getGradeStatus(int studentIndex) {
 double avg = studentGrades[studentIndex];
 if (avg >= 90) return "Excellent";
 else if (avg >= 70) return "Good";
 else if (avg >= 60) return "Average";
 else return "Fail";
 }
 // Lab 2: String Operations
 public String getStudentInitials(int studentIndex) {
 String name = studentNames[studentIndex];
 int spaceIndex = name.indexOf(' ');
 if (spaceIndex != -1) {
 String first = String.valueOf(name.charAt(0));
 String last = String.valueOf(name.charAt(spaceIndex + 1));
 return first + last;
 }
 return String.valueOf(name.charAt(0));
 }
 public int searchStudent(String searchName) {
 for (int i = 0; i < studentCount; i++) {
 if (studentNames[i].toLowerCase().equals(searchName.toLowerCase())) {
 return i;
 }
 }
 return -1;
 }
 public String formatStudentInfo(int studentIndex) {
 return String.format("Name: %s, Grade: %.2f", studentNames[studentIndex], studentGrades[studentIndex]);
 }
 // Lab 2: Array Operations in Methods
 public int findTopStudent() {
 double highest = studentGrades[0];
 int topIndex = 0;
 for (int i = 1; i < studentCount; i++) {
 if (studentGrades[i] > highest) {
 highest = studentGrades[i];
 topIndex = i;
 }
 }
 return topIndex;
 }
 public int[] getPassingStudents() {
 int count = 0;
 for (int i = 0; i < studentCount; i++) {
 if (isPassing(i)) count++;
 }
 int[] passingIndices = new int[count];
 int index = 0;
 for (int i = 0; i < studentCount; i++) {
 if (isPassing(i)) {
 passingIndices[index] = i;
 index++;
 }
 }
 return passingIndices;
 }
 public double calculateClassAverage() {
 double sum = 0;
 for (int i = 0; i < studentCount; i++) {
 sum += studentGrades[i];
 }
 return (studentCount == 0) ? 0 : (sum / studentCount);
 }
}
class Main {
 public static void main(String[] args) {
 String[] subjects = {"Math", "Science", "English"};
 StudentGradeCalculator calc = new StudentGradeCalculator(subjects);

 calc.addStudent("Kamran Gul");
 calc.addGrade(0, 0, 85);
 calc.addGrade(0, 1, 90);
 calc.addGrade(0, 2, 88);

 calc.addStudent("Ali Hassan");
 calc.addGrade(1, 0, 55);
 calc.addGrade(1, 1, 60);
 calc.addGrade(1, 2, 58);

 calc.calculateAverage(0);
 calc.calculateAverage(1);

 System.out.println(calc.formatStudentInfo(0));
 System.out.println("Initials: " + calc.getStudentInitials(0));
 System.out.println("Letter Grade: " + calc.getLetterGrade(0));
 System.out.println("Status: " + calc.getGradeStatus(0));
 System.out.println("Is Passing: " + calc.isPassing(0));

 System.out.println("\nTop Student Index: " + calc.findTopStudent());
 System.out.printf("Class Average: %.2f " , calc.calculateClassAverage());
 }}