class third{

	static boolean arrayBalanceChecker(int[] arr){
		int evenSum =0;
		int oddSum=0;
		for(int i=0; i<5;i++){
			if(arr[i] % 2 == 0){
				evenSum = evenSum + arr[i];
			}
			else{
				oddSum = oddSum + arr[i];
			}
		}

		if(evenSum == oddSum){
			return true;
		}
		else return false;
	}

	public static void main(String[] args){
		int[] arr = {5,2,4,4,5};
		boolean result = arrayBalanceChecker(arr);
		System.out.print(result);
	}
}