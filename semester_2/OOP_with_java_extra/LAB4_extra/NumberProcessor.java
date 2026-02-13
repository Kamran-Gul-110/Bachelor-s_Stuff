class NumberProcessor{
	private int[] numbers;

	NumberProcessor(int[] numbers){
		this.numbers = numbers;
	}

	double[] getStatistics(){
		double avg = 0;
		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;

		for(int i=0;i<numbers.length;i++){
			if(numbers[i] > max){
				max = numbers[i];
			}
			if(numbers[i] < min){
				min = numbers[i];
			}

			sum+=numbers[i];
		}
		avg = sum/numbers.length;

		double statArray[] = {avg,max,min,sum};
		return statArray; 
	}
	int[] filterEvenNumbers(){
		int ind=0;
		int evenCount=0;
		// First counting number of even numbers to create that much array to avoid array out of bound
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]%2==0){
				evenCount++;
			}
		}
		int[] evenArray = new int[evenCount];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]%2==0){
				evenArray[ind] = numbers[i];
				ind++;
			}
		}
		return evenArray;
	}
	int findNumber(int target){
		for(int i=0; i<numbers.length;i++){
			if(numbers[i] == target){
				return i;
			}
		}
		return -1;
	}
	int[] sortArray(){
		for(int i =0;i<numbers.length-1;i++){
			for(int j=0;j<numbers.length -1-i;j++){
				int temp = numbers[j];
				if(numbers[j+1]<numbers[j]){
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		return numbers;
	}
	double[] convertToDoubleArray(){
		double converted[]= new double[numbers.length];
		for(int j=0;j<numbers.length;j++){
				converted[j] = (double)numbers[j];
				}
		return converted;
	}
	int[][] createMultiplicationTable(int n){
		int[][] matrix = new int[10][2];
		for(int i=0;i<10;i++){
			matrix[i][0] = n;
		}
		for(int i=0;i<10;i++){
			for(int j=1;j<2;j++){
				matrix[i][j] = n * (i+1);
			}
		}
		return matrix;
	}
	void displayTable(int[][] table, int num){
		for(int i=0;i<10;i++){
			System.out.printf("%d x %d = %d",num,i+1,table[i][1]);
			System.out.print("\n");
		}
	}
}

class Main{
	public static void main(String[] args){
		int numbers[] = {3,5,6,1,4,2,8,7,9};
		NumberProcessor number = new NumberProcessor(numbers);

		// Getting Statistics
		System.out.println("===== Array Statistics =====");
		double statistics[] = number.getStatistics();
		System.out.printf("Average: %.2f\n",statistics[0]);
		System.out.printf("Maximum: %.2f\n",statistics[1]);
		System.out.printf("Minimum: %.2f\n",statistics[2]);
		System.out.printf("Sum: %.2f\n",statistics[3]);

		// Getting Even numbers from array
		System.out.println("===== Even Numbers in Array =====");
		int evenArray[] = number.filterEvenNumbers();
		for(int i: evenArray){
			System.out.printf("%d ",i);
		}

		// Getting targeted number index
		System.out.println("\n===== Finding Number =====");
		int index = number.findNumber(5);
		System.out.printf("Number found at index: %d",index);

		// Sorting Array (Bubble sort)
		System.out.println("\n===== Sorted Array =====");
		int sortedArray[] = number.sortArray();
		for(int i: sortedArray){
			System.out.print(i + ", ");
		}
		// Converting array to double
		System.out.println("\n===== converted array =====");
		double converted[] = number.convertToDoubleArray();
		for(double i: converted){
			System.out.print(i + ", ");
		}

		// creating table
		int num = 21;
		int[][] matrix = number.createMultiplicationTable(num);

		// Printing table
		System.out.println("\n===== Table =====");
		number.displayTable(matrix,num);
	}
}