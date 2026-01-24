class sixth{
	static int arrayPeakFinder(int[] arr){
		int largest = arr[0];
		int ind = 0;

		for(int i=1;i<5;i++){
			if(arr[i]>largest){
				largest = arr[i];
				ind = i;
			}
		}
		return ind;
	}


	public static void main(String[] args){
		int[] array = {0,9,15,4,8};
		int result = arrayPeakFinder(array);
		System.out.print("index: " + result);
	}
}