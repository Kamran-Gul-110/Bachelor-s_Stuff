class TemperatureConverter{
	private double temp;
	TemperatureConverter(){
		this.temp=0;
	}
	TemperatureConverter(double temp){
		this.temp = temp;
	}
	double celsiusToFahrenheit(double celsius){
		return (celsius * 9/5.0) +32;
	}
	double fahrenheitToCelsius(double fahrenheit){
		return (fahrenheit-32)*(5/9.0);
	}
	double[] convertArray(double[] temps, String type){
		double[] arr = new double[2];
		if(type=="celsius"){
			for(int i=0;i<2;i++){
			arr[i] = celsiusToFahrenheit(temps[i]);
		}
	}
		else if(type=="fahrenheit"){
			for(int i=0;i<2;i++){
			arr[i] = fahrenheitToCelsius(temps[i]);
		}
		}
		else{
			for(int i=0;i<2;i++){
			arr[i] = 0;
		}
	}
	return arr;
	}
	String getTemperatureStatus(double temp){
		return (temp>25) ? "Hot" : "Cold"; 
	}
	double convertWithType(double temp, char type){
		switch(type){
		case 'C':
			return celsiusToFahrenheit(temp);
		case 'F':
			return fahrenheitToCelsius(temp);
		}
		return 0;
	}
}

class main{
	public static void main(String[] args){
		TemperatureConverter cal = new TemperatureConverter(50.5);
		double cTof = cal.celsiusToFahrenheit(72.5);
		System.out.printf("\nCelsius to Fahrenheit: %.2f\n",cTof);

		double fToc = cal.fahrenheitToCelsius(99.34);
		System.out.printf("\nFahrenheit to Celsius: %.2f\n",fToc);

		System.out.println("\nConverting Array...");
		double[] array = {7.3, 72.5};
		double[] resultArray = cal.convertArray(array,"celsius");
		for(double r : resultArray){
			System.out.print(r + " ");
		}
	String status = cal.getTemperatureStatus(20);
	System.out.printf("\n\nCurrent Status: %s",status);

	double typeConvert = cal.convertWithType(98,'F');
	System.out.printf("\n\nConverted Result: %.2f",typeConvert);
	}
}