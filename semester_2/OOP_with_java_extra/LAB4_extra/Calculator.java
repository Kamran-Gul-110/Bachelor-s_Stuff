class Calculator{
	private double num1;
	private double num2;

	Calculator(){
		this.num1 = 0;
		this.num2 = 0;
	}
	Calculator(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	void getNum1(){
		System.out.print(num1);
	}
	void getNum2(){
		System.out.print(num1);
	}
	void setNum1(double num1){
		this.num1 = num1;
	}
	void setNum2(double num2){
		this.num2 = num2;
	}
	
	int add(int a,int b){
		return a+b;
	}
	double add(double a,double b){
		return a+b;
	}
	int add(int a, int b, int c){
		return a+b+c;
	}
	int subtract(int a,int b){
		return a-b;
	}
	double subtract(double a,double b){
		return a-b;
	}
	int subtract(int a, int b, int c){
		return a-b-c;
	}
	int multiply(int a,int b){
		return a*b;
	}
	double multiply(double a,double b){
		return a*b;
	}
	int multiply(int a, int b, int c){
		return a*b*c;
	}
	int divide(int a,int b){
		return a+b;
	}
	double divide(double a,double b){
		return a+b;
	}
	int divide(int a, int b, int c){
		return a+b+c;
	}
}
class main{
	static String[] getCalculationHistory(){
		String[] str= new String[12];
		Calculator cal = new Calculator();
		str[0] = String.valueOf(cal.add(2,3));
		str[1] = String.valueOf(cal.add(2.1,3.4));
		str[2] = String.valueOf(cal.add(5,1,8));

		str[3] = String.valueOf(cal.subtract(4,3));
		str[4] = String.valueOf(cal.subtract(5.6,8.8));
		str[5] = String.valueOf(cal.subtract(11,34,2));

		str[6] = String.valueOf(cal.multiply(6,3));
		str[7] = String.valueOf(cal.multiply(2.3,7.9));
		str[8] = String.valueOf(cal.multiply(5,1,8));

		str[9] = String.valueOf(cal.divide(5,1));
		str[10] = String.valueOf(cal.divide(3.2,4.6));
		str[11] = String.valueOf(cal.divide(7,3,4));

		return str;
	}
	
	public static void main(String[] args){
		String[] str = getCalculationHistory();

		int i=0;
		for(int j=0; j<str.length;j++){
			System.out.print(str[j] + " ");
			i++;
			if(i==3){
				System.out.print("\n");
				i=0;
			}
		}
		

	}
}