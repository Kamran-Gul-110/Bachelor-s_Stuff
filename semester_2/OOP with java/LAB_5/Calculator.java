class Calculator{
	// Task 1
	private double result;
	static int operationCount;
	Calculator(){
		this.result = 0;
	}
	Calculator(double result){
		this.result = result;
	}
	
	int add(int a,int b){
		operationCount++;
		return a+b;

	}
	double add(double a,double b){
		operationCount++;
		return a+b;
	}
	int add(int a,int b, int c){
		operationCount++;
		return a+b+c;
	}
	int multiply(int a,int b){
		operationCount++;
		return a*b;
	}
	double multiply(double a,double b){
		operationCount++;
		return a*b;
	}
	double getResult(){
		operationCount++;
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

	// Task 3

	static int getOperationCount(){
		return operationCount;
	}
	private void validateInput(double value){
		if(value>Double.MIN_VALUE && value<Double.MAX_VALUE){
			System.out.println("\nInput is valid");
		}
		else 
			System.out.println("\nInput is not valid");
	}
	protected String getInternalState(){
		String str = String.valueOf(result) +" ...|... "+ String.valueOf(operationCount);
		return str;
	}

	// Task 4
	static final double MAX_RESULT= 1000000;
	final String calculatorId="";
	void validateResult(){
		if(this.result > MAX_RESULT){
			System.out.println("\nResult exceeded max result");
		}
		else 
			System.out.println("\nResult is valid");
	}
	String formatResult(){
		String str = String.format("Your result is: %.2f",this.result);
		return str;
	}
	int parseAndCalculate(String str){
		int a = Integer.parseInt(str.substring(0,1));
		int b = Integer.parseInt(str.substring(2,str.length()));
		return a + b;
	}

	static boolean equals(String str1,String str2){
		if(str1.equals(str2)){
			return true;
		}
		return false;
	}
	static int length(String str){
		return str.length();
	}
	static char charAt(String str,int a){
		return str.charAt(a);
	}
	static int indexOf(String str,char c){
		return str.indexOf(c);
	}
}

class Main {
    public static void main(String[] args) {
    	// Task 1
    	/*
        Calculator calc1 = new Calculator(15.78);
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
        */

        // Task 2
        /*
        System.out.print("\nResult of 1 is > 2: "+calc1.compare(calc2));
        Calculator results = calc1.addResult(calc2);
        System.out.print("\n\nResult 1 + Result 2 = "+ results.getResult());
        Calculator calc3 = calc1.createCopy();
        System.out.println("\n\nCopied result: "+calc3.getResult());
        boolean result = calc2.isEqual(calc1);
        System.out.println("\nIs result equal: "+result);
	    */

	    // Task 3
	    /*
        int operationCount = calc2.getOperationCount();
        System.out.printf("\nThere are %d operations performed overall\n",operationCount);

        String getInternalState = calc2.getInternalState();
        System.out.print("Internal state: " + getInternalState);
		*/

    	// Task 4
    	Calculator calc1 = new Calculator(15.78);
    	calc1.validateResult();

    	System.out.print("Formatted Result =>   ");
    	String str = calc1.formatResult();
    	System.out.println(str);

    	System.out.print("Result of parsing string ('2+3') =>  ");
    	String s = "3+2";
    	int result = calc1.parseAndCalculate(s);
    	System.out.print(result);

    	System.out.print("\nLength of String => ");
    	System.out.print(Calculator.length("What is your name?"));
    	System.out.print("\nIs Strings equal? => ");
    	System.out.print(Calculator.equals("kamran","kamran"));
    	System.out.print("\nCharacter at index 5 => ");
    	System.out.print(Calculator.charAt("Kamran",5));
    	System.out.print("\nIndex of Character m => ");
    	System.out.print(Calculator.indexOf("kamran",'m'));


    }
}