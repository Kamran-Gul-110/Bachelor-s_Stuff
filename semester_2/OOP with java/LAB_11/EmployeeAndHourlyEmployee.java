abstract class Employee{
	private String name;
	private String employeeId;
	Employee(String name,String employeeId){
		this.name= name;
		this.employeeId = employeeId;
	}
	public abstract double monthlyPay();

	void display(){
		System.out.printf("Name: %s\nEmployee Id: %s\n",name,employeeId);
	}
}
class HourlyEmployee extends Employee{
	private double hoursWorked;
	private double hourlyRate;
	HourlyEmployee(String name,String employeeId,double hoursWorked, double hourlyRate){
		super(name,employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	public double monthlyPay(){
		return hourlyRate * hoursWorked;
	}
}
class Main{
	public static void main(String[] args){
		HourlyEmployee e = new HourlyEmployee("Ali","E102",80,50);
		e.display();
		System.out.print("Monthly Pay: "+e.monthlyPay());
	}
}