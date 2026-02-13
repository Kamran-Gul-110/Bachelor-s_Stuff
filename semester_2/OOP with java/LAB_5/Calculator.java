class Calculator{
	// Task 1
	private double result;

	Calculator(){
		this.result = 0;
	}
	Calculator(double result){
		this.result = result;
	}
	int add(int a,int b){
		return a+b;
	}
	double add(double a,double b){
		return a+b;
	}
	int add(int a,int b, int c){
		return a+b+c;
	}
	int multiply(int a,int b){
		return a*b;
	}
	double multiply(double a,double b){
		return a*b;
	}
	double getResult(){
		return this.result;
	}
	void reset(){
		this.result = 0;
	}

}

class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator(10.5);
        
        System.out.print("\nAdding integer (a,b): ");
        System.out.println(calc2.add(2,3));

        System.out.print("\nAdding double (a,b): ");
        System.out.printf("%.2f",calc2.add(5.3,4.1));

        System.out.print("\n\nAdding integer (a,b,c): ");
        System.out.println(calc2.add(3,5,7));

        System.out.print("\nMultiplying integer (a,b): ");
        System.out.println(calc2.multiply(2,3));

        System.out.print("\nMultiplying double (a,b): ");
        System.out.printf("%.2f",calc2.multiply(5.3,4.1));

        System.out.print("\n\nResult: ");
        System.out.print(calc2.getResult() + "\n\n");



    }
}