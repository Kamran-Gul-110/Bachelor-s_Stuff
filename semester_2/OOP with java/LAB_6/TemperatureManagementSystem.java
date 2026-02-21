class TemperatureMonitor{
	private String roomName;
	private double currentTemperature;
	private double minTemperature;
	private double maxTemperature;
	double[] temperatureHistory = new double[10];

	private int count = 0; // this is later used in circular array logic
	TemperatureMonitor(String roomName,double minTemp,double maxTemp, double currentTemperature){
		this.roomName = roomName;
		this.maxTemperature = maxTemp;
		this.minTemperature = minTemp;
		this.currentTemperature = currentTemperature;
	}
	void recordTemperature(double temp){
		int ind = count % temperatureHistory.length;
		temperatureHistory[ind] = temp;
		count++;
	}
	boolean isTemperatureNormal(){
		if(this.currentTemperature<= maxTemperature && this.currentTemperature>=minTemperature){
			return true;
		}
		return false;
	}
	String getTemperatureStatus(){
		if(this.currentTemperature<minTemperature){
			return "Too Cold";
		}
		else if(this.currentTemperature>maxTemperature){
			return "Too Hot";
		}
		else 
			return "Normal";
	}
	double getAverageTemperature(){
		double sum = 0;
		for(int i=0;i<temperatureHistory.length;i++){
			sum+=temperatureHistory[i];
		}
		double avg = sum/temperatureHistory.length;
		return avg;
	}
	double getMaxRecordedTemperature(){
		double max = temperatureHistory[0];
		for(int i=1;i<temperatureHistory.length;i++){
			if(temperatureHistory[i] > max){
				max = temperatureHistory[i];
			}
		}
		return max;
	}
	double getMinRecordedTemperature(){
		double min = temperatureHistory[0];
		for(int i=1;i<temperatureHistory.length;i++){
			if(temperatureHistory[i] < min){
				min = temperatureHistory[i];
			}
		}
		return min;
	}
	double[] getTemperatureAlerts(){
		double alerts[] = new double[temperatureHistory.length];
		for(int i=0;i<temperatureHistory.length;i++){
			if(temperatureHistory[i]>25){
				alerts[i] = temperatureHistory[i];
			}
		}
		return alerts;
	}
	//This method is first updating the current temp and...
	//...then call the recordTemperature method to record it in circular array
	void updateTemperature(double temp){ 
		currentTemperature = temp;
		recordTemperature(temp);
	}
	void updateTemperature(double[] temp){ 
		for(int i=0;i<temp.length;i++){
			recordTemperature(temp[i]);
	}}
}

class Main{
	public static void main(String[] args){
	TemperatureMonitor room1 = new TemperatureMonitor("room1",15,25,28);
	room1.recordTemperature(18.2);
	room1.recordTemperature(29.7);
	room1.recordTemperature(30.4);
	room1.recordTemperature(14.6);
	room1.recordTemperature(25.5);
	room1.recordTemperature(24.1);
	room1.recordTemperature(22.3);
	room1.recordTemperature(21.9);
	room1.recordTemperature(20.8);
	room1.recordTemperature(10.6);
	room1.recordTemperature(32.7);

	room1.updateTemperature(34.3);

	System.out.println("\n===== Temperature History =====");
	for(double i : room1.temperatureHistory){
		System.out.print(i + " | ");
	}

	boolean isTempNormal = room1.isTemperatureNormal();
	System.out.println("\n\nIs Current Temperature is normal? "+isTempNormal);

	if(!isTempNormal){
	String tempStatus = room1.getTemperatureStatus();
	System.out.println("Current Status: "+ tempStatus);
	}

	double average = room1.getAverageTemperature();
	System.out.println("\nAverage of Recorded Temperatures: "+ average);

	System.out.println("Maximum Temperature recorded: " + room1.getMaxRecordedTemperature());
	System.out.println("Minimum Temperature recorded: " + room1.getMinRecordedTemperature());

	System.out.println("\n===== Temperature Alerts =====");
	double temperatureAlerts[] = room1.getTemperatureAlerts();
	for(double i: temperatureAlerts){
		if(i>0)
		System.out.print(i + " | ");
	}
	
}
}