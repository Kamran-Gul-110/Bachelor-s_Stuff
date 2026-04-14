interface Payable{
	public double amountDue();
}
class HourlyService implements Payable{
	private double hours;
	private double ratePerHour;
	HourlyService(double hours, double ratePerHour){
		this.hours = hours;
		this.ratePerHour = ratePerHour;
	}
	@Override
	public double amountDue(){
		return hours * ratePerHour;
	}
}
class Main{
	public static void main(String[] args){
		Payable p = new HourlyService(12,65);
		System.out.print("Amount Due: "+ p.amountDue());
	}
}