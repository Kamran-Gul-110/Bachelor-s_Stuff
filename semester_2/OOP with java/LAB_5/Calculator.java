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

	// Task 2
	boolean compare(Calculator other){
		return (this.result > other.result) ? true : false;
	}
	Calculator addResult(Calculator other){
		Calculator calc = new Calculator();

		calc.result = this.result + other.result;
		return calc;
	}
	Calculator createCopy(){
		Calculator calc = new Calculator();
		calc.result = this.result;
		return calc;
	}
	boolean isEqual(Calculator other){
		return (this.result == other.result) ? true : false;
	}
}

class Main {
    public static void main(String[] args) {
    	// Task 1
        Calculator calc1 = new Calculator(15.78);
        Calculator calc2 = new Calculator(10.5);
        /*
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
        */

        // Task 2

        System.out.print("\nResult of 1 is > 2: "+calc1.compare(calc2));
        Calculator results = calc1.addResult(calc2);
        System.out.print("\n\nResult 1 + Result 2 = "+ results.getResult());
        Calculator calc3 = calc1.createCopy();
        System.out.println("\n\nCopied result: "+calc3.getResult());
        boolean result = calc2.isEqual(calc1);
        System.out.println("\nIs result equal: "+result);




    }
}